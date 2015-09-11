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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import CamadaConexao.conexao;
import CamadaControle.ControleMadrinha;
import CamadaControle.ControleNoiva;
import CamadaDao.ConexaoMadrinha;
import CamadaDao.ConexaoNoiva;
import CamadaModel.TrageMadrinha;
import CamadaModel.TrageNoiva;

public class TragesMadrinha extends JFrame {
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] image = {
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas1.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas2.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas3.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas4.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas5.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas6.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas7.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas8.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas9.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas10.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas11.jpg")),
			new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas12.jpg")),
												
						
	};
	
	JPanel p;
	JPanel p1;
	Calendar data;
	public static int dia;
	public static int mes;
	public static int ano;
	public static int verificafuncao = 0;
	public static int sequencia;
	public static int recebsequencia;
	
	JButton Gravar  																		= new JButton();
	JButton cancelar																		= new JButton();
	JButton modificar																		= new JButton();
	JButton excluir																			= new JButton();
	JToolBar menu																			= new JToolBar();
	
	JLabel cadastro 																		= new JLabel("Cadastro:");
	JLabel nome 																			= new JLabel("Nome da Roupa");
	JLabel detalhes 																		= new JLabel("Detalhes da Roupa");
	JLabel cor 																				= new JLabel("Cor");
	JLabel estilo 																			= new JLabel("Estilo");
	JLabel tamanho1 																		= new JLabel("Tamanho1");
	JLabel tamanho2 																		= new JLabel("Tamanho2");
	JLabel obs 																				= new JLabel("Obs para separa��o");
	JLabel valor 																			= new JLabel("Valor da pe�a");
	JLabel Quantid 																			= new JLabel("Quantidade");
	JLabel medidas 																			= new JLabel("Medidas da roupa");
	JLabel altura 																			= new JLabel("Altura");
	JLabel largura 																			= new JLabel("Largura");
	JLabel busto 																			= new JLabel("Busto");
	JLabel cintura 																			= new JLabel("Cintura");
	JLabel manga																			= new JLabel("Mangas ");
	JLabel dat 																				= new JLabel("Data Cadastro ");
	JLabel codi																				= new JLabel("Codigo :");
	JLabel nomedaroupa 																		= new JLabel("Modelos");

	public  JTextField codigo 																= new JTextField();
	public  JTextField nome_v 																= new JTextField();
	public  JTextField detalhes_v 															= new JTextField();
	public  JTextField cor_v 																= new JTextField();
	public  JTextField estilo_v 															= new JTextField();
	public  JTextField Pe�a1 																= new JTextField();
	public  JTextField Pe�a2 																= new JTextField();
	public  JTextField obs_v 																= new JTextField();
	public  JTextField valor_v 																= new JTextField();
	public  JTextField quantidade 															= new JTextField("0");
	public  JTextField altura_v 															= new JTextField();
	public  JTextField largura_v 															= new JTextField();
	public  JTextField busto_v 																= new JTextField();
	public  JTextField manga_v 																= new JTextField();
	public  JTextField data_cadastro 														= new JTextField();
	public  JTextField cintura_v 															= new JTextField();
	
	public TragesMadrinha(){
	
		setContentPane(complementos());
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(800,600);
		setTitle("Cadastro de Vestidos");
		setVisible(true);
		setResizable(false);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize =  getSize();
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

//=========================================================================================================================================\\
		eventos();
//================================================================================================================================================================================\\
		ImageIcon ok1 = new ImageIcon(getClass().getResource("../Imagens/img/Roupas/salve.png"));	
		ok1.setImage(ok1.getImage().getScaledInstance(20, 15, 15));			
			
		ImageIcon can = new ImageIcon(getClass().getResource("../Imagens/img/Roupas/cancel.png"));	
		can.setImage(can.getImage().getScaledInstance(20, 15, 15));			
			
		ImageIcon nov = new ImageIcon(getClass().getResource("../Imagens/img/Roupas/nov.png"));	
		nov.setImage(nov.getImage().getScaledInstance(20, 15, 15));			
			
		ImageIcon exc = new ImageIcon(getClass().getResource("../Imagens/img/Roupas/lixeira.png"));	
		exc.setImage(exc.getImage().getScaledInstance(20, 15, 15));			
				
		p = new JPanel();
		p.setLayout(null);
		p.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
		p.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));
		p.setSize(460,428);
		p.setLocation(320,59);
		
		label = new JLabel(image[0]);
		label.setBounds(10, 21, 270, 269);

		combo = new JComboBox<String>();
		combo.addItem("noiva 1");
		combo.addItem("noiva 2");
		combo.addItem("noiva 3");
		combo.addItem("noiva 4");
		combo.addItem("noiva 5");
		combo.addItem("noiva 6");
		combo.addItem("noica 7");
		combo.addItem("noiva 8");
		combo.addItem("noiva 9");
		combo.addItem("noiva 10");
		combo.addItem("noica 11");
		combo.addItem("noiva 12");
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
		

			valor_v.setBounds(20, 346, 140, 20);
			p.add(valor_v);
			quantidade.setBounds(273, 346, 140, 20);
			p.add(quantidade);
			valor.setBounds(20, 315, 140, 20);
			p.add(valor);
			Quantid.setBounds(273, 315, 140, 20);
			p.add(Quantid);
			obs_v.setBounds(20, 284, 400, 20);
			p.add(obs_v);
			obs.setBounds(20, 253, 110, 20);
			p.add(obs);
			Pe�a1.setBounds(20, 222, 140, 20);
			p.add(Pe�a1);
			Pe�a2.setBounds(273, 222, 140, 20);
			p.add(Pe�a2);
			tamanho1.setBounds(20, 191, 140, 20);
			p.add(tamanho1);
			tamanho2.setBounds(273, 191, 140, 20);
			p.add(tamanho2);
			cor_v.setBounds(20, 160, 140, 20);
			p.add(cor_v);
			cor.setBounds(20, 129, 66, 20);
			p.add(cor);
			estilo_v.setBounds(273, 160, 140, 20);
			p.add(estilo_v);
			estilo.setBounds(273, 129, 49, 20);
			p.add(estilo);
			detalhes.setBounds(20, 79, 110, 20);
			p.add(detalhes);
			detalhes_v.setBounds(20, 104, 400, 20);
			p.add(detalhes_v);
			codigo= new JTextField(""+recebsequencia);
			codigo.setBounds(20, 48, 65, 20);
			p.add(codigo);
			nome_v.setBounds(100, 48, 320, 20);
			p.add(nome_v);
			codi.setBounds(20, 17, 66, 20);
			p.add(codi);
			nome.setBounds(95, 17, 91, 20);
			p.add(nome);
