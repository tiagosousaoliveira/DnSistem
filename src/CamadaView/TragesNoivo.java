package CamadaView;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;

import java.awt.Choice;
import java.awt.List;
import java.awt.Panel;

import javax.swing.JComboBox;

import CamadaConexao.conexao;
import CamadaControle.ControleNoivo;
import CamadaDao.ConexaoNoivo;
import CamadaModel.TrageNoivo;


public class TragesNoivo extends JFrame {
	public JComboBox<String> combo;
	JLabel label;
	ImageIcon[] image = {
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo1.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo2.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo3.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo4.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo5.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo6.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo7.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo8.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo9.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo10.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo11.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo12.jpg")),

	};

	Calendar data;
	public static int dia;
	public static int mes;
	public static int ano;
	public static int verificafuncao = 0;
	public static int sequencia;
	public static int recebsequencia;
	
	JButton Gravar  																			= new JButton();
	JButton cancelar																		= new JButton();
	JButton modificar																			= new JButton();
	JButton excluir																			= new JButton();
	JToolBar menu																			= new JToolBar();
	JLabel cadastro 																		= new JLabel("Cadastro:");
	JLabel nome 																			= new JLabel("Nome da Roupa");
	JLabel detalhes 																		= new JLabel("Detalhes da Roupa");
	JLabel cor 																				= new JLabel("Cores");
	JLabel estilo 																			= new JLabel("Estilo");
	JLabel tamanho1 																		= new JLabel("Pe\u00E7as adicionais 1\u00BA");
	JLabel tamanho2 																		= new JLabel("Pe\u00E7as adicionais 2\u00BA");
	JLabel obs 																				= new JLabel("Obs para separação");
	JLabel valor 																			= new JLabel("Valor da peça");
	JLabel desconto 																		= new JLabel("Quantidade");
	JLabel altura 																			= new JLabel("Altura");
	JLabel largura 																			= new JLabel("Largura");
	JLabel busto 																			= new JLabel("Busto");
	JLabel cintura 																			= new JLabel("Cintura");
	JLabel manga																			= new JLabel("Mangas ");
	JLabel dat 																				= new JLabel("Data Cadastro ");
	JLabel codi																				= new JLabel("Codigo :");
	JLabel Nomedaroupa 																		= new JLabel("Modelos");
	
	public  JTextField codigo 																= new JTextField();
	public  JTextField nome_v 																= new JTextField();
	public  JTextField detalhes_v 															= new JTextField();
	public  JTextField cor_v 																= new JTextField();
	public  JTextField estilo_v 															= new JTextField();
	public  JTextField Peça1 																= new JTextField();
	public  JTextField Peça2 																= new JTextField();
	public  JTextField obs_v 																= new JTextField();
	public  JTextField valor_v 																= new JTextField();
	public  JTextField quantidade 															= new JTextField("0");
	public  JTextField altura_v 															= new JTextField();
	public  JTextField largura_v 															= new JTextField();
	public  JTextField busto_v 																= new JTextField();
	public  JTextField manga_v 																= new JTextField();
	public  JTextField data_cadastro 														= new JTextField();
	public  JTextField cintura_v 															= new JTextField();
	

