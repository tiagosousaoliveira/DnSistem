package CamadaControle;

import javax.swing.JOptionPane;

import CamadaDao.ConexaoCliente;
import CamadaDao.ConexaoNoivo;
import CamadaModel.Cliente;
import CamadaModel.TrageNoivo;
import CamadaView.TelaCliente;
import CamadaView.TragesNoivo;


public class ControleCliente {
	
	public void ControleEscolhaCadastroaba1(Cliente cliente) {
		JOptionPane.showMessageDialog(null, "Entrou no controle da ABA 1");
			if(TelaCliente.verificafuncao ==1){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 1 do Controle");
				ConexaoCliente conexN = new ConexaoCliente();
				conexN.gravarnoSQL(cliente);
				
			}else if (TelaCliente.verificafuncao ==2){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 2 do Controle");
				ConexaoCliente conexN = new ConexaoCliente();
				conexN.updatenoSQL(cliente);
				
			}else if (TelaCliente.verificafuncao == 3){
				
				JOptionPane.showMessageDialog(null, "Entrou no If 3 do Controle");
				ConexaoCliente conexN = new ConexaoCliente();
				conexN.gravarnoSQL(cliente);
	
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
