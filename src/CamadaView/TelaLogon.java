/**
 * 
 */
package CamadaView;

/**
 * @author Tiago e Adriana
 *
 */
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import CamadaControle.ControleLogon;

public class TelaLogon extends JFrame {
	
		JLabel usuar										       							= new JLabel("Usuario :");
		JLabel senh																			= new JLabel("Senha    :");
		
		public static String senha;
		public static String logon;
		public static JTextField     campologon 											= new JTextField();
		public static JPasswordField camposenha 											= new JPasswordField(); 
		
		public JButton butaoentrar 															= new JButton("Logar :"); 
		public JButton butaosair   															= new JButton("Sair  :");

	
	public TelaLogon() {
		super ("Tela Logon");
		
		setContentPane(componentes());

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(380,200);
		setVisible(true);
		setResizable(false);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
	    setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
	}
	public Container componentes(){
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		
		usuar.setLocation(10,40);
		usuar.setSize(60,20);
		campologon.setToolTipText("Insira seu Nome de Logon");
		campologon.setLocation(80,40);
		campologon.setSize(170,20);
		senh.setLocation(10,70);
		senh.setSize(60,20);
		camposenha.setToolTipText("Insira sua Senha de Acesso");
		camposenha.setLocation(80,70);
		camposenha.setSize(170,20);
		butaoentrar.setToolTipText("Clique para Efetuar o Logon");
		butaoentrar.setLocation(170,95);
		butaoentrar.setSize(80,20);
		butaosair.setToolTipText("Clique para Sair da Tela de Logon");
		butaosair.setLocation(80,95);
		butaosair.setSize(80,20);
//=======================================================================================================================================//		
		ImageIcon db = new ImageIcon (getClass().getResource("../imagens/img/Logon/newdb.png"));
		db.setImage(db.getImage().getScaledInstance(20, 15, 15));
			JLabel bdd = new JLabel(db);
				bdd.setLocation(300,120);
				bdd.setSize(60,52);
	
		ImageIcon noivos = new ImageIcon (getClass().getResource("../imagens/img/Logon/noivos.png"));
		noivos.setImage(noivos.getImage().getScaledInstance(180, 110, 110));
			JLabel bonecos = new JLabel(noivos);
				bonecos.setLocation(210,10);
				bonecos.setSize(200,100);
//=====================================================================================================================================//
        eventos();
//=====================================================================================================================================//

		panel.add(bdd);			panel.add(butaosair);		panel.add(butaoentrar);			panel.add(usuar);
		panel.add(campologon);	panel.add(senh);			panel.add(camposenha);			panel.add(bonecos);
		
		return panel;
		
	}
	public void loga(){
	
	Container containerinterno = getContentPane();
	containerinterno.setLayout(null);
	
	
	usuar.setLocation(10,40);
	usuar.setSize(60,20);
	campologon.setLocation(80,40);
	campologon.setSize(170,20);
	senh.setLocation(10,70);
	senh.setSize(60,20);
	camposenha.setLocation(80,70);
	camposenha.setSize(170,20);

	butaoentrar.setLocation(170,95);
	butaoentrar.setSize(80,20);
	butaosair.setLocation(80,95);
	butaosair.setSize(80,20);
//=======================================================================================================================================//		
	ImageIcon db = new ImageIcon (getClass().getResource("../Imagens/img/Logon/newdb.png"));
	db.setImage(db.getImage().getScaledInstance(20, 15, 15));
		JLabel bdd = new JLabel(db);
			bdd.setLocation(300,120);
			bdd.setSize(60,60);

	ImageIcon noivos = new ImageIcon (getClass().getResource("../Imagens/img/Logon/noivos.png"));
	noivos.setImage(noivos.getImage().getScaledInstance(180, 110, 110));
		JLabel bonecos = new JLabel(noivos);
			bonecos.setLocation(210,10);
			bonecos.setSize(200,100);
//=====================================================================================================================================//
    eventos();
//=====================================================================================================================================//

    containerinterno.add(bdd);			containerinterno.add(butaosair);	containerinterno.add(butaoentrar);		
    containerinterno.add(usuar);	    containerinterno.add(campologon);	containerinterno.add(senh);		
    containerinterno.add(camposenha);	containerinterno.add(bonecos);
		
	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setSize(380,200);
	setVisible(true);
	setResizable(false);
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	Dimension frameSize = this.getSize();
    setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
	}
	
	public void eventos(){
		butaoentrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			ControleLogon logon = new ControleLogon();
				logon.ControleLogon();
				if(ControleLogon.retorno == 0){
					dispose();
					
				}

			}
		});
		
		butaosair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		
	}
	
	public static void main (String args[]){
		TelaLogon.setDefaultLookAndFeelDecorated(true);
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        /* Crib e exibe o GUI */ 
		    	new TelaLogon();
		    }
		});
	}

}