	public  TragesNoivo() {
	//	super("", true, true, false, true);
		setContentPane(complementos());
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(800,600);
		setTitle("Trages Homens");
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
		
		
		data = Calendar.getInstance();		dia = data.get(Calendar.DATE);					mes = data.get(Calendar.MONTH);
		ano = data.get(Calendar.YEAR);		mes= mes+1;
		dat.setLocation(690, 0);                                                            dat.setSize(90, 20);
		data_cadastro = new JTextField(dia+" / "+mes+" / "+ano);		
		data_cadastro.setLocation(690,22);													data_cadastro.setSize(90,20);
		data_cadastro.setEditable(false);
		
		recebsequencia = verificacao(sequencia);
		
		altura.setLocation(39,402);															altura.setSize(57,20);
		altura_v.setLocation(25,421);														altura_v.setSize(80,20);
		largura.setLocation(132,402);														largura.setSize(57,20);
		largura_v.setLocation(119,421);														largura_v.setSize(80,20);
		busto.setLocation(234,402);															busto.setSize(57,20);
		busto_v.setLocation(225,421);														busto_v.setSize(80,20);
		cintura.setLocation(95,446);														cintura.setSize(46,20);
		cintura_v.setLocation(76,467);														cintura_v.setSize(80,20);
		manga.setLocation(193,446);															manga.setSize(46,20);
		manga_v.setLocation(178,467);														manga_v.setSize(80,20);

		Gravar.setLocation(0, 0);															Gravar.setSize(10, 10);
		Gravar.setToolTipText("Salvar os Dados");
		cancelar.setLocation(0, 0);															cancelar.setSize(0, 0);
		cancelar.setToolTipText("Cancelar Processo");
		modificar.setLocation(0, 0);														modificar.setSize(0, 0);
		modificar.setToolTipText("Gravar Modificacoes");	
		excluir.setLocation(0,0);															excluir.setSize(0, 0);
		excluir.setToolTipText("Excluir Cadastro");
		menu.setLocation(0,0);																menu.setSize(794,47);
		Nomedaroupa.setBounds(132, 358, 57, 14);
		
		ImageIcon ok1 = new ImageIcon(getClass().getResource("../Imagens/img/Roupas/salve.png"));	
		ok1.setImage(ok1.getImage().getScaledInstance(20, 15, 15));			
			
		ImageIcon can = new ImageIcon(getClass().getResource("../Imagens/img/Roupas/cancel.png"));	
		can.setImage(can.getImage().getScaledInstance(20, 15, 15));			
			
		ImageIcon nov = new ImageIcon(getClass().getResource("../Imagens/img/Roupas/nov.png"));	
		nov.setImage(nov.getImage().getScaledInstance(20, 15, 15));			
			
		ImageIcon exc = new ImageIcon(getClass().getResource("../Imagens/img/Roupas/lixeira.png"));	
		exc.setImage(exc.getImage().getScaledInstance(20, 15, 15));		
		
		Gravar.setIcon(ok1);
		cancelar.setIcon(can);
		modificar.setIcon(nov);
		excluir.setIcon(exc);
		
		menu.add(Gravar);			
		menu.add(modificar);			
		menu.add(cancelar);		
		menu.add(excluir);
		
		
//=========================================================================================================================================\\
		eventos();
//================================================================================================================================================================================\\
		JPanel p  = new JPanel();
			p.setLayout(null);
			p.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
			p.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));
			p.setSize(460,428);
			p.setLocation(320,59);
			
			Peça1.setBounds(20, 184, 140, 20);
			Peça2.setBounds(273, 184, 160, 20);
			codigo= new JTextField(""+recebsequencia);
			codigo.setBounds(20, 37, 65, 20);
			valor_v.setBounds(20, 327, 140, 20);			
		//	quantidade.setEditable(false);
			quantidade.setBounds(273, 327, 160, 20);	
			valor.setBounds(20, 296, 140, 20);
			desconto.setBounds(273, 296, 140, 20);
			obs_v.setBounds(20, 265, 413, 20);
			obs.setBounds(20, 234, 110, 20);
			tamanho1.setBounds(20, 159, 140, 20);
			tamanho2.setBounds(273, 159, 140, 20);
			cor_v.setBounds(20, 128, 140, 20);
			cor.setBounds(20, 110, 140, 20);
			estilo_v.setBounds(273, 128, 160, 20);
			estilo.setBounds(273, 110, 49, 20);
			detalhes.setBounds(20, 68, 110, 20);
			detalhes_v.setBounds(20, 87, 413, 20);
			nome_v.setBounds(95, 37, 338, 20);
			codi.setBounds(20, 17, 66, 20);
			nome.setBounds(95, 17, 91, 20);
			
			p.add(valor_v);			p.add(quantidade);			p.add(desconto);			p.add(obs_v);			p.add(obs);
			p.add(Peça1);			p.add(valor);				p.add(Peça2);				p.add(tamanho1);		p.add(tamanho2);
			p.add(cor_v);			p.add(cor);					p.add(estilo_v);			p.add(estilo);			p.add(detalhes);
			p.add(detalhes_v);		p.add(codigo);				p.add(nome_v);				p.add(codi);			p.add(nome);
			
