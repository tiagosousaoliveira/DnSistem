package CamadaView;

import CamadaDao.EntradaMerca;
import CamadaModel.EntradaItens;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.util.Vector;

public class EntradaMercadoria extends JFrame {
	
	private JTable tabela;
	private JScrollPane barraRolagem;
	private DefaultTableModel modelo = new DefaultTableModel();	
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public EntradaMercadoria() {

		 setContentPane(complementos());
		 setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 setSize(800,600);
		 setTitle("Entrada de Mercadorias");
		 setVisible(true);
		 setResizable(false);
		
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 Dimension frameSize = getSize();
		 setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		
		 

	}
	
	public Container complementos(){
		JPanel panel = new JPanel();
			panel.setLayout(null);
		
		
		
				textField_5 = new JTextField();
				textField_5.setBounds(546, 104, 86, 20);
				textField_5.setColumns(10);
 
				textField_6 = new JTextField();
				textField_6.setBounds(546, 146, 238, 20);
				textField_6.setColumns(10);
 
				JLabel lblCodigo = new JLabel("Codigo");
				lblCodigo.setBounds(546, 88, 46, 14);
 
				JLabel lblNomeDaMercadoria = new JLabel("Nome da Mercadoria");
				lblNomeDaMercadoria.setBounds(545, 132, 158, 14);
 
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(546, 177, 238, 20);
 
				JButton btnGravar = new JButton("Gravar");
				btnGravar.setBounds(695, 321, 89, 23);		
				
//====================================================================================================================================================================		
		
		 JPanel panell = new JPanel();
		 	panell.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.YELLOW, Color.YELLOW)); 
		 	panell.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados para Entrada"));
		 	panell.setBounds(10, 54, 526, 290);
		 	panell.setLayout(null);
		 	
			  	 JLabel lblCnoj = new JLabel("CNPJ");
			  	 lblCnoj.setBounds(23, 90, 46, 14);
		   		 
				 JLabel lblDataEmissao = new JLabel("Data Emissao");
				 lblDataEmissao.setBounds(289, 90, 97, 14);

				 JLabel lblQuantidadeDePeas = new JLabel("Quantidade de Pe\u00E7as");
				 lblQuantidadeDePeas.setBounds(359, 147, 117, 14);

		 		 JLabel lblNewLabel = new JLabel("Valor Total");
		 		 lblNewLabel.setBounds(390, 208, 86, 14);
		 		  	 
		 		 JLabel lblNomeDoFornecedor = new JLabel("Nome do Fornecedor");
		 		 lblNomeDoFornecedor.setBounds(23, 34, 117, 14);

				 textField = new JTextField();
				 textField.setBounds(23, 59, 453, 20);
				 textField.setColumns(10);
				  
		 		 textField_1 = new JTextField();
		 		 textField_1.setBounds(298, 225, 178, 20);
		 		 textField_1.setColumns(10);
		 		 
		 		 textField_2 = new JTextField();
		 		 textField_2.setBounds(287, 115, 189, 20);
		 		 textField_2.setText("         /          /");
		 		 textField_2.setColumns(10);
		 		 
	 		  	 textField_3 = new JTextField();
	 		  	 textField_3.setBounds(23, 115, 178, 20);
	 		  	 textField_3.setColumns(10);
			  
	 		  	 textField_4 = new JTextField();
	 		  	 textField_4.setBounds(359, 170, 117, 20);
	 		  	 textField_4.setColumns(10);
			   

		 	  panell.add(textField);			  panell.add(lblCnoj);			  		panell.add(lblNomeDoFornecedor);	  panell.add(textField_4);
			  panell.add(lblDataEmissao);		  panell.add(lblQuantidadeDePeas);		panell.add(textField_2);			  panell.add(textField_1);
			  panell.add(textField_3);			  panell.add(lblNewLabel);
		
//==================================================================================================================================================================		 
		 JToolBar toolBar = new JToolBar();
		 toolBar.setBounds(0, 0, 794, 43);
		 
		 JPanel panel_1 = new JPanel();
		 	panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.YELLOW, Color.YELLOW)); 
		 	panel_1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Mercadorias"));
		 	panel_1.setBounds(10, 355, 774, 206);
		 	panel_1.setLayout(null);
		 	
			tabela = new JTable(modelo);
			modelo.addColumn("Id");
			modelo.addColumn("Descricao");
			modelo.addColumn("Quantidade");
			tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
			tabela.getColumnModel().getColumn(1).setPreferredWidth(120);
			tabela.getColumnModel().getColumn(1).setPreferredWidth(80);

			barraRolagem = new JScrollPane(tabela);
			barraRolagem.setBounds(6, 16, 762, 179);
			pesquisar(modelo);
		 	
			
		 	panel_1.add(barraRolagem);
//=================================================================================================================================================================		   		 		  		 
		 
		 	panel.add(panell); 				panel.add(panel_1);		   	panel.add(comboBox);		panel.add(btnGravar);
		   	panel.add(lblNomeDaMercadoria);	panel.add(lblCodigo);		panel.add(textField_5);		panel.add(textField_6);
		   	panel.add(toolBar);
		 
		return panel;			 
	}
	public static void pesquisar(DefaultTableModel modelo) {
		modelo.setNumRows(0);
		EntradaMerca dao = new EntradaMerca();

		for (EntradaItens c : dao.getContatos()) {
			modelo.addRow(new Object[]{c.getId(), c.getDescricao(),c.getQuantidade()});
		}
	}
}
