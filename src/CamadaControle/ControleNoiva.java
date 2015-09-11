package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.ConexaoNoiva;
import CamadaModel.TrageNoiva;
import CamadaView.TragesNoiva;


public class ControleNoiva {
	
	public void ControleEscolhaCadastroaba1(TrageNoiva noiva) {
		JOptionPane.showMessageDialog(null, "Entrou no controle da ABA 1");
			if(TragesNoiva.verificafuncao ==1){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				ConexaoNoiva conexN = new ConexaoNoiva();
				conexN.gravarnoSQL(noiva);
				
			}else if (TragesNoiva.verificafuncao ==2){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				ConexaoNoiva conexN = new ConexaoNoiva();
				conexN.updatenoSQL(noiva);
				
			}else if (TragesNoiva.verificafuncao == 3){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 3 do Controle");
				ConexaoNoiva conexN = new ConexaoNoiva();
				conexN.gravarnoSQL(noiva);
	
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
