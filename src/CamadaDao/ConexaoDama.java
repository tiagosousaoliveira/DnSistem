package CamadaDao;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import CamadaConexao.conexao;
import CamadaModel.Trage15Anos;
import CamadaModel.TrageDamaHonra;
import CamadaModel.TrageNoiva;

public class ConexaoDama {
	
	public static int retorno = 0;
	
	public void gravarnoSQL(TrageDamaHonra dama) {
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Entrou na Conexão GravarSQL");
		
		try{
			
			JOptionPane.showConfirmDialog(null, "try");
			
				conexao SQL = new conexao();
				SQL.conect();

                String sql = "insert into vestido_d (codigo,nome_roupa,detalhes,cor,estilo,peca1,peca2,obs_separacao,"
                			+ "valor,quantidade,altura,largura,busto,mangas,cintura,data_cadastro,modelo) "
                			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		       java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
		       JOptionPane.showConfirmDialog(null, "statment");

		       stm.setInt(1,dama.getId());
		       stm.setString(2,dama.getNome());
		       stm.setString(3,dama.getDetalhes());
		       stm.setString(4,dama.getCor());
		       stm.setString(5,dama.getEstilo());
		       stm.setString(6,dama.getOpcao1());
		       stm.setString(7,dama.getOpcao2());
		       stm.setString(8,dama.getObs());
		       stm.setString(9,dama.getValor());
		       stm.setInt(10,dama.getQuantidade());
		       stm.setString(11,dama.getAltura());
		       stm.setString(12,dama.getLargura());
		       stm.setString(13,dama.getBusto());
		       stm.setString(14,dama.getManga());
		       stm.setString(15,dama.getCintura());	
		       stm.setString(16,dama.getData_cadastro());	
		       stm.setString(17,dama.getModelo1());	
		      		
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
	public void updatenoSQL(TrageDamaHonra dama){
		// TODO Auto-generated constructor stub
		try {
			conexao SQL = new conexao();
			SQL.conect();
			
			String sql = "update vestido_d set nome_roupa =?,detalhes =?,cor =?,estilo =?,peca1 =?,peca2 =?,obs_separacao =?,"
                		+ "valor =?,quantidade =?,altura =?,largura =?,busto =?,mangas =?,cintura =?,data_cadastro =?,modelo =?"
                		+ "where codigo =? ";
						
						java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
						
					       stm.setString(1,dama.getNome());
					       stm.setString(2,dama.getDetalhes());
					       stm.setString(3,dama.getCor());
					       stm.setString(4,dama.getEstilo());
					       stm.setString(5,dama.getOpcao1());
					       stm.setString(6,dama.getOpcao2());
					       stm.setString(7,dama.getObs());
					       stm.setString(8,dama.getValor());
					       stm.setInt(9,dama.getQuantidade());
					       stm.setString(10,dama.getAltura());
					       stm.setString(11,dama.getLargura());
					       stm.setString(12,dama.getBusto());
					       stm.setString(13,dama.getManga());
					       stm.setString(14,dama.getCintura());	
					       stm.setString(15,dama.getData_cadastro());	
					       stm.setString(16,dama.getModelo1());
					       stm.setInt(17,dama.getId());
					       
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
