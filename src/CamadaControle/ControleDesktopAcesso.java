package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.ConexaoDesktopAcesso;
import CamadaDao.ConexaoDesktopPesquisa;
import CamadaModel.Desktop;
import CamadaModel.Trage15Anos;
import CamadaModel.TrageCasuais;
import CamadaModel.TrageDamaHonra;
import CamadaModel.TrageMadrinha;
import CamadaModel.TrageNoiva;
import CamadaModel.TrageNoivo;

public class ControleDesktopAcesso {
	
	public void ControleAcessoCadastroaba1(Desktop desk ) {
		JOptionPane.showMessageDialog(null, "o Eget Id é = "+ desk.getId()+"  E o registro é = "+ desk.getRegistro());
			if(desk.getRegistro()== 1){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				TrageNoiva noiva = new TrageNoiva();
				ConexaoDesktopAcesso desktop = new ConexaoDesktopAcesso();
				desktop.SelecionaCadastro1(desk,noiva);
				
			}else if (desk.getRegistro()== 2){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				TrageNoivo noivo = new TrageNoivo();
				ConexaoDesktopAcesso desktop = new ConexaoDesktopAcesso();
				desktop.SelecionaCadastro2(desk,noivo);
				
			}else if (desk.getRegistro()== 3){
				
				Trage15Anos Quinzea = new Trage15Anos();
				ConexaoDesktopAcesso desktop = new ConexaoDesktopAcesso();
				desktop.SelecionaCadastro3(desk,Quinzea);
				
			}else if (desk.getRegistro()== 4){
				
				TrageMadrinha madrinhas = new TrageMadrinha();
				ConexaoDesktopAcesso desktop = new ConexaoDesktopAcesso();
				desktop.SelecionaCadastro4(desk,madrinhas);
				
			}else if (desk.getRegistro()== 5){
				
				TrageDamaHonra dama = new TrageDamaHonra();
				ConexaoDesktopAcesso desktop = new ConexaoDesktopAcesso();
				desktop.SelecionaCadastro5(desk,dama);
				
			}else if (desk.getRegistro()== 6){
				
				TrageCasuais outros = new TrageCasuais();
				ConexaoDesktopAcesso desktop = new ConexaoDesktopAcesso();
				desktop.SelecionaCadastro6(desk,outros);
				
			}else {
				JOptionPane.showMessageDialog(null, "Não entendeu o desk.getRegistro() ");
			}
	
	}
	public void ControleAcessoCadastroaba2() {
		Desktop desk = new Desktop();

	}
	public void ControleAcessoCadastroaba3() {
		Desktop desk = new Desktop();
	}

}