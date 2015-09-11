package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.ConexaoBanco;
import CamadaModel.Banco;
import CamadaView.TelaBanco;


public class ControleBanco {
	
	public void ControleEscolhaCadastroaba1(Banco banco) {
		JOptionPane.showMessageDialog(null, "Entrou no controle da ABA 1");
			if(TelaBanco.verificafuncao ==1){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				ConexaoBanco conexN = new ConexaoBanco();
				conexN.gravarnoSQL(banco);
				
			}else if (TelaBanco.verificafuncao ==2){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				ConexaoBanco conexN = new ConexaoBanco();
				conexN.updatenoSQL(banco);
				
			}else if (TelaBanco.verificafuncao == 3){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 3 do Controle");
				ConexaoBanco conexN = new ConexaoBanco();
				conexN.gravarnoSQL(banco);
	
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
