package CamadaDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import CamadaConexao.conexao;
import CamadaModel.Cliente;

public class ConexaoCliente {
	
	public static int retorno = 0;
	
	public void gravarnoSQL(Cliente cliente) {
		// TODO Auto-generated constructor stub

		try{
				conexao SQL = new conexao();
				SQL.conect();

                String sql = "insert into cliente (codigo,nome,cpf_cnpj,rg_insc,telefone,endereco,uf,complemento," +
                			 "inativo,bairro,cidade,banco,email,data_cadastro,qtd_alugueis,contato,tel_contato,alugueis)" +
                			 " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		       java.sql.PreparedStatement stm = SQL.con.prepareStatement(sql);
		       
		       stm.setInt(1,cliente.getId());
		       stm.setString(2,cliente.getNome_cliente());
		       stm.setString(3,cliente.getCpf_cnpj());
		       stm.setString(4,cliente.getRg_insc());
		       stm.setString(5,cliente.getTelefone());
		       stm.setString(6,cliente.getEndereco());
		       stm.setString(7,cliente.getUf_cliente());
		       stm.setString(8,cliente.getComplemento_cliente());
		       stm.setBoolean(9,cliente.getMarq());
		       stm.setString(10,cliente.getBairro());
		       stm.setString(11,cliente.getCidade());
		       stm.setString(12,cliente.getBanco());
		       stm.setString(13,cliente.getEmail());
		       stm.setString(14,cliente.getData_cadastro());
		       stm.setString(15,cliente.getUltimo_aluguel());	
		       stm.setString(16,cliente.getContato());	
		       stm.setString(17,cliente.getTelcontato());	
		       stm.setString(18,cliente.getAlugueis());	
		
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
	public void deletarnoSQL(Cliente cliente){
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Acessou com exito ");
		
		try{
			
			conexao cont = new conexao();
			cont.conect();
			
			String sql = "delete from cliente where nome=?";
			
			java.sql.PreparedStatement stm = cont.con.prepareStatement(sql);
			
			stm.setInt(1,cliente.getId());

			
			stm.execute();
			stm.close();
			
			JOptionPane.showConfirmDialog(null, "Cliente Deletado");
			
			conexao.con.close();
					
			
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null, "Não Deletou ");
		}
	}
	public void pesquisarnoSQL(){
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Acessou com exito ");
	}
	public void updatenoSQL(Cliente cliente){
		// TODO Auto-generated constructor stub
		JOptionPane.showMessageDialog(null, "Acessou com exito ");
	}
	public int BuscanoSQL(){
		
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
		
	}
}
