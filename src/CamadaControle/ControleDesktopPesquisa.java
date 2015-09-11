package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.ConexaoDesktopPesquisa;
import CamadaDao.ConexaoNoiva;
import CamadaModel.Desktop;

public class ControleDesktopPesquisa {
	
	public void ControleEscolhaCadastroaba1(Desktop desk) {

			if(desk.getRegistro()== 1){
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				ConexaoDesktopPesquisa desktop = new ConexaoDesktopPesquisa();
				desktop.SelecionaCadastro1(desk);
			}else if (desk.getRegistro()== 2){
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				ConexaoDesktopPesquisa desktop = new ConexaoDesktopPesquisa();
				desktop.SelecionaCadastro2(desk);
			}else if (desk.getRegistro()== 3){
				ConexaoDesktopPesquisa desktop = new ConexaoDesktopPesquisa();
				desktop.SelecionaCadastro3(desk);
			}else if (desk.getRegistro()== 4){
				ConexaoDesktopPesquisa desktop = new ConexaoDesktopPesquisa();
				desktop.SelecionaCadastro4(desk);
			}else if (desk.getRegistro()== 5){
				ConexaoDesktopPesquisa desktop = new ConexaoDesktopPesquisa();
				desktop.SelecionaCadastro5(desk);
			}else if (desk.getRegistro()== 6){
				ConexaoDesktopPesquisa desktop = new ConexaoDesktopPesquisa();
				desktop.SelecionaCadastro6(desk);
			}else {
				JOptionPane.showMessageDialog(null, "Não entendeu o desk.getRegistro() ");
			}
	}
	public void ControleEscolhaCadastroaba2() {
		Desktop desk = new Desktop();

	}
	public void ControleEscolhaCadastroaba3() {
		Desktop desk = new Desktop();
	}

}
