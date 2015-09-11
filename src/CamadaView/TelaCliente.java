package CamadaView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.swing.*;

import CamadaConexao.conexao;
import CamadaControle.ControleCliente;
import CamadaDao.ConexaoCliente;
import CamadaModel.Cliente;

public class TelaCliente extends JFrame {
	
	public static int verificafuncao = 0;
	public static int sequencia;
	public static int recebsequencia;
	Calendar data;
	int dia, mes, ano;
	
	JButton Gravar  																= new JButton();
	JButton cancelar																= new JButton();
	JButton pesquisa																= new JButton();
	JButton modificar																= new JButton();
	JButton excluir																	= new JButton();
	JToolBar menu																	= new JToolBar();
	
	JButton btnNewButton 															= new JButton("Banco");
	JButton btnNewButton_1 															= new JButton("Modif.");
	JButton btnNewButton_2 															= new JButton("Total");
	
	JLabel dat 																		= new JLabel("Data Cadatro :");
	JLabel codi 																	= new JLabel("Codigo :");
	JLabel nom 																		= new JLabel("Nome :");
	JLabel endere 																	= new JLabel("Endereço :");
	JLabel uf 																		= new JLabel("UF :");
	JLabel completo 																= new JLabel("Complemento :");
	JLabel cpf_cnpj 																= new JLabel("CPF / CNPJ :");
	JLabel rg_insc 																	= new JLabel("RG / INSC :");
	JLabel email 																	= new JLabel("Email :");
	JLabel telcontato 																= new JLabel("Tel. Contato :");
	JLabel bairro 																	= new JLabel("Bairro :");
	JLabel cidade																	= new JLabel("Cidade :");
	JLabel banco 																	= new JLabel("Banco :");
	JLabel telefone 																= new JLabel("Telefone :");
	JLabel alugueis 																= new JLabel("Alugueis :");
	JLabel alug 																	= new JLabel("ultimo Aluguel :");
	JLabel contato 																	= new JLabel("Contato :");
	JLabel mar 																		= new JLabel("Inativo");

