package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.ConexaoNoivo;
import CamadaModel.TrageNoivo;
import CamadaView.TragesNoivo;


public class ControleNoivo {
	
	public void ControleEscolhaCadastroaba1(TrageNoivo noivo) {
		JOptionPane.showMessageDialog(null, "Entrou no controle da ABA 1");
			if(TragesNoivo.verificafuncao ==1){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				ConexaoNoivo conexN = new ConexaoNoivo();
				conexN.gravarnoSQL(noivo);
				
			}else if (TragesNoivo.verificafuncao ==2){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				ConexaoNoivo conexN = new ConexaoNoivo();
				conexN.updatenoSQL(noivo);
				
			}else if (TragesNoivo.verificafuncao == 3){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 3 do Controle");
				ConexaoNoivo conexN = new ConexaoNoivo();
				conexN.gravarnoSQL(noivo);
	
			}else {
				JOptionPane.showMessageDialog(null, "Não entendeu o desk.getRegistro() ");
			}
	}
	public void ControleEscolhaCadastroaba2() {
		//Desktop desk = new Desktop();

	}
	public void ControleEscolhaCadastroaba3() {
		//Desktop desk = new Desktop();
	}

}
