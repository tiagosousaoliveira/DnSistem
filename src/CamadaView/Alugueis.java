package CamadaView;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTree;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.JButton;

public class Alugueis extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public Alugueis() {
		// TODO Auto-generated constructor stub
		
		setContentPane(componentes());
		
		 setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 setSize(800,600);
		 setTitle("Tela Cliente");
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
		
		JPanel Apresentacao_mercadoria = new JPanel();
		Apresentacao_mercadoria.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Apresentacao_mercadoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Mercadorias Escolhidas"));
		Apresentacao_mercadoria.setBounds(432, 121, 352, 407);
		panel.add(Apresentacao_mercadoria);
		Apresentacao_mercadoria.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(685, 90, 99, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(542, 90, 105, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(330, 90, 172, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(20, 90, 86, 20);
		panel.add(textField_3);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 794, 31);
		panel.add(toolBar);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(137, 90, 158, 20);
		panel.add(textField_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes do Produto"));
		panel_2.setBounds(20, 161, 317, 339);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(23, 72, 46, 14);
		panel.add(lblCodigo);
		
		JLabel lblDescricao = new JLabel("Descricao");
		lblDescricao.setBounds(139, 72, 61, 14);
		panel.add(lblDescricao);
		
		JLabel lblNewLabel = new JLabel("Codigo de Barras");
		lblNewLabel.setBounds(330, 72, 99, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantidade");
		lblNewLabel_1.setBounds(545, 72, 78, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor");
		lblNewLabel_2.setBounds(688, 72, 46, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(20, 526, 99, 23);
		panel.add(btnGravar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(238, 526, 99, 23);
		panel.add(btnCancelar);
		
		
		return panel;
		
		
		
	}
}
