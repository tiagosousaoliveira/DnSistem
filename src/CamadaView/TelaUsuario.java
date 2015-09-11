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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JCheckBox;

import CamadaConexao.conexao;
import CamadaControle.ControleUsuario;
import CamadaDao.ConexaoUsuario;
import CamadaModel.Usuario;

public class TelaUsuario extends JFrame {
	


	Calendar data;
	JPanel p;
	JPanel p1;
	public static int dia;
	public static int mes;
	public static int ano;
	public static int verificafuncao = 0;
	public static String resultado; 
	public  int sequencia;
	public  int recebsequencia;
	
	public JCheckBox inativo;
	
	JButton Gravar  																	= new JButton();
	JButton cancelar																	= new JButton();
	JButton pesquisa																	= new JButton();
	JButton Modificar																		= new JButton();
	JButton excluir																		= new JButton();
	JToolBar menu																		= new JToolBar();
	JButton habilitar 																	= new JButton("Abilitar");
	
	JLabel codi 																		= new JLabel("Codigo :");
	JLabel dat 																			= new JLabel("Data Cadastro :");
	JLabel nom 																			= new JLabel("Nome :");
	JLabel end 																			= new JLabel("Endereço :");
	JLabel tel 																			= new JLabel("Telefone :");
	JLabel cod_l 																		= new JLabel("Cod_Loja :");
	JLabel loja 																		= new JLabel("Loja :");
	JLabel fun 																			= new JLabel("Cargo :");
	JLabel log 																			= new JLabel("Logon :");
	JLabel senh 																		= new JLabel("Senha :");
	JLabel comi 																		= new JLabel("Comissao :");
	JLabel vend 																		= new JLabel("Vendas :");
	JLabel mets 																		= new JLabel("Metas :");
	JLabel cpf 																			= new JLabel("CPF : ");
	JLabel rg 																			= new JLabel("RG : ");
	
