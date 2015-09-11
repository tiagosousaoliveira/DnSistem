package CamadaDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import CamadaConexao.conexao;
import CamadaModel.Banco;
import CamadaModel.Loja;

public class ConexaoBanco {
	
	public static int retorno = 0;
	
	public void gravarnoSQL(Banco banco) {
		// TODO Auto-generated constructor stub

		try{
			
			conexao cont = new conexao();
			cont.conect();
			
			String sql = "insert into banco (codigo,nome,agencia,conta,observacao,data_cadastro)"
						+ "values(?,?,?,?,?,?)";

			java.sql.PreparedStatement stm = cont.con.prepareStatement(sql);
			
			stm.setInt(1,banco.getId());
			stm.setString(2,banco.getNome());
			stm.setString(3,banco.getAgencia());
			stm.setString(4,banco.getConta());
			stm.setString(5,banco.getObs());
			stm.setString(6,banco.getData_cadastro());

			
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
	public void pesquisarnoSQL(){
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Acessou com exito ");
	}
	public void updatenoSQL(Banco banco){
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Acessou com exito ");
	}

	public int BuscanoSQL(){
		
		try {
			conexao SQL = new conexao();
			SQL.conect();
		    
			String sql= "select *from bancos";
			java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);

			ResultSet rst= stm.executeQuery();
			
			if(rst.next()){
				
				if(rst.getInt("codigo")==(Bancos.recebsequencia)){
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
		
	}
}
