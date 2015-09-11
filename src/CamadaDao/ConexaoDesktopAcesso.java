package CamadaDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import CamadaConexao.conexao;
import CamadaModel.Desktop;
import CamadaModel.Trage15Anos;
import CamadaModel.TrageCasuais;
import CamadaModel.TrageDamaHonra;
import CamadaModel.TrageMadrinha;
import CamadaModel.TrageNoiva;
import CamadaModel.TrageNoivo;
import CamadaView.Trages15Anos;
import CamadaView.TragesCasuais;
import CamadaView.TragesDamadeHonra;
import CamadaView.TragesMadrinha;
import CamadaView.TragesNoiva;
import CamadaView.TragesNoivo;

public class ConexaoDesktopAcesso {
	
	public static int retorno ;

	public void SelecionaCadastro1(Desktop desk, TrageNoiva noiva) {
		try{
			JOptionPane.showMessageDialog(null, "o Eget Id é = "+ desk.getId()+"  E o registro é = "+ desk.getRegistro());
			JOptionPane.showMessageDialog(null, "Entrou no Try da Conexao");
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from vestido where codigo=?";
				
				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setInt(1,desk.getId());

				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){	
					
					noiva.setId(rs.getInt("codigo"));
					noiva.setNome( rs.getString("nome_roupa"));
					noiva.setDetalhes ( rs.getString("detalhes"));
					noiva.setCor (rs.getString("cor"));
					noiva.setEstilo ( rs.getString("estilo"));
					noiva.setOpcao1 ( rs.getString("peca1"));
					noiva.setOpcao2 ( rs.getString("peca2"));
					noiva.setObs (rs.getString("obs_separacao"));
					noiva.setValor ( rs.getString("valor"));
					noiva.setQuantidade(rs.getInt("quantidade"));
					noiva.setAltura (rs.getString("altura"));
					noiva.setLargura ( rs.getString("largura"));
					noiva.setBusto (rs.getString("busto"));
					noiva.setManga ( rs.getString("mangas"));
					noiva.setCintura ( rs.getString("cintura"));
					noiva.setData_cadastro ( rs.getString("data_cadastro"));
					noiva.setModelo1 ( rs.getString("modelo"));
					
					retorno = 0;
					retorno = retorno +1;
					TragesNoiva noiv = new TragesNoiva();
					noiv.retorno(noiva);

				}else {
					JOptionPane.showMessageDialog(null, " Não deu certo ");
					retorno = 0;
					retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			retorno = 0;
			retorno = retorno +3;
		}

	}
	public void SelecionaCadastro2(Desktop desk, TrageNoivo noivo) {
		try{
			
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from terno where codigo=?";
				
				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setInt(1,desk.getId());

				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){	
					
					noivo.setId(rs.getInt("codigo"));
					noivo.setNome( rs.getString("nome_roupa"));
					noivo.setDetalhes ( rs.getString("detalhes"));
					noivo.setCor (rs.getString("cor"));
					noivo.setEstilo ( rs.getString("estilo"));
					noivo.setOpcao1 ( rs.getString("peca1"));
					noivo.setOpcao2 ( rs.getString("peca2"));
					noivo.setObs (rs.getString("obs_separacao"));
					noivo.setValor ( rs.getString("valor"));
					noivo.setQuantidade(rs.getInt("quantidade"));
					noivo.setAltura (rs.getString("altura"));
					noivo.setLargura ( rs.getString("largura"));
					noivo.setBusto (rs.getString("busto"));
					noivo.setManga ( rs.getString("mangas"));
					noivo.setCintura ( rs.getString("cintura"));
					noivo.setData_cadastro ( rs.getString("data_cadastro"));
					noivo.setModelo1 ( rs.getString("modelo"));
					
					retorno = 0;
					retorno = retorno +1;
					TragesNoivo noiv = new TragesNoivo();
					noiv.retorno(noivo);



				}else {
					JOptionPane.showMessageDialog(null, " Não deu certo ");
					retorno = 0;
					retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			retorno = 0;
			retorno = retorno +3;
		}

	}
	public void SelecionaCadastro3(Desktop desk, Trage15Anos Quinzea) {
		try{
	
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from vestido_q where codigo=?";
				
				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setInt(1,desk.getId());

				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){	
					
					Quinzea.setId(rs.getInt("codigo"));
					Quinzea.setNome( rs.getString("nome_roupa"));
					Quinzea.setDetalhes ( rs.getString("detalhes"));
					Quinzea.setCor (rs.getString("cor"));
					Quinzea.setEstilo ( rs.getString("estilo"));
					Quinzea.setOpcao1 ( rs.getString("peca1"));
					Quinzea.setOpcao2 ( rs.getString("peca2"));
					Quinzea.setObs (rs.getString("obs_separacao"));
					Quinzea.setValor ( rs.getString("valor"));
					Quinzea.setQuantidade(rs.getInt("quantidade"));
					Quinzea.setAltura (rs.getString("altura"));
					Quinzea.setLargura ( rs.getString("largura"));
					Quinzea.setBusto (rs.getString("busto"));
					Quinzea.setManga ( rs.getString("mangas"));
					Quinzea.setCintura ( rs.getString("cintura"));
					Quinzea.setData_cadastro ( rs.getString("data_cadastro"));
					Quinzea.setModelo1 ( rs.getString("modelo"));
					
					retorno = 0;
					retorno = retorno +1;
					Trages15Anos noiv = new Trages15Anos();
					noiv.retorno(Quinzea);

				}else {
					JOptionPane.showMessageDialog(null, " Não deu certo ");
		//			retorno = 0;
		//			retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
		//	retorno = 0;
	//		retorno = retorno +3;
		}
		
	//	return retorno;
	}
	public void SelecionaCadastro4(Desktop desk, TrageMadrinha madrinhas) {
		try{
	
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from vestido_m where codigo=?";
				
				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setInt(1,desk.getId());

				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){	
					
					madrinhas.setId(rs.getInt("codigo"));
					madrinhas.setNome( rs.getString("nome_roupa"));
					madrinhas.setDetalhes ( rs.getString("detalhes"));
					madrinhas.setCor (rs.getString("cor"));
					madrinhas.setEstilo ( rs.getString("estilo"));
					madrinhas.setOpcao1 ( rs.getString("peca1"));
					madrinhas.setOpcao2 ( rs.getString("peca2"));
					madrinhas.setObs (rs.getString("obs_separacao"));
					madrinhas.setValor ( rs.getString("valor"));
					madrinhas.setQuantidade(rs.getInt("quantidade"));
					madrinhas.setAltura (rs.getString("altura"));
					madrinhas.setLargura ( rs.getString("largura"));
					madrinhas.setBusto (rs.getString("busto"));
					madrinhas.setManga ( rs.getString("mangas"));
					madrinhas.setCintura ( rs.getString("cintura"));
					madrinhas.setData_cadastro ( rs.getString("data_cadastro"));
					madrinhas.setModelo1 ( rs.getString("modelo"));
					
					retorno = 0;
					retorno = retorno +1;
					TragesMadrinha madrinha = new TragesMadrinha();
					madrinha.retorno(madrinhas);

				}else {
					JOptionPane.showMessageDialog(null, " Não deu certo ");
		//			retorno = 0;
		//			retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
		//	retorno = 0;
	//		retorno = retorno +3;
		}
		
	//	return retorno;
	}
	public void SelecionaCadastro5(Desktop desk, TrageDamaHonra dama) {
		try{
	
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from vestido_d where codigo=?";
				
				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setInt(1,desk.getId());

				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){	
					
					dama.setId(rs.getInt("codigo"));
					dama.setNome( rs.getString("nome_roupa"));
					dama.setDetalhes ( rs.getString("detalhes"));
					dama.setCor (rs.getString("cor"));
					dama.setEstilo ( rs.getString("estilo"));
					dama.setOpcao1 ( rs.getString("peca1"));
					dama.setOpcao2 ( rs.getString("peca2"));
					dama.setObs (rs.getString("obs_separacao"));
					dama.setValor ( rs.getString("valor"));
					dama.setQuantidade(rs.getInt("quantidade"));
					dama.setAltura (rs.getString("altura"));
					dama.setLargura ( rs.getString("largura"));
					dama.setBusto (rs.getString("busto"));
					dama.setManga ( rs.getString("mangas"));
					dama.setCintura ( rs.getString("cintura"));
					dama.setData_cadastro ( rs.getString("data_cadastro"));
					dama.setModelo1 ( rs.getString("modelo"));
					
					retorno = 0;
					retorno = retorno +1;
					TragesDamadeHonra dam = new TragesDamadeHonra();
					dam.retorno(dama);


				}else {
					JOptionPane.showMessageDialog(null, " Não deu certo ");
		//			retorno = 0;
		//			retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
		//	retorno = 0;
	//		retorno = retorno +3;
		}
		
	//	return retorno;
	}
	public void SelecionaCadastro6(Desktop desk, TrageCasuais outros) {
		try{
	
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from vestido_o where codigo=?";
				
				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setInt(1,desk.getId());

				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){	
					
					outros.setId(rs.getInt("codigo"));
					outros.setNome( rs.getString("nome_roupa"));
					outros.setDetalhes ( rs.getString("detalhes"));
					outros.setCor (rs.getString("cor"));
					outros.setEstilo ( rs.getString("estilo"));
					outros.setOpcao1 ( rs.getString("peca1"));
					outros.setOpcao2 ( rs.getString("peca2"));
					outros.setObs (rs.getString("obs_separacao"));
					outros.setValor ( rs.getString("valor"));
					outros.setQuantidade(rs.getInt("quantidade"));
					outros.setAltura (rs.getString("altura"));
					outros.setLargura ( rs.getString("largura"));
					outros.setBusto (rs.getString("busto"));
					outros.setManga ( rs.getString("mangas"));
					outros.setCintura ( rs.getString("cintura"));
					outros.setData_cadastro ( rs.getString("data_cadastro"));
					outros.setModelo1 ( rs.getString("modelo"));

					retorno = 0;
					retorno = retorno +1;
					TragesCasuais outro = new TragesCasuais();
					outro.retorno(outros);
					
				}else {
					JOptionPane.showMessageDialog(null, " Não deu certo ");
		//			retorno = 0;
		//			retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
		//	retorno = 0;
	//		retorno = retorno +3;
		}
		
	//	return retorno;
	}

}
