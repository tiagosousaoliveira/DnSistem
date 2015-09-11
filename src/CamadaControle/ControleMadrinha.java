package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.ConexaoMadrinha;
import CamadaDao.ConexaoNoiva;
import CamadaModel.TrageMadrinha;
import CamadaModel.TrageNoiva;
import CamadaView.TragesMadrinha;
import CamadaView.TragesNoiva;


public class ControleMadrinha {
	
	public void ControleEscolhaCadastroaba1(TrageMadrinha madrinha) {
		JOptionPane.showMessageDialog(null, "Entrou no controle da ABA 1");
			if(TragesMadrinha.verificafuncao ==1){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				ConexaoMadrinha conexN = new ConexaoMadrinha();
				conexN.gravarnoSQL(madrinha);
				
			}else if (TragesMadrinha.verificafuncao ==2){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				ConexaoMadrinha conexN = new ConexaoMadrinha();
				conexN.updatenoSQL(madrinha);
				
			}else if (TragesMadrinha.verificafuncao == 3){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 3 do Controle");
				ConexaoMadrinha conexN = new ConexaoMadrinha();
				conexN.gravarnoSQL(madrinha);
	
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