	public  JTextField codigo_funcionario 												= new JTextField();
	public  JTextField data_cadastro_funcionario;
	public  JTextField nome_funcionario 												= new JTextField();
	public  JTextField endereco_funcionario 											= new JTextField();
	public  JTextField telefone_funcionario 											= new JTextField();
	public  JComboBox codigo_loja_funcionario 											= new JComboBox();
	public  JTextField loja_funcionario 												= new JTextField();
	public  JComboBox funcao_funcionario 												= new JComboBox();
	public  JTextField logon_funcionario 												= new JTextField("");
	public  JPasswordField senha_funcionario											= new JPasswordField("");
	public  JTextField comissao_funcionario 											= new JTextField();
	public  JTextField vendas_funcionario 												= new JTextField();
	public  JTextField metas_funcionario 												= new JTextField();
	public  JTextField cpf_funcionario 													= new JTextField();
	public  JTextField rg_funcionario 													= new JTextField();
 
	
	public TelaUsuario() {

		 setContentPane(componentes());

		 
		 setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 setSize(800,600);
		 setTitle("Tela Usuario");
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
		ano = data.get(Calendar.YEAR);													mes = mes+1;
		dat.setLocation(690, 01);		dat.setSize(100, 20);
		data_cadastro_funcionario = new JTextField(dia+" / "+mes+" / "+ano);
		data_cadastro_funcionario.setLocation(690,20);									data_cadastro_funcionario.setSize(80,20);
		data_cadastro_funcionario.setEditable(false);
		codi.setLocation(20,80);														codi.setSize(52,20);
		codigo_funcionario= new JTextField(""+recebsequencia);
		codigo_funcionario.setLocation(20,100);											codigo_funcionario.setSize(80,20);
		codigo_funcionario.setEditable(true);
		cod_l.setLocation(220,160);														cod_l.setSize(70,20);
		codigo_loja_funcionario.setLocation(220,182);									codigo_loja_funcionario.setSize(46,20);
	    for(int seq =1;seq<20;seq++ )codigo_loja_funcionario.addItem(seq);
	    loja.setLocation(295,160);	   													loja.setSize(100,20);
	    loja_funcionario.setLocation(295,182);	    									loja_funcionario.setSize(250 ,21);
	    loja_funcionario.setText("");
		fun.setLocation(20,160);														fun.setSize(60,20);
		funcao_funcionario.setLocation(20,182);											funcao_funcionario.setSize(180,20);
		funcao_funcionario.addItem("Vendedor");											funcao_funcionario.addItem("Gerente");
		funcao_funcionario.addItem("Motorista");										funcao_funcionario.addItem("Zelador");
	    end.setLocation(20,200);	   													end.setSize(60,20);
	    endereco_funcionario.setLocation(20,220);	    								endereco_funcionario.setSize(523,21);
	    endereco_funcionario.setText("");
	    tel.setLocation(390,120);	   													tel.setSize(60,20);
	    telefone_funcionario.setLocation(390,140);	    								telefone_funcionario.setSize(153,21);
	    telefone_funcionario.setText("");
		nom.setLocation(110,80);														nom.setSize(60,20);
		nome_funcionario.setLocation(110,100);											nome_funcionario.setSize(433,21);
		nome_funcionario.setText("");
		log.setLocation(20,240);														log.setSize(46,20);
		logon_funcionario.setLocation(20, 260);											logon_funcionario.setSize(194, 20);
		logon_funcionario.setText("");
		senh.setLocation(20,280);														senh.setSize(46,20);
		senha_funcionario.setLocation(20,300);											senha_funcionario.setSize(194,20);
		senha_funcionario.setText("");
		comi.setLocation(650,80);														comi.setSize(80,20);
		comissao_funcionario.setLocation(650,100);										comissao_funcionario.setSize(110,20);
		comissao_funcionario.setText("0");
		comissao_funcionario.setEditable(false);
		vend.setLocation(650,120);														vend.setSize(80,20);	
		vendas_funcionario.setLocation(650,140);										vendas_funcionario.setSize(110,20);
		vendas_funcionario.setText("0");
		vendas_funcionario.setEditable(false);  
		mets.setLocation(650,160);														mets.setSize(80,20);
		metas_funcionario.setLocation(650,180);											metas_funcionario.setSize(110,20);
		metas_funcionario.setText("0");
		metas_funcionario.setEditable(false);
		cpf.setLocation(20,120);														cpf.setSize(60,20);
		cpf_funcionario.setLocation(20, 140);											cpf_funcionario.setSize(182,20);
		cpf_funcionario.setText("");
	    rg.setLocation(220,120);													    rg.setSize(60,20);
	    rg_funcionario.setLocation(220,140);										    rg_funcionario.setSize(155,21);
	    rg_funcionario.setText("");
		Gravar.setLocation(0, 0);														Gravar.setSize(0, 0);
		Gravar.setToolTipText("Gravar os Dados");
		cancelar.setLocation(0, 0);														cancelar.setSize(0, 0);
		cancelar.setToolTipText("Cancelar Processo");
		menu.setLocation(0,0);															menu.setSize(788,40);
		Modificar.setLocation(0, 0);													Modificar.setSize(0, 0);
		Modificar.setToolTipText("Modificar Cadastro");
		excluir.setLocation(0,0);														excluir.setSize(0, 0);
		excluir.setToolTipText("Excluir Cadastro");										
//=======================================================================================================================================//		
	    eventos();
	    
		ImageIcon ok1 = new ImageIcon(getClass().getResource("../Imagens/img/Usuario/salve.png"));	
		ok1.setImage(ok1.getImage().getScaledInstance(20, 15, 15));			
		Gravar.setIcon(ok1);
		
		ImageIcon can = new ImageIcon(getClass().getResource("../Imagens/img/Usuario/cancel.png"));	
		can.setImage(can.getImage().getScaledInstance(20, 15, 15));			
		cancelar.setIcon(can);
		
		ImageIcon nov = new ImageIcon(getClass().getResource("../Imagens/img/Usuario/nov.png"));	
		nov.setImage(nov.getImage().getScaledInstance(20, 15, 15));			
		Modificar.setIcon(nov);
		
		ImageIcon exc = new ImageIcon(getClass().getResource("../Imagens/img/Usuario/del.png"));	
		exc.setImage(exc.getImage().getScaledInstance(20, 15, 15));			
		excluir.setIcon(exc);
		
		menu.add(Modificar);  					  menu.add(Gravar);                      menu.add(cancelar);                menu.add(excluir);
//=======================================================================================================================================//

		
		p = new JPanel();
		p.setLayout(null);
		p.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
		p.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Funcionario"));
		p.setSize(550,307);
		p.setLocation(5,50);
		
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
		p1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Complementares"));
		p1.setSize(220,307);
		p1.setLocation(560,50);
//=======================================================================================================================================//	    
		
		panel.add(codi);					  panel.add(fun);					 panel.add(nom);					panel.add(dat);					
		panel.add(log);					  	  panel.add(senh);					 panel.add(cod_l);					panel.add(mets);	
		panel.add(comi);					  panel.add(vend);					 panel.add(loja);					panel.add(end);						
		panel.add(tel);			         	  panel.add(cpf);					 panel.add(rg);						panel.add(data_cadastro_funcionario);
		panel.add(senha_funcionario);	  	  panel.add(logon_funcionario);	 	 panel.add(telefone_funcionario);	panel.add(loja_funcionario);		
		panel.add(endereco_funcionario);	  panel.add(codigo_loja_funcionario);panel.add(vendas_funcionario);		panel.add(metas_funcionario);	
		panel.add(comissao_funcionario);	  panel.add(funcao_funcionario);	 panel.add(nome_funcionario);		panel.add(codigo_funcionario);
		panel.add(cpf_funcionario);		  	  panel.add(rg_funcionario);		 panel.add(p1);						


		 habilitar.setBounds(115, 170, 83, 23);
		 p1.add(habilitar);panel.add(p);
		 
		 inativo = new JCheckBox("Inativo");
		 inativo.setBounds(289, 207, 70, 23);
		 
		 p.add(inativo);
		 panel.add(menu);
		
		return panel;
		
		
	}
	public void eventos() {
		
			habilitar.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent arg0) {
			 	//	if(){
			 			comissao_funcionario.setEditable(true);
				 		vendas_funcionario.setEditable(true);
				 		metas_funcionario.setEditable(true);
			 	/*	}else (){
			 			comissao_funcionario.setEditable(false);
				 		vendas_funcionario.setEditable(false);
				 		metas_funcionario.setEditable(false);
			 		}
			 		*/
			 	}
			 });
	
			Gravar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					verificafuncao =0;
					verificafuncao = verificafuncao+1;
					
					passagem();
					
				}
			});
			Modificar.addActionListener(new ActionListener() {
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
			Usuario usuario = new Usuario();
				
				int cod;
				cod=Integer.parseInt(codigo_funcionario.getText());
				usuario.setId(cod);
				usuario.setData(data_cadastro_funcionario.getText());
				usuario.setNome(nome_funcionario.getText());
				usuario.setEndereco(endereco_funcionario.getText());
				usuario.setTelefone(telefone_funcionario.getText());
				usuario.setCodigo_loja(codigo_loja_funcionario.getSelectedItem().toString());
				usuario.setLoja(loja_funcionario.getText());
				usuario.setFuncao(funcao_funcionario.getSelectedItem().toString());
				usuario.setLogon(logon_funcionario.getText());
				usuario.setSenha(senha_funcionario.getText());
				usuario.setComissao(comissao_funcionario.getText());
				usuario.setVendas(vendas_funcionario.getText());
				usuario.setMetas(metas_funcionario.getText());
				usuario.setRg(rg_funcionario.getText());
				usuario.setCpf(cpf_funcionario.getText());
				usuario.setInativo(inativo.isSelected());
				
				ControleUsuario control = new ControleUsuario();
				control.ControleEscolhaCadastroaba1(usuario);
				
				if(ConexaoUsuario.retorno==1){
				       JOptionPane.showMessageDialog(null, " Gravação Concluida com Sucesso ");
				}else if(ConexaoUsuario.retorno==2){
					   JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
				}
		
		}
		public void retorno(Usuario usuario){

				codigo_funcionario.setText(""+usuario.getId());
				data_cadastro_funcionario.setText(""+usuario.getData());
				nome_funcionario.setText(""+usuario.getNome());
				endereco_funcionario.setText(""+usuario.getEndereco());
				telefone_funcionario.setText(""+usuario.getTelefone());
				codigo_loja_funcionario.setSelectedItem(""+usuario.getCodigo_loja());
				loja_funcionario.setText(""+usuario.getLoja());
				funcao_funcionario.setSelectedItem(""+usuario.getFuncao());
				logon_funcionario.setText(""+usuario.getLogon());
				senha_funcionario.setText(""+usuario.getSenha());
				comissao_funcionario.setText(""+usuario.getComissao());
				vendas_funcionario.setText(""+usuario.getVendas());
				metas_funcionario.setText(""+usuario.getMetas());
				cpf_funcionario.setText(""+usuario.getCpf());
				inativo.setText(""+usuario.getInativo());
			
		}
		public int verificacao(int sequencia ){
		conexao conexao = new conexao();
		conexao.conect();
			for(int i = 1; i < 100000; i++){
				try{	
					String SQL = "select *from usuario where codigo=?";
		
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
