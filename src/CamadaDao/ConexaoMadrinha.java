package CamadaDao;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import CamadaConexao.conexao;
import CamadaModel.Trage15Anos;
import CamadaModel.TrageMadrinha;
import CamadaModel.TrageNoiva;

public class ConexaoMadrinha {
	
	public static int retorno = 0;
	
	public void gravarnoSQL(TrageMadrinha madrinha) {
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Entrou na Conexão GravarSQL");
		
		try{
			
			JOptionPane.showConfirmDialog(null, "try");
			
				conexao SQL = new conexao();
				SQL.conect();

                String sql = "insert into vestido_m (codigo,nome_roupa,detalhes,cor,estilo,peca1,peca2,obs_separacao,"
                			+ "valor,quantidade,altura,largura,busto,mangas,cintura,data_cadastro,modelo) "
                			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		       java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
		       JOptionPane.showConfirmDialog(null, "statment");

		       stm.setInt(1,madrinha.getId());
		       stm.setString(2,madrinha.getNome());
		       stm.setString(3,madrinha.getDetalhes());
		       stm.setString(4,madrinha.getCor());
		       stm.setString(5,madrinha.getEstilo());
		       stm.setString(6,madrinha.getOpcao1());
		       stm.setString(7,madrinha.getOpcao2());
		       stm.setString(8,madrinha.getObs());
		       stm.setString(9,madrinha.getValor());
		       stm.setInt(10,madrinha.getQuantidade());
		       stm.setString(11,madrinha.getAltura());
		       stm.setString(12,madrinha.getLargura());
		       stm.setString(13,madrinha.getBusto());
		       stm.setString(14,madrinha.getManga());
		       stm.setString(15,madrinha.getCintura());	
		       stm.setString(16,madrinha.getData_cadastro());	
		       stm.setString(17,madrinha.getModelo1());	
		      		
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
	public void updatenoSQL(TrageMadrinha madrinha){
		// TODO Auto-generated constructor stub
		try {
			conexao SQL = new conexao();
			SQL.conect();
			
			String sql = "update vestido_m set nome_roupa =?,detalhes =?,cor =?,estilo =?,peca1 =?,peca2 =?,obs_separacao =?,"
                		+ "valor =?,quantidade =?,altura =?,largura =?,busto =?,mangas =?,cintura =?,data_cadastro =?,modelo =?"
                		+ "where codigo =? ";
						
						java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
						
					       stm.setString(1,madrinha.getNome());
					       stm.setString(2,madrinha.getDetalhes());
					       stm.setString(3,madrinha.getCor());
					       stm.setString(4,madrinha.getEstilo());
					       stm.setString(5,madrinha.getOpcao1());
					       stm.setString(6,madrinha.getOpcao2());
					       stm.setString(7,madrinha.getObs());
					       stm.setString(8,madrinha.getValor());
					       stm.setInt(9,madrinha.getQuantidade());
					       stm.setString(10,madrinha.getAltura());
					       stm.setString(11,madrinha.getLargura());
					       stm.setString(12,madrinha.getBusto());
					       stm.setString(13,madrinha.getManga());
					       stm.setString(14,madrinha.getCintura());	
					       stm.setString(15,madrinha.getData_cadastro());	
					       stm.setString(16,madrinha.getModelo1());
					       stm.setInt(17,madrinha.getId());
					       
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