//=================================================================================================================================================================================\\
		
		JPanel p1 = new JPanel();
			p1.setLayout(null);
			p1.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
			p1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Bancarios"));
			p1.setSize(300,301);
			p1.setLocation(15,59);
		
			label = new JLabel(image[0]);
			label.setBounds(10, 21, 280, 269);
			
			p1.add(label);
//==================================================================================================================================================================================\\
			combo = new JComboBox<String>();
			combo.addItem("noivo 1");
			combo.addItem("noivo 2");
			combo.addItem("noivo 3");
			combo.addItem("noivo 4");
			combo.addItem("noivo 5");
			combo.addItem("noivo 6");
			combo.addItem("noivo 7");
			combo.addItem("noivo 8");
			combo.addItem("noivo 9");
			combo.addItem("noivo 10");
			combo.addItem("noivo 11");
			combo.addItem("noivo 12");
			combo.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					if(e.getStateChange() == ItemEvent.SELECTED){
						label.setIcon(image[combo.getSelectedIndex()]);
					}
				
				}
			});
			combo.setBounds(25, 379, 290, 20);
			
//=========================================================================================================================================\\

			

panel.add(altura);		panel.add(Nomedaroupa);
panel.add(altura_v);	panel.add(largura);		panel.add(largura_v);	panel.add(busto);			panel.add(busto_v);		panel.add(cintura);		
panel.add(cintura_v);	panel.add(manga);		panel.add(manga_v);		panel.add(p);				panel.add(dat);			panel.add(data_cadastro);
panel.add(menu);		panel.add(combo);		panel.add(p1);
		
	return panel;
		
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
		TrageNoivo noivo = new TrageNoivo();
			
			int cod;
			cod=Integer.parseInt(codigo.getText());
			int qua;
			qua=Integer.parseInt(quantidade.getText());			
			noivo.setId(cod);
			noivo.setQuantidade(qua);
			noivo.setNome(nome_v.getText());
			noivo.setDetalhes(detalhes_v.getText());
			noivo.setCor(cor_v.getText());
			noivo.setEstilo(estilo_v.getText());
			noivo.setOpcao1(Peça1.getText());
			noivo.setOpcao2(Peça2.getText());
			noivo.setObs(obs_v.getText());
			noivo.setValor(valor_v.getText());
			noivo.setAltura(altura_v.getText());
			noivo.setLargura(largura_v.getText());
			noivo.setBusto(busto_v.getText());
			noivo.setManga(manga_v.getText());
			noivo.setModelo1(combo.getSelectedItem().toString());
			noivo.setData_cadastro(data_cadastro.getText());
			noivo.setCintura(cintura_v.getText());
			
			ControleNoivo control = new ControleNoivo();
			control.ControleEscolhaCadastroaba1(noivo);
			if(ConexaoNoivo.retorno==1){
			       JOptionPane.showMessageDialog(null, " Gravação Concluida com Sucesso ");
			}else if(ConexaoNoivo.retorno==2){
				   JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			}
	
	}
	public  void retorno(TrageNoivo noivo){
		
			codigo.setText(""+noivo.getId());
			nome_v.setText(""+noivo.getNome());
			detalhes_v.setText(""+noivo.getDetalhes());
			cor_v.setText(""+noivo.getCor());
			estilo_v.setText(""+noivo.getEstilo());
			Peça1.setText(""+noivo.getOpcao1());
			Peça2.setText(""+noivo.getOpcao2());
			obs_v.setText(""+noivo.getObs());
			valor_v.setText(""+noivo.getValor());
			quantidade.setText(""+noivo.getQuantidade());
			altura_v.setText(""+noivo.getAltura());
			largura_v.setText(""+noivo.getLargura());
			busto_v.setText(""+noivo.getBusto());
			manga_v.setText(""+noivo.getManga());
			data_cadastro.setText(""+noivo.getData_cadastro());
			cintura_v.setText(""+noivo.getCintura());
			combo.setSelectedItem(""+noivo.getModelo1());
		
	}
	public int verificacao(int sequencia ){
	
		conexao conexao = new conexao();
		conexao.conect();
			for(int i = 1; i < 100000; i++){
				try{
					
					String SQL = "select *from terno where codigo=?";
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