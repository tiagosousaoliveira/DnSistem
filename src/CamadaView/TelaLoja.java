package CamadaView;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import CamadaConexao.conexao;
import CamadaControle.ControleLoja;
import CamadaDao.ConexaoLoja;
import CamadaModel.Loja;

public class TelaLoja extends JFrame{
	
	Calendar data;
	public static int dia;
	public static int mes;
	public static int ano;
	public static int verificafuncao = 0;
	public static int sequencia;
	public static int recebsequencia;
	
	JPanel p;
	JPanel p1;
	JButton Gravar  																		= new JButton();
	JButton cancelar																		= new JButton();
	JButton pesquisa																		= new JButton();
	JButton modificar																		= new JButton();
	JButton excluir																			= new JButton();
	JToolBar menu																			= new JToolBar();
	
	JLabel codig 																			= new JLabel("Codigo");
	JLabel razaosocial 																		= new JLabel("Razao Social");
	JLabel data_cadast 																		= new JLabel("Data Cadastro");
	JLabel ende 																			= new JLabel("Endereço");
	JLabel numero 																			= new JLabel("Numero");
	JLabel obs 																				= new JLabel("Observação:");
	JLabel complemento 																		= new JLabel("Complemento:");
	
	public  JTextField codigo 																= new JTextField();
	public  JTextField razao 																= new JTextField();
	public  JTextField data_cadastro 														= new JTextField();
	public  JTextField endereco 															= new JTextField();
	public  JTextField numer 																= new JTextField();
	public  JTextField obs_b 																= new JTextField();
	public  JTextField comple 																= new JTextField();
	