	public  JTextField codigo_cliente												= new JTextField("");
	public  JTextField nome_cliente 												= new JTextField("");
	public  JTextField endereco 													= new JTextField("");
	public  JTextField uf_cliente													= new JTextField("");
	public  JTextField complemento_cliente											= new JTextField("");
	public  JTextField cpf_cnpj_cliente 											= new JTextField("");
	public  JTextField rg_insc_cliente 												= new JTextField("");
	public  JTextField data_cadastro_client 										= new JTextField("");
	public  JTextField bairro_cliente 												= new JTextField("");
	public  JTextField cidade_cliente 												= new JTextField("");
	public  JTextField telefone_cliente 											= new JTextField("");
	public  JTextField banco_cliente 												= new JTextField("");
	public  JTextField alugueis_clientes 											= new JTextField("");
	public  JTextField ultimo_aluguel 												= new JTextField("");
	public  JTextField contato_cliente 												= new JTextField("");
	public  JTextField telcontato_cliente											= new JTextField("");
	public  JTextField email_cliente 												= new JTextField("");
	public  JCheckBox marq 															= new JCheckBox("");

	
	public TelaCliente() {
		// TODO Auto-generated constructor stub
		

		setContentPane(extrutura());
		
		setSize(800,600);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setTitle("Cadastro de Cliente");
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = getSize();
		setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		
		
	}
	public Container extrutura(){

		JPanel frame = new JPanel();
		frame.setLayout(null);
		
		recebsequencia = verificacao(sequencia);
		
		data = Calendar.getInstance();	dia = data.get(Calendar.DATE);		mes = data.get(Calendar.MONTH);	 
		ano = data.get(Calendar.YEAR);	mes= mes+1;							dat.setLocation(700, 01);
		dat.setSize(80, 20);
		data_cadastro_client = new JTextField(dia+" / "+mes+" / "+ano);		data_cadastro_client.setSize(80,20);	
		data_cadastro_client.setEditable(false);							data_cadastro_client.setLocation(700, 19);
		cpf_cnpj.setLocation(10,69);										cpf_cnpj.setSize(80,20);
		

		

		
	//================================================================================================================================================================================\\
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
		p1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Bancarios"));
		p1.setSize(220,297);
		p1.setLocation(560,50);	
		
				btnNewButton.setBounds(10, 48, 72, 23);
				btnNewButton_1.setBounds(10, 89, 72, 23);
				btnNewButton_2.setBounds(10, 131, 72, 23);
	
				alugueis_clientes.setBounds(92, 132, 100, 20);
				alugueis_clientes.setEditable(false);
				ultimo_aluguel.setBounds(92, 90, 100, 20);
				
				ultimo_aluguel.setEditable(false);
				banco_cliente.setBounds(92, 49, 100, 20);
		
				banco_cliente.setEditable(false);
				alug.setBounds(92, 69, 100, 20);
		
				alugueis.setBounds(92, 111, 100, 20);
				banco.setBounds(92, 28, 100, 20);
	
		p1.add(btnNewButton_1);	p1.add(btnNewButton);	p1.add(btnNewButton_2);	
		p1.add(ultimo_aluguel);	p1.add(banco_cliente);	p1.add(alugueis_clientes);
		p1.add(alug);			p1.add(alugueis);		p1.add(banco);	

	//===============================================================================================================================================================================\\
				ImageIcon ok1 = new ImageIcon(getClass().getResource("../Imagens/img/Cliente/salve.png"));	
				ok1.setImage(ok1.getImage().getScaledInstance(20, 15, 15));			
		
				ImageIcon can = new ImageIcon(getClass().getResource("../Imagens/img/Cliente/cancel.png"));	
				can.setImage(can.getImage().getScaledInstance(20, 15, 15));			
				cancelar.setIcon(can);
		
				ImageIcon nov = new ImageIcon(getClass().getResource("../Imagens/img/Cliente/nov.png"));	
				nov.setImage(nov.getImage().getScaledInstance(20, 15, 15));			
				modificar.setIcon(nov);
		
				ImageIcon exc = new ImageIcon(getClass().getResource("../Imagens/img/Cliente/lixeira.png"));	
				exc.setImage(exc.getImage().getScaledInstance(20, 15, 15));			
				excluir.setIcon(exc);
		
				ImageIcon pes = new ImageIcon(getClass().getResource("../Imagens/img/Cliente/pes.png"));	
				pes.setImage(pes.getImage().getScaledInstance(20, 15, 15));			
				pesquisa.setIcon(pes);
		
				menu.setBounds(0,0,795,40);
		
				cancelar.setBounds(0, 0,0,0);
				cancelar.setToolTipText("Cancelar Processo");

				modificar.setBounds(0, 0,0,0);
				modificar.setToolTipText("Novo Cadastro");
		
				excluir.setBounds(0,0,0,0);
				excluir.setToolTipText("Excluir Cadastro");
		
				pesquisa.setBounds(0,0,0,0);
				pesquisa.setToolTipText("Pesquisar Cadastro");
				Gravar.setIcon(ok1);
		
				Gravar.setBounds(0, 0,0,0);
				
				Gravar.setToolTipText("Salvar os Dados");
				menu.add(Gravar);                    
		
		menu.add(modificar);
		menu.add(cancelar);             menu.add(excluir);
		
//================================================================================================================================================================================\\
		eventos();
//================================================================================================================================================================================\\

		
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
		p.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));
		p.setSize(550,297);
		p.setLocation(5,50);
		
			telcontato_cliente.setBounds(355, 252, 185, 20);
			p.add(telcontato_cliente);
			telefone.setBounds(355, 69, 70, 20);
			p.add(telefone);
			mar.setBounds(500, 90, 50, 20);
			p.add(mar);
			uf_cliente.setBounds(307, 129, 30, 24);
			p.add(uf_cliente);
			marq.setBounds(476, 90, 20, 20);
			p.add(marq);
			telefone_cliente.setBounds(355, 90, 120, 20);
			p.add(telefone_cliente);
			rg_insc.setBounds(187, 69, 80, 20);
			p.add(rg_insc);
			rg_insc_cliente.setBounds(186, 90, 150, 20);
			p.add(rg_insc_cliente);
			contato_cliente.setBounds(10, 252, 280, 20);
			p.add(contato_cliente);
			telcontato.setBounds(355, 231, 80, 20);
			p.add(telcontato);
			email_cliente.setBounds(10, 210, 530, 20);
			p.add(email_cliente);
			contato.setBounds(10, 231, 80, 20);
			p.add(contato);
			email.setBounds(10, 189, 60, 20);
			p.add(email);
			bairro_cliente.setBounds(10, 169, 280, 20);
			p.add(bairro_cliente);
			bairro.setBounds(10, 149, 80, 20);
			p.add(bairro);
			cidade_cliente.setBounds(355, 169, 185, 20);
			p.add(cidade_cliente);
			cidade.setBounds(355, 149, 70, 20);
			p.add(cidade);
			endereco.setBounds(10, 131, 280, 20);
			p.add(endereco);
			endere.setBounds(10, 111, 60, 20);
			p.add(endere);
			complemento_cliente.setBounds(355, 131, 185, 20);
			p.add(complemento_cliente);
			completo.setBounds(355, 111, 85, 20);
			p.add(completo);
			p.add(cpf_cnpj);
			cpf_cnpj_cliente.setBounds(10, 90, 150, 20);
			p.add(cpf_cnpj_cliente);
			codigo_cliente = new JTextField(""+recebsequencia);
			codigo_cliente.setBounds(10, 49, 75, 20);
			p.add(codigo_cliente);
			codigo_cliente.setEditable(true);
			nome_cliente.setBounds(95, 49, 445, 21);
			p.add(nome_cliente);
			nom.setBounds(95, 31, 60, 20);
			p.add(nom);
			codi.setBounds(10, 31, 60, 20);
			p.add(codi);
			uf.setBounds(315, 111, 30, 20);
			p.add(uf);
		
			frame.add(p1);					frame.add(menu);				frame.add(p);
			
		return frame;
		
	}
	public void eventos() {
		
		Gravar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				verificafuncao =0;
				verificafuncao = verificafuncao +1;

				passagem();
				
			}
		});
		
		modificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				verificafuncao =0;
				verificafuncao = verificafuncao +2;
				
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
				verificafuncao =0;
				verificafuncao = verificafuncao +3;
				
				passagem();
			}
		});
}
	public void passagem(){
		Cliente cliente = new Cliente();
			
			int cod;
			cod=Integer.parseInt(codigo_cliente.getText());
			cliente.setId(cod);
			cliente.setNome_cliente(nome_cliente.getText());
			cliente.setEndereco(endereco.getText());
			cliente.setUf_cliente(uf_cliente.getText());
			cliente.setComplemento_cliente(complemento_cliente.getText());
			cliente.setCpf_cnpj(cpf_cnpj_cliente.getText());
			cliente.setRg_insc(rg_insc_cliente.getText());
			cliente.setData_cadastro(data_cadastro_client.getText());
			cliente.setBairro(bairro_cliente.getText());
			cliente.setCidade(cidade_cliente.getText());
			cliente.setTelefone(telefone_cliente.getText());
			cliente.setBanco(banco_cliente.getText());
			cliente.setAlugueis(alugueis_clientes.getText());
			cliente.setUltimo_aluguel(ultimo_aluguel.getText());
			cliente.setContato(contato_cliente.getText());
			cliente.setTelcontato(telcontato_cliente.getText());
			cliente.setEmail(email_cliente.getText());
			cliente.setMarq(marq.isSelected());

			ControleCliente control = new ControleCliente();
			control.ControleEscolhaCadastroaba1(cliente);

			if(ConexaoCliente.retorno==1){
			       JOptionPane.showMessageDialog(null, " Gravação Concluida com Sucesso ");
			}else if(ConexaoCliente.retorno==2){
				   JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			}
	
	}
	public  void retorno(Cliente cliente){
		
		codigo_cliente.setText(""+cliente.getId());
		nome_cliente.setText(""+cliente.getNome_cliente());
		endereco.setText(""+cliente.getEndereco());
		uf_cliente.setText(""+cliente.getUf_cliente());
		complemento_cliente.setText(""+cliente.getComplemento_cliente());
		cpf_cnpj_cliente.setText(""+cliente.getCpf_cnpj());
		rg_insc_cliente.setText(""+cliente.getRg_insc());
		data_cadastro_client.setText(""+cliente.getData_cadastro());
		bairro_cliente.setText(""+cliente.getBairro());
		cidade_cliente.setText(""+cliente.getCidade());
		telefone_cliente.setText(""+cliente.getTelefone());
		banco_cliente.setText(""+cliente.getBanco());
		alugueis_clientes.setText(""+cliente.getAlugueis());
		ultimo_aluguel.setText(""+cliente.getUltimo_aluguel());
		contato_cliente.setText(""+cliente.getContato());
		telcontato_cliente.setText(""+cliente.getTelcontato());
		email_cliente.setText(""+cliente.getEmail());
		marq.setText(""+cliente.getMarq());
		
	}
	public int verificacao(int sequencia ){
		conexao conexao = new conexao();
		conexao.conect();
		for(int i = 1; i < 100000; i++){
			try{	
				String SQL = "select *from cliente where codigo=?";
				
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
