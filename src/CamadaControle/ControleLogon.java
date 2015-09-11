package CamadaControle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.JOptionPane;

import CamadaConexao.conexao;
import CamadaView.TelaDesktop;
import CamadaView.TelaLogon;
import CamadaView.TelaUsuario;

public class ControleLogon {
	Calendar ca;
	int horario;	
	public static int retorno = -1;

	public int ControleLogon() {
		
		ca = Calendar.getInstance();
		horario = ca.get(Calendar.HOUR_OF_DAY);
		
		if(TelaLogon.campologon.getText().equals("") && TelaLogon.camposenha.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Informe o Usuario e Senha ");
					TelaLogon.campologon.setText("");	
					TelaLogon.camposenha.setText("");
		}else if (TelaLogon.campologon.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Informe o 'Usuario' ");
					TelaLogon.camposenha.setText("");
		}else if (TelaLogon.camposenha.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Informe a 'Senha' ");
					TelaLogon.campologon.setText("");
		}else {
						    	
			try {
		
					conexao conx = new conexao();
					conx.conect();
					    		
					String sql = "select *from usuario where logon=? and senha=?";	
					java.sql.PreparedStatement stm = conx.con.prepareStatement(sql);
					stm.setString(1,TelaLogon.campologon.getText());
					stm.setString(2,TelaLogon.camposenha.getText());
					
					ResultSet rst = stm.executeQuery();
					if (rst.next()){
							
							if (horario >= 1.00 && horario < 11.59){	
								JOptionPane.showMessageDialog(null, "Bom dia :" + rst.getString("logon"));
								TelaDesktop tela1 = new TelaDesktop();
						    	tela1.setVisible(true);
						    	retorno = 0;	
							}else if (horario >=12 && horario < 17.59){		
								JOptionPane.showMessageDialog(null, "Boa tarde :" + rst.getString("logon"));
								TelaDesktop tela1 = new TelaDesktop();
						    	tela1.setVisible(true);
						    	retorno = 0;	
							}else if (horario >= 18 && horario < 23.59){
								JOptionPane.showMessageDialog(null, "Boa noite :" + rst.getString("logon"));
								TelaDesktop tela1 = new TelaDesktop();
						    	tela1.setVisible(true);
						    	retorno = 0;		
								
							}else{
								JOptionPane.showMessageDialog(null, "Não reconheceu as Hora (Verifique o seu relogio)");	
							}

	    			}else {
	    				
						JOptionPane.showMessageDialog(null, "Seus Usuario não possui cadastro!");
						int escolha =( JOptionPane.showConfirmDialog(null, "Deseja Cadastrar ?"));
							if(escolha == 0){
								TelaUsuario cadastrodeusuario=new TelaUsuario();
								cadastrodeusuario.setVisible(true);
								TelaLogon.campologon.setText("");
								TelaLogon.camposenha.setText("");
								retorno =1;
							}else{
						   		JOptionPane.showMessageDialog(null, "Até Logo");
						   		TelaLogon.campologon.setText("");
						   		TelaLogon.camposenha.setText("");
						   		retorno =2;
						   	}
					}
						    		
			}catch(SQLException ex){
				
			  		JOptionPane.showMessageDialog(null,"ERRO NO CODIGO!");
						    		
			}
						    		
			
		}
		           //Retorno para função Logon dispose...
					return retorno;
					
    }

}
