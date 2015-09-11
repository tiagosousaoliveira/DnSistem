package CamadaDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import CamadaConexao.conexao;
import CamadaModel.Usuario;



public class ConexaoUsuario {
	
	public static int retorno = 0;
	
	public void gravarnoSQL(Usuario usuario) {
		// TODO Auto-generated constructor stub

		try{
				conexao SQL = new conexao();
				SQL.conect();
				
				String sql = "insert into usuario (codigo,data_cadastro,nome,cpf,rg,telefone,funcao,cod_loja," +
							 "nome_loja,endereco,logon,senha,comissao,vendas,metas,inativo)" +
							 "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 
				java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
	
				stm.setInt(1,usuario.getId());
				stm.setString(2,usuario.getData());
				stm.setString(3,usuario.getNome());
				stm.setString(4,usuario.getCpf());
				stm.setString(5,usuario.getRg());
				stm.setString(6,usuario.getTelefone());
				stm.setString(7,usuario.getFuncao());
				stm.setString(8,usuario.getCodigo_loja());
				stm.setString(9,usuario.getLoja());
				stm.setString(10,usuario.getEndereco());
				stm.setString(11,usuario.getLogon());
			 	stm.setString(12,usuario.getSenha());
			  	stm.setString(13,usuario.getComissao());
				stm.setString(14,usuario.getVendas());
				stm.setString(15,usuario.getMetas());
				stm.setBoolean(16,usuario.getInativo());

				stm.execute();
				stm.close();

		       conexao.con.close();
		       retorno = 0;
		       retorno = retorno +1;
		       
		}catch(SQLException ex){

			retorno = 0;
			retorno = retorno +2;
			
		}
	}
	public void deletarnoSQL(Usuario usuario){
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Acessou com exito ");
		
		try{
			
			conexao cont = new conexao();
			cont.conect();
			
			String sql = "delete from usuario where nome=?";
			
			java.sql.PreparedStatement stm = cont.con.prepareStatement(sql);
			
			stm.setString(1,usuario.getNome());

			
			stm.execute();
			stm.close();			
			conexao.con.close();

		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null, " Erro na Exclusão ");
		}
		
	}
	public void pesquisarnoSQL(){
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Acessou com exito ");
	}
	public void updatenoSQL(Usuario usuario){
		// TODO Auto-generated constructor stub
		try {
			conexao SQL = new conexao();
			SQL.conect();
			
			String sql = "update usuario set data_cadastro=?,nome=?,cpf=?,rg=?,telefone=?,funcao=?,logon=?,senha=?,cod_loja=?," +
							 "nome_loja=?,endereco=?,comissao=?,vendas=?,metas_vendas=?" +
							 "where codigo=?";
						
						java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
						
							
							stm.setString(1,usuario.getData());
							stm.setString(2,usuario.getNome());
							stm.setString(3,usuario.getCpf());
							stm.setString(4,usuario.getRg());
							stm.setString(5,usuario.getTelefone());
							stm.setString(6,usuario.getFuncao());
							stm.setString(7,usuario.getLogon());
						 	stm.setString(8,usuario.getSenha());
							stm.setString(9,usuario.getCodigo_loja());
							stm.setString(10,usuario.getLoja());
							stm.setString(11,usuario.getEndereco());	
						  	stm.setString(12,usuario.getComissao());
							stm.setString(13,usuario.getVendas());
							stm.setString(14,usuario.getMetas());
							stm.setInt(15,usuario.getId());
						       
							stm.execute();
							stm.close();
							
							JOptionPane.showMessageDialog(null, "Alterações realizadas");
							
							conexao.con.close();
			
		}catch (SQLException e ){
			JOptionPane.showMessageDialog(null, "Entrou no catch");
		}
	}
/*	public int BuscanoSQL(){
		
		try {
			conexao SQL = new conexao();
			SQL.conect();
		    
			String sql= "select *from cliente";
			java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);

			ResultSet rst= stm.executeQuery();
			
			if(rst.next()){
				
				if(rst.getInt("codigo")==(Cliente.recebsequencia)){
					int c = rst.getInt("codigo");
					JOptionPane.showMessageDialog(null,	"Codigo "+c+" Já existe no Banco de Dados");
					retorno = 0;
					retorno = retorno+1;
					return retorno ;
					
				}else {
					
					ConexaoCliente clien= new ConexaoCliente();
					clien.gravarnoSQL();
					if (this.retorno ==1){
						JOptionPane.showMessageDialog(null,	"Gravado com Sucesso !!");
						retorno = 0;
						retorno = retorno +1;
						return retorno ;
					}else{
						retorno = 0;
						retorno = retorno +2;
						return retorno ;
					}
				}
									
			}else {
				
				ConexaoCliente clien= new ConexaoCliente();
				clien.gravarnoSQL();
				if (retorno ==1){
					JOptionPane.showMessageDialog(null,	"Gravado com Sucesso !!");
					retorno = retorno +1;
					return retorno ;
				}else{
					retorno = retorno +2;
					return retorno ;
				}

			}
					
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, "SQLException inconsistência dos dados!!");
			retorno = 0;
			retorno = retorno+4;
			return retorno ;

		}
		
	}*/
}