	public TelaLoja() {

		setContentPane(complementos());
		

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(500,400);
		setTitle("Cadastro de Lojas");
		setVisible(true);
		setResizable(false);
		
		setLocation(110,20); 
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
	    setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
	}
	public Container complementos(){
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		data = Calendar.getInstance();														dia = data.get(Calendar.DATE);
		mes = data.get(Calendar.MONTH);														ano = data.get(Calendar.YEAR);
		mes = mes +1;
		data_cadastro = new JTextField(dia+" / "+mes+" / "+ano);
		data_cadast.setLocation(404,0);														data_cadast.setSize(90,20);
		data_cadastro.setLocation(405, 17);													data_cadastro.setSize(89,20);
		data_cadastro.setEditable(false);
		recebsequencia = verificacao(sequencia);
		codig.setLocation(10,41);															codig.setSize(40,20);
		codigo = new JTextField(""+recebsequencia);
		codigo.setLocation(10,72);															codigo.setSize(70,20);
		razaosocial.setLocation(100,41);													razaosocial.setSize(100,20);
		razao.setLocation(100, 72);															razao.setSize(370,20);		
		ende.setLocation(10,92);															ende.setSize(80,20);
		endereco.setLocation(10,112);														endereco.setSize(460,20);
		numero.setLocation(10,132);															numero.setSize(80,20);
		numer.setLocation(10,152);															numer.setSize(100,20);
		complemento.setLocation(150,132);													complemento.setSize(130,20);
		comple.setLocation(150,152);														comple.setSize(320,20);
		obs.setLocation(10,183);															obs.setSize(70,20);
		obs_b.setLocation(10,208);															obs_b.setSize(460,20);
//===========================================================================================================================================\\
		eventos();
//===========================================================================================================================================\\			
		ImageIcon ok1 = new ImageIcon(getClass().getResource("../Imagens/img/Loja/salve.png"));	
		ok1.setImage(ok1.getImage().getScaledInstance(20, 15, 15));			
		
		ImageIcon can = new ImageIcon(getClass().getResource("../Imagens/img/Loja/cancel.png"));	
		can.setImage(can.getImage().getScaledInstance(20, 15, 15));			
		
		ImageIcon nov = new ImageIcon(getClass().getResource("../Imagens/img/Loja/nov.png"));	
		nov.setImage(nov.getImage().getScaledInstance(20, 15, 15));			
		
		ImageIcon exc = new ImageIcon(getClass().getResource("../Imagens/img/Loja/del.png"));	
		exc.setImage(exc.getImage().getScaledInstance(20, 15, 15));
		cancelar.setLocation(0, 0);															
		cancelar.setSize(0, 0);
		cancelar.setToolTipText("Cancelar Processo");	
		menu.setLocation(0,0);																
		menu.setSize(494,40);
		modificar.setLocation(0, 0);																
		modificar.setSize(0, 0);
		modificar.setToolTipText("Novo Cadastro");
		excluir.setLocation(0,0);															
		excluir.setSize(0, 0);
		excluir.setToolTipText("Excluir Cadastro");
		cancelar.setIcon(can);
		modificar.setIcon(nov);
		excluir.setIcon(exc);
	
	//===========================================================================================================================================\\
	panel.add(numero);		panel.add(numer);		panel.add(codig);		panel.add(obs);
	panel.add(razaosocial);	panel.add(ende);		panel.add(codigo);		panel.add(razao);			panel.add(obs_b);		
	panel.add(comple);		panel.add(complemento);	panel.add(endereco);	panel.add(data_cadastro);	panel.add(data_cadast);
	
	Gravar.setLocation(0, 0);																
	Gravar.setSize(0, 0);
	Gravar.setToolTipText("Gravar os Dados");
	Gravar.setIcon(ok1);
	menu.add(Gravar);       			
	
	menu.add(modificar);menu.add(cancelar);			menu.add(excluir);
	
	panel.add(menu);

		
		
		return panel;
	}
	public void eventos() {

		Gravar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				verificafuncao =0;
				verificafuncao = verificafuncao+1;
				
				passagem();
				
			}
		});
		modificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				verificafuncao =0;
				verificafuncao = verificafuncao+2;
				
				passagem();
			}

		});
		cancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				
			}
		});
		excluir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				verificafuncao =0;
				verificafuncao = verificafuncao+3;
				
				passagem();
			}
		});
}
	
	public void passagem(){
		Loja loja = new Loja();
		
			int cod;
			cod=Integer.parseInt(codigo.getText());
			loja.setId(cod);
			loja.setRazao(razao.getText());
			loja.setData_cadastro(data_cadastro.getText());
			loja.setEndereco(endereco.getText());
			loja.setNumero(numer.getText());
			loja.setObs(obs_b.getText());
			loja.setComplemento(comple.getText());
			
			ControleLoja control = new ControleLoja();
			control.ControleEscolhaCadastroaba1(loja);
			
			if(ConexaoLoja.retorno==1){
			       JOptionPane.showMessageDialog(null, " Gravação Concluida com Sucesso ");
			}else if(ConexaoLoja.retorno==2){
				   JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			}
	}
	public void retorno(Loja loja){
		
		codigo.setText(""+loja.getId());
		razao.setText(""+loja.getRazao());
		data_cadastro.setText(""+loja.getData_cadastro());
		endereco.setText(""+loja.getEndereco());
		numer.setText(""+loja.getNumero());
		obs_b.setText(""+loja.getObs());
		comple.setText(""+loja.getComplemento());
		
	}
	public int verificacao(int sequencia ){
			
			conexao conexao = new conexao();
			conexao.conect();

			for(int i = 1; i < 2; i++){
				
				try{
							
					String SQL = "select *from loja where codigo=?";
					
					java.sql.PreparedStatement stm = conexao.con.prepareStatement(SQL);
					
					stm.setInt(1,i);
					ResultSet rs = stm.executeQuery();
					
					if(rs.next()){
						
						String t = rs.getString("codigo");
						int s = Integer.parseInt(t);
						
						if (i > s){
							
							sequencia = i;
							return sequencia;
							
						}else{
							sequencia++;
						}
					
				   }else{
					   
					   sequencia = i;
					   return sequencia;
				   }
				}catch(SQLException e ){
					
				JOptionPane.showMessageDialog(null, "Continua dando erro");
				}
				
			}
			return sequencia;
			
		   }
	}