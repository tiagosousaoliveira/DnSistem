package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.ConexaoDama;
import CamadaDao.ConexaoNoiva;
import CamadaModel.TrageDamaHonra;
import CamadaModel.TrageNoiva;
import CamadaView.TragesDamadeHonra;
import CamadaView.TragesNoiva;


public class ControleDama {
	
	public void ControleEscolhaCadastroaba1(TrageDamaHonra dama) {
		JOptionPane.showMessageDialog(null, "Entrou no controle da ABA 1");
			if(TragesDamadeHonra.verificafuncao ==1){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				ConexaoDama conexN = new ConexaoDama();
				conexN.gravarnoSQL(dama);
				
			}else if (TragesDamadeHonra.verificafuncao ==2){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				ConexaoDama conexN = new ConexaoDama();
				conexN.updatenoSQL(dama);
				
			}else if (TragesDamadeHonra.verificafuncao == 3){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 3 do Controle");
				ConexaoDama conexN = new ConexaoDama();
				conexN.gravarnoSQL(dama);
	
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
