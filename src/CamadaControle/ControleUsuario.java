package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.ConexaoNoivo;
import CamadaDao.ConexaoUsuario;
import CamadaModel.TrageNoivo;
import CamadaModel.Usuario;
import CamadaView.TelaUsuario;
import CamadaView.TragesNoivo;


public class ControleUsuario {
	
	public void ControleEscolhaCadastroaba1(Usuario usuario) {
		JOptionPane.showMessageDialog(null, "Entrou no controle da ABA 1");
			if(TelaUsuario.verificafuncao ==1){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				ConexaoUsuario conexN = new ConexaoUsuario();
				conexN.gravarnoSQL(usuario);
				
			}else if (TelaUsuario.verificafuncao ==2){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				ConexaoUsuario conexN = new ConexaoUsuario();
				conexN.updatenoSQL(usuario);
				
			}else if (TelaUsuario.verificafuncao == 3){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 3 do Controle");
				ConexaoUsuario conexN = new ConexaoUsuario();
				conexN.gravarnoSQL(usuario);
	
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
