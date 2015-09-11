package CamadaDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import CamadaConexao.conexao;
import CamadaModel.Desktop;

public class ConexaoDesktopPesquisa {
	
	public static int retorno;
	
	public int SelecionaCadastro1(Desktop desk) {
		// TODO Auto-generated constructor stub
		
		try{
			JOptionPane.showMessageDialog(null, "Combo"+desk.getModelo());		
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from vestido where modelo=?";

				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setString(1,desk.getModelo());
				
				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){
					
					desk.setId(rs.getInt("codigo"));
					desk.setModelo(rs.getString("estilo"));
					desk.setLocal_estoque(rs.getString("obs_separacao")) ;
					desk.setCores(rs.getString("cor"));
					desk.setObservacao(rs.getString("detalhes")) ;
					desk.setQuantidade(rs.getString("quantidade"));
					desk.setCombo(rs.getString("modelo"));
					
					JOptionPane.showMessageDialog(null,"Concluido");
					
					retorno = 0;
					retorno = retorno +1;
				
				}else {
					JOptionPane.showMessageDialog(null, " Pesquisa não Concluido ! ");
					retorno = 0;
					retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			retorno = 0;
			retorno = retorno +3;
		}
		JOptionPane.showMessageDialog(null,retorno);
		return retorno;
		
	}
	public int SelecionaCadastro2(Desktop desk) {
		// TODO Auto-generated constructor stub
		
		try{
			JOptionPane.showMessageDialog(null, "Combo"+desk.getModelo());		
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from terno where modelo=?";

				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setString(1,desk.getModelo());
				
				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){
					
					desk.setId(rs.getInt("codigo"));
					desk.setModelo(rs.getString("estilo"));
					desk.setLocal_estoque(rs.getString("obs_separacao")) ;
					desk.setCores(rs.getString("cor"));
					desk.setObservacao(rs.getString("detalhes")) ;
					desk.setQuantidade(rs.getString("quantidade"));
					desk.setCombo(rs.getString("modelo"));
					
					JOptionPane.showMessageDialog(null,"Concluido");
					
					
					retorno = 0;
					retorno = retorno +1;
				
				}else {
					JOptionPane.showMessageDialog(null, " Pesquisa não Concluido ! ");
					retorno = 0;
					retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			retorno = 0;
			retorno = retorno +3;
		}
		JOptionPane.showMessageDialog(null,retorno);
		return retorno;
		
	}
	public int SelecionaCadastro3(Desktop desk) {
		// TODO Auto-generated constructor stub
		
		try{
			JOptionPane.showMessageDialog(null, "Combo"+desk.getModelo());		
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from vestido_q where modelo=?";

				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setString(1,desk.getModelo());
				
				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){
					
					desk.setId(rs.getInt("codigo"));
					desk.setModelo(rs.getString("estilo"));
					desk.setLocal_estoque(rs.getString("obs_separacao")) ;
					desk.setCores(rs.getString("cor"));
					desk.setObservacao(rs.getString("detalhes")) ;
					desk.setQuantidade(rs.getString("quantidade"));
					desk.setCombo(rs.getString("modelo"));
					
					JOptionPane.showMessageDialog(null,"Concluido");
					
					
					retorno = 0;
					retorno = retorno +1;
				
				}else {
					JOptionPane.showMessageDialog(null, " Pesquisa não Concluido ! ");
					retorno = 0;
					retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			retorno = 0;
			retorno = retorno +3;
		}
		JOptionPane.showMessageDialog(null,retorno);
		return retorno;
		
	}
	public int SelecionaCadastro4(Desktop desk) {
		// TODO Auto-generated constructor stub
		
		try{
			JOptionPane.showMessageDialog(null, "Combo"+desk.getModelo());		
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from vestido_m where modelo=?";

				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setString(1,desk.getModelo());
				
				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){
					
					desk.setId(rs.getInt("codigo"));
					desk.setModelo(rs.getString("estilo"));
					desk.setLocal_estoque(rs.getString("obs_separacao")) ;
					desk.setCores(rs.getString("cor"));
					desk.setObservacao(rs.getString("detalhes")) ;
					desk.setQuantidade(rs.getString("quantidade"));
					desk.setCombo(rs.getString("modelo"));
					
					JOptionPane.showMessageDialog(null,"Concluido");
					
					
					retorno = 0;
					retorno = retorno +1;
				
				}else {
					JOptionPane.showMessageDialog(null, " Pesquisa não Concluido ! ");
					retorno = 0;
					retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			retorno = 0;
			retorno = retorno +3;
		}
		JOptionPane.showMessageDialog(null,retorno);
		return retorno;
		
	}
	public int SelecionaCadastro5(Desktop desk) {
		// TODO Auto-generated constructor stub
		
		try{
			JOptionPane.showMessageDialog(null, "Combo"+desk.getModelo());		
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from vestido_d where modelo=?";

				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setString(1,desk.getModelo());
				
				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){
					
					desk.setId(rs.getInt("codigo"));
					desk.setModelo(rs.getString("estilo"));
					desk.setLocal_estoque(rs.getString("obs_separacao")) ;
					desk.setCores(rs.getString("cor"));
					desk.setObservacao(rs.getString("detalhes")) ;
					desk.setQuantidade(rs.getString("quantidade"));
					desk.setCombo(rs.getString("modelo"));
					
					JOptionPane.showMessageDialog(null,"Concluido");
					
					
					retorno = 0;
					retorno = retorno +1;
				
				}else {
					JOptionPane.showMessageDialog(null, " Pesquisa não Concluido ! ");
					retorno = 0;
					retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			retorno = 0;
			retorno = retorno +3;
		}
		JOptionPane.showMessageDialog(null,retorno);
		return retorno;
		
	}
	public int SelecionaCadastro6(Desktop desk) {
		// TODO Auto-generated constructor stub
		
		try{
			JOptionPane.showMessageDialog(null, "Combo"+desk.getModelo());		
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "select *from vestido_o where modelo=?";

				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
				stm.setString(1,desk.getModelo());
				
				ResultSet rs = stm.executeQuery();
				
				if(rs.next()){
					
					desk.setId(rs.getInt("codigo"));
					desk.setModelo(rs.getString("estilo"));
					desk.setLocal_estoque(rs.getString("obs_separacao")) ;
					desk.setCores(rs.getString("cor"));
					desk.setObservacao(rs.getString("detalhes")) ;
					desk.setQuantidade(rs.getString("quantidade"));
					desk.setCombo(rs.getString("modelo"));
					
					JOptionPane.showMessageDialog(null,"Concluido");
					
					
					retorno = 0;
					retorno = retorno +1;
				
				}else {
					JOptionPane.showMessageDialog(null, " Pesquisa não Concluido ! ");
					retorno = 0;
					retorno = retorno +2;
				}

		       
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, " 'Erro no Processo com o Banco' ");
			retorno = 0;
			retorno = retorno +3;
		}
		JOptionPane.showMessageDialog(null,retorno);
		return retorno;
		
	}
}
