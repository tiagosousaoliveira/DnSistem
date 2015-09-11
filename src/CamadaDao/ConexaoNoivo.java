package CamadaDao;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import CamadaConexao.conexao;
import CamadaModel.TrageNoivo;

public class ConexaoNoivo {
	
	public static int retorno = 0;
	
	public void gravarnoSQL(TrageNoivo noivo) {
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Entrou na Conexão GravarSQL");
		
		try{
			
			JOptionPane.showConfirmDialog(null, "try");
			
				conexao SQL = new conexao();
				SQL.conect();

                String sql = "insert into terno (codigo,nome_roupa,detalhes,cor,estilo,peca1,peca2,obs_separacao,"
                			+ "valor,quantidade,altura,largura,busto,mangas,cintura,data_cadastro,modelo) "
                			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		       java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
		       JOptionPane.showConfirmDialog(null, "statment");

		       stm.setInt(1,noivo.getId());
		       stm.setString(2,noivo.getNome());
		       stm.setString(3,noivo.getDetalhes());
		       stm.setString(4,noivo.getCor());
		       stm.setString(5,noivo.getEstilo());
		       stm.setString(6,noivo.getOpcao1());
		       stm.setString(7,noivo.getOpcao2());
		       stm.setString(8,noivo.getObs());
		       stm.setString(9,noivo.getValor());
		       stm.setInt(10,noivo.getQuantidade());
		       stm.setString(11,noivo.getAltura());
		       stm.setString(12,noivo.getLargura());
		       stm.setString(13,noivo.getBusto());
		       stm.setString(14,noivo.getManga());
		       stm.setString(15,noivo.getCintura());	
		       stm.setString(16,noivo.getData_cadastro());	
		       stm.setString(17,noivo.getModelo1());	
		      		
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
	public void deletarnoSQL(){
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Acessou com exito ");
	}
	public void updatenoSQL(TrageNoivo noivo){
		// TODO Auto-generated constructor stub
		try {
			conexao SQL = new conexao();
			SQL.conect();
			
			String sql = "update terno set nome_roupa =?,detalhes =?,cor =?,estilo =?,peca1 =?,peca2 =?,obs_separacao =?,"
                		+ "valor =?,quantidade =?,altura =?,largura =?,busto =?,mangas =?,cintura =?,data_cadastro =?,modelo =?"
                		+ "where codigo =? ";
						
						java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
						
					       stm.setString(1,noivo.getNome());
					       stm.setString(2,noivo.getDetalhes());
					       stm.setString(3,noivo.getCor());
					       stm.setString(4,noivo.getEstilo());
					       stm.setString(5,noivo.getOpcao1());
					       stm.setString(6,noivo.getOpcao2());
					       stm.setString(7,noivo.getObs());
					       stm.setString(8,noivo.getValor());
					       stm.setInt(9,noivo.getQuantidade());
					       stm.setString(10,noivo.getAltura());
					       stm.setString(11,noivo.getLargura());
					       stm.setString(12,noivo.getBusto());
					       stm.setString(13,noivo.getManga());
					       stm.setString(14,noivo.getCintura());	
					       stm.setString(15,noivo.getData_cadastro());	
					       stm.setString(16,noivo.getModelo1());
					       stm.setInt(17,noivo.getId());
					       
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