medidas.setBounds(18, 3600, 92, 20);
panel.add(medidas);
Gravar.setLocation(0, 0);																
Gravar.setSize(10, 10);
Gravar.setToolTipText("Salvar os Dados");
cancelar.setLocation(0, 0);															
cancelar.setSize(0, 0);
cancelar.setToolTipText("Cancelar Processo");
modificar.setLocation(0, 0);																
modificar.setSize(0, 0);
modificar.setToolTipText("Gravar Modificacoes");	
excluir.setLocation(0,0);															
excluir.setSize(0, 0);
excluir.setToolTipText("Excluir Cadastro");
menu.setLocation(0,0);																
menu.setSize(794,47);
Gravar.setIcon(ok1);
cancelar.setIcon(can);
modificar.setIcon(nov);
excluir.setIcon(exc);

//=========================================================================================================================================\\
menu.add(Gravar);			
menu.add(modificar);			
menu.add(cancelar);		
menu.add(excluir);			


p1 = new JPanel();
p1.setLayout(null);
p1.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
p1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Bancarios"));
p1.setSize(300,301);
p1.setLocation(15,59);
panel.add(p1);

p1.add(label);
nomedaroupa.setBounds(150, 359, 57, 14);
panel.add(nomedaroupa);

panel.add(altura);	
panel.add(altura_v);	panel.add(largura);		panel.add(largura_v);	panel.add(busto);			panel.add(busto_v);		panel.add(cintura);		
panel.add(cintura_v);	panel.add(manga);		panel.add(manga_v);		panel.add(p);				panel.add(dat);			panel.add(data_cadastro);
panel.add(combo);		panel.add(menu);
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
		TrageMadrinha madrinha = new TrageMadrinha();
			
			int cod;
			cod=Integer.parseInt(codigo.getText());
			int qua;
			qua=Integer.parseInt(quantidade.getText());			
			madrinha.setId(cod);
			madrinha.setQuantidade(qua);
			madrinha.setNome(nome_v.getText());
			madrinha.setDetalhes(detalhes_v.getText());
			madrinha.setCor(cor_v.getText());
			madrinha.setEstilo(estilo_v.getText());
			madrinha.setOpcao1(Pe�a1.getText());
			madrinha.setOpcao2(Pe�a2.getText());
			madrinha.setObs(obs_v.getText());
			madrinha.setValor(valor_v.getText());
			madrinha.setAltura(altura_v.getText());
			madrinha.setLargura(largura_v.getText());
			madrinha.setBusto(busto_v.getText());
			madrinha.setManga(manga_v.getText());
			madrinha.setModelo1(combo.getSelectedItem().toString());
			madrinha.setData_cadastro(data_cadastro.getText());
			madrinha.setCintura(cintura_v.getText());
			
	    	ControleMadrinha control = new ControleMadrinha();
			control.ControleEscolhaCadastroaba1(madrinha);
			
			if(ConexaoMadrinha.retorno==1){
			       JOptionPane.showMessageDialog(null, " Grava��o Concluida com Sucesso ");
			}else if(ConexaoMadrinha.retorno==2){
				   JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			}
	
	}
	public void retorno(TrageMadrinha madrinha){

			codigo.setText(""+madrinha.getId());
			nome_v.setText(""+madrinha.getNome());
			detalhes_v.setText(""+madrinha.getDetalhes());
			cor_v.setText(""+madrinha.getCor());
			estilo_v.setText(""+madrinha.getEstilo());
			Pe�a1.setText(""+madrinha.getOpcao1());
			Pe�a2.setText(""+madrinha.getOpcao2());
			obs_v.setText(""+madrinha.getObs());
			valor_v.setText(""+madrinha.getValor());
			quantidade.setText(""+madrinha.getQuantidade());
			altura_v.setText(""+madrinha.getAltura());
			largura_v.setText(""+madrinha.getLargura());
			busto_v.setText(""+madrinha.getBusto());
			manga_v.setText(""+madrinha.getManga());
			data_cadastro.setText(""+madrinha.getData_cadastro());
			cintura_v.setText(""+madrinha.getCintura());
			combo.setSelectedItem(""+madrinha.getModelo1());
		
		
	}
	public int verificacao(int sequencia ){
	
		conexao conexao = new conexao();
		conexao.conect();

			for(int i = 1; i < 100000; i++){
		
				try{
					
					String SQL = "select *from vestido_m where codigo=?";
			
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