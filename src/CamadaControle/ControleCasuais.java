package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.ConexaoCasuais;
import CamadaDao.ConexaoNoiva;
import CamadaModel.TrageCasuais;
import CamadaModel.TrageNoiva;
import CamadaView.TragesCasuais;
import CamadaView.TragesNoiva;


public class ControleCasuais {
	
	public void ControleEscolhaCadastroaba1(TrageCasuais casuais) {
		JOptionPane.showMessageDialog(null, "Entrou no controle da ABA 1");
			if(TragesCasuais.verificafuncao ==1){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				ConexaoCasuais conexN = new ConexaoCasuais();
				conexN.gravarnoSQL(casuais);
				
			}else if (TragesCasuais.verificafuncao ==2){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				ConexaoCasuais conexN = new ConexaoCasuais();
				conexN.updatenoSQL(casuais);
				
			}else if (TragesCasuais.verificafuncao == 3){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 3 do Controle");
				ConexaoCasuais conexN = new ConexaoCasuais();
				conexN.gravarnoSQL(casuais);
	
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
