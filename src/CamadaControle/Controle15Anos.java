package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.Conexao15Anos;
import CamadaDao.ConexaoNoiva;
import CamadaModel.Trage15Anos;
import CamadaModel.TrageNoiva;
import CamadaView.Trages15Anos;
import CamadaView.TragesNoiva;


public class Controle15Anos {
	
	public void ControleEscolhaCadastroaba1(Trage15Anos Quinzea) {
		JOptionPane.showMessageDialog(null, "Entrou no controle da ABA 1");
			if(Trages15Anos.verificafuncao ==1){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				Conexao15Anos conexN = new Conexao15Anos();
				conexN.gravarnoSQL(Quinzea);
				
			}else if (Trages15Anos.verificafuncao ==2){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				Conexao15Anos conexN = new Conexao15Anos();
				conexN.updatenoSQL(Quinzea);
				
			}else if (Trages15Anos.verificafuncao == 3){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 3 do Controle");
				Conexao15Anos conexN = new Conexao15Anos();
				conexN.gravarnoSQL(Quinzea);
	
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
