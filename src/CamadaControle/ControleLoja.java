package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.ConexaoLoja;
import CamadaModel.Loja;
import CamadaView.TelaLoja;



public class ControleLoja {
	
	public void ControleEscolhaCadastroaba1(Loja loja) {
		JOptionPane.showMessageDialog(null, "Entrou no controle da ABA 1");
			if(TelaLoja.verificafuncao ==1){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				ConexaoLoja conexN = new ConexaoLoja();
				conexN.gravarnoSQL(loja);
				
			}else if (TelaLoja.verificafuncao ==2){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				ConexaoLoja conexN = new ConexaoLoja();
				conexN.updatenoSQL(loja);
				
			}else if (TelaLoja.verificafuncao == 3){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 3 do Controle");
				ConexaoLoja conexN = new ConexaoLoja();
				conexN.gravarnoSQL(loja);
	
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
