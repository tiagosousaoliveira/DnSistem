package CamadaView;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class PesquisaContrato extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public PesquisaContrato() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		// TODO Auto-generated constructor stub
		
		 
		 setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 setSize(508,400);
		 setTitle("Pesquisa Contrato");
		 setVisible(true);
		 setResizable(false);
		 
		 setLocation(110,20); 
		
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 Dimension frameSize = getSize();
		 setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		 getContentPane().setLayout(null);
		 
		 textField = new JTextField();
		 textField.setBounds(20, 85, 400, 20);
		 getContentPane().add(textField);
		 textField.setColumns(10);
		 
		 textField_1 = new JTextField();
		 textField_1.setText("         /         /");
		 textField_1.setBounds(20, 127, 144, 20);
		 getContentPane().add(textField_1);
		 textField_1.setColumns(10);
		 
		 JButton btnOk = new JButton("Ok");
		 btnOk.setBounds(363, 308, 89, 23);
		 getContentPane().add(btnOk);
		 
		 JButton btnCancelar = new JButton("Cancelar");
		 btnCancelar.setBounds(234, 308, 89, 23);
		 getContentPane().add(btnCancelar);
		 
		 JLabel lblData = new JLabel("Data");
		 lblData.setBounds(20, 113, 46, 14);
		 getContentPane().add(lblData);
		 
		 JLabel lblNewLabel = new JLabel("Cliente");
		 lblNewLabel.setBounds(20, 67, 46, 14);
		 getContentPane().add(lblNewLabel);
		 
		 textField_2 = new JTextField();
		 textField_2.setBounds(234, 127, 186, 20);
		 getContentPane().add(textField_2);
		 textField_2.setColumns(10);
		 
		 JLabel lblNewLabel_1 = new JLabel("Contrato");
		 lblNewLabel_1.setBounds(234, 113, 46, 14);
		 getContentPane().add(lblNewLabel_1);
		 
		 JToolBar toolBar = new JToolBar();
		 toolBar.setBounds(0, 0, 502, 27);
		 getContentPane().add(toolBar);
	}
}
