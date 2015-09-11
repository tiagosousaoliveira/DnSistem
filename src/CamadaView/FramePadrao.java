package CamadaView;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FramePadrao extends JFrame {
	


	public FramePadrao() {
		
		JOptionPane.showMessageDialog(null	, TelaDesktop.testes);
		
		if(TelaDesktop.testes == 1){
			
			TelaCliente client = new TelaCliente();
			this.add(client);
			
		}
		

		
	}
	public Container cont(){
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		

		return panel; 
	}


}
