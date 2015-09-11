package CamadaView;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import CamadaConexao.conexao;
import CamadaControle.ControleBanco;
import CamadaControle.ControleLoja;
import CamadaDao.ConexaoLoja;
import CamadaModel.Banco;
import CamadaModel.Loja;


public class TelaBanco extends JFrame{
	
	Calendar data;
	public static int dia;
	public static int mes;
	public static int ano;
	public static int verificafuncao = 0;
	public static int sequencia;
	public static int recebsequencia;
	
	JPanel p;
	JPanel p1;
	JButton Gravar  																	= new JButton();
	JButton cancelar																	= new JButton();
	JButton pesquisa																	= new JButton();
	JButton modificar																	= new JButton();
	JButton excluir																		= new JButton();
	JToolBar menu																		= new JToolBar();
	
	JLabel codigo 																		= new JLabel("Codigo");
	JLabel nome 																		= new JLabel("Nome do Banco");
	JLabel agencia 																		= new JLabel("Agencia");
	JLabel conta																		= new JLabel("Conta");
	JLabel obs 																			= new JLabel("Observação:");
	JLabel dat 																			= new JLabel("Data Cadatro :");
	
	public  JTextField codigo_b												 			= new JTextField();
	public  JTextField nome_b 															= new JTextField();
	public  JTextField agencia_b 														= new JTextField();
	public  JTextField conta_b												 			= new JTextField();
	public  JTextField obs_b															= new JTextField();
	public  JTextField data_cadastro 													= new JTextField();

	public TelaBanco() {
		// TODO Auto-generated constructor stub
	//	super("", true, true, false, true);
		 setContentPane(componentes());
		
		 setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 setSize(508,400);
		 setTitle("Tela Bancos");
		 setVisible(true);
		 setResizable(false);
		 
		 setLocation(110,20); 
		
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 Dimension frameSize = getSize();
		 setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
	}
	public Container componentes(){
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		recebsequencia = verificacao(sequencia);
		
		data = Calendar.getInstance();		dia = data.get(Calendar.DATE);				mes = data.get(Calendar.MONTH);
		ano = data.get(Calendar.YEAR);		mes= mes+1;
		dat.setLocation(400, 0);														dat.setSize(80, 20);		
		data_cadastro = new JTextField(dia+" / "+mes+" / "+ano);
		data_cadastro.setLocation(400,17);												data_cadastro.setSize(80,20);
		data_cadastro.setEditable(false);	
		codigo.setLocation(20,51);														codigo.setSize(47,20);
		codigo_b = new JTextField(""+recebsequencia);
		codigo_b.setLocation(20,69);													codigo_b.setSize(70,20);
		nome.setLocation(100,51);														nome.setSize(100,20);
		nome_b.setLocation(100,69);														nome_b.setSize(380,20);
		agencia.setLocation(20,100);													agencia.setSize(110,20);
		agencia_b.setLocation(20,121);													agencia_b.setSize(180,20);
		conta.setLocation(240,100);														conta.setSize(110,20);
		conta_b.setLocation(239,121);													conta_b.setSize(241,20);
		obs.setLocation(20,152);														obs.setSize(100,20);
		obs_b.setLocation(20,183);														obs_b.setSize(460,20);
		cancelar.setLocation(0, 0);														cancelar.setSize(0, 0);
		cancelar.setToolTipText("Cancelar Processo");
		menu.setLocation(0,0);															menu.setSize(502,40);
		modificar.setLocation(0, 0);													modificar.setSize(0, 0);
		modificar.setToolTipText("Novo Cadastro");
		excluir.setLocation(0,0);														excluir.setSize(0, 0);
		excluir.setToolTipText("Excluir Cadastro");		
		menu.setLocation(0,0);															menu.setSize(788,40);
//=======================================================================================================================================//		
	    eventos();
	    
		ImageIcon ok1 = new ImageIcon(getClass().getResource("../Imagens/img/Cliente/salve.png"));	
		ok1.setImage(ok1.getImage().getScaledInstance(20, 15, 15));			
		
		ImageIcon can = new ImageIcon(getClass().getResource("../Imagens/img/Cliente/cancel.png"));	
		can.setImage(can.getImage().getScaledInstance(20, 15, 15));			
		cancelar.setIcon(can);
		
		ImageIcon nov = new ImageIcon(getClass().getResource("../Imagens/img/Cliente/nov.png"));	
		nov.setImage(nov.getImage().getScaledInstance(20, 15, 15));			
		modificar.setIcon(nov);
		
		ImageIcon exc = new ImageIcon(getClass().getResource("../Imagens/img/Cliente/del.png"));	
		exc.setImage(exc.getImage().getScaledInstance(20, 15, 15));			
		excluir.setIcon(exc);
		Gravar.setLocation(0, 0);														
		Gravar.setSize(0, 0);
		Gravar.setToolTipText("Salvar os Dados");
		Gravar.setIcon(ok1);
		menu.add(Gravar);  			
		
		menu.add(modificar);menu.add(cancelar);   			menu.add(excluir);
//=======================================================================================================================================//

		p = new JPanel();
		p.setLayout(null);
		p.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
		p.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Funcionario"));
		p.setSize(550,330);
		p.setLocation(05,50);
		
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
		p1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Complementares"));
		p1.setSize(220,330);
		p1.setLocation(560,50);
//=======================================================================================================================================//	    
		
		panel.add(codigo_b);		panel.add(nome_b);		panel.add(agencia_b);			panel.add(conta_b);	 
		panel.add(obs_b);			panel.add(codigo);		panel.add(nome);				panel.add(agencia);	 
		panel.add(conta);			panel.add(obs);			panel.add(data_cadastro);		panel.add(dat);		 
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
		Banco banco = new Banco();
		
			int cod;
			cod=Integer.parseInt(codigo_b.getText());
			banco.setId(cod);
			banco.setAgencia(agencia_b.getText());
			banco.setConta(conta_b.getText());
			banco.setNome(nome_b.getText());
			banco.setObs(obs_b.getText());
			banco.setData_cadastro(data_cadastro.getText());
			
			ControleBanco control = new ControleBanco();
			control.ControleEscolhaCadastroaba1(banco);
			
			if(ConexaoLoja.retorno==1){
			       JOptionPane.showMessageDialog(null, " Gravação Concluida com Sucesso ");
			}else if(ConexaoLoja.retorno==2){
				   JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			}
	}
	public void retorno(Banco banco){
		
		codigo_b.setText(""+banco.getId());
		agencia_b.setText(""+banco.getAgencia());
		data_cadastro.setText(""+banco.getData_cadastro());
		conta_b.setText(""+banco.getConta());
		nome_b.setText(""+banco.getNome());
		obs_b.setText(""+banco.getObs());

		
	}
	public int verificacao(int sequencia ){
		conexao conexao = new conexao();
		conexao.conect();
		for(int i = 1; i < 6; i++){
			try{	
				String SQL = "select *from banco where codigo=?";
				
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
