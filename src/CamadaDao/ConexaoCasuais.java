package CamadaDao;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import CamadaConexao.conexao;
import CamadaModel.Trage15Anos;
import CamadaModel.TrageCasuais;
import CamadaModel.TrageNoiva;

public class ConexaoCasuais {
	
	public static int retorno = 0;
	
	public void gravarnoSQL(TrageCasuais outros) {
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Entrou na Conexão GravarSQL");
		
		try{
			
			JOptionPane.showConfirmDialog(null, "try");
			
				conexao SQL = new conexao();
				SQL.conect();

                String sql = "insert into vestido_o (codigo,nome_roupa,detalhes,cor,estilo,peca1,peca2,obs_separacao,"
                			+ "valor,quantidade,altura,largura,busto,mangas,cintura,data_cadastro,modelo) "
                			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		       java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
		       JOptionPane.showConfirmDialog(null, "statment");

		       stm.setInt(1,outros.getId());
		       stm.setString(2,outros.getNome());
		       stm.setString(3,outros.getDetalhes());
		       stm.setString(4,outros.getCor());
		       stm.setString(5,outros.getEstilo());
		       stm.setString(6,outros.getOpcao1());
		       stm.setString(7,outros.getOpcao2());
		       stm.setString(8,outros.getObs());
		       stm.setString(9,outros.getValor());
		       stm.setInt(10,outros.getQuantidade());
		       stm.setString(11,outros.getAltura());
		       stm.setString(12,outros.getLargura());
		       stm.setString(13,outros.getBusto());
		       stm.setString(14,outros.getManga());
		       stm.setString(15,outros.getCintura());	
		       stm.setString(16,outros.getData_cadastro());	
		       stm.setString(17,outros.getModelo1());	
		      		
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
	public void updatenoSQL(TrageCasuais outros){
		// TODO Auto-generated constructor stub
		try {
			conexao SQL = new conexao();
			SQL.conect();
			
			String sql = "update vestido_o set nome_roupa =?,detalhes =?,cor =?,estilo =?,peca1 =?,peca2 =?,obs_separacao =?,"
                		+ "valor =?,quantidade =?,altura =?,largura =?,busto =?,mangas =?,cintura =?,data_cadastro =?,modelo =?"
                		+ "where codigo =? ";
						
						java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
						
					       stm.setString(1,outros.getNome());
					       stm.setString(2,outros.getDetalhes());
					       stm.setString(3,outros.getCor());
					       stm.setString(4,outros.getEstilo());
					       stm.setString(5,outros.getOpcao1());
					       stm.setString(6,outros.getOpcao2());
					       stm.setString(7,outros.getObs());
					       stm.setString(8,outros.getValor());
					       stm.setInt(9,outros.getQuantidade());
					       stm.setString(10,outros.getAltura());
					       stm.setString(11,outros.getLargura());
					       stm.setString(12,outros.getBusto());
					       stm.setString(13,outros.getManga());
					       stm.setString(14,outros.getCintura());	
					       stm.setString(15,outros.getData_cadastro());	
					       stm.setString(16,outros.getModelo1());
					       stm.setInt(17,outros.getId());
					       
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
