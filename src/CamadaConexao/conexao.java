/**
 * 
 */
package CamadaConexao;

/**
 * @author Tiago e Adriana
 *
 */
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class conexao {
	
	public static Connection con;
	public static Statement stm;
	public static ResultSet rst;
	String Driver = "net.sourceforge.jtds.jdbc.Driver";
	String Url="Jdbc:jtds:sqlserver://localhost:1433/DN";
	String usuario ="sa";
	String senha="vls021130";

	public void conect() {
		try{
			Class.forName(Driver);

			con = DriverManager.getConnection(Url, usuario, senha);
			stm = con.createStatement();
			
		}catch(ClassNotFoundException ex){
			
			JOptionPane.showMessageDialog(null, "Driver não foi instalado !! ");
		    // Erro caso o driver JDBC não foi instalado
		    ex.printStackTrace();
		    
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null, "Erro de conexão no Banco !! ");
		    // Erro caso haja problemas para se conectar ao banco de dados
		    ex.printStackTrace();
			
		}
		
		
		
	}
	
	public void conexao() {
		try{
			
			String Drive = "net.sourceforge.jtds.jdbc.Driver";
			String url   = "Jdbc:jtds:sqlserver://localhost:1433"+"/";
			String usuar = "";
			String senh = "";
			Class.forName(Drive);

			con = DriverManager.getConnection(Url, usuario, senh);
			stm = con.createStatement();
			
		}catch(ClassNotFoundException ex){
			
			JOptionPane.showMessageDialog(null, "Driver não foi instalado !! ");
		    // Erro caso o driver JDBC não foi instalado
		    ex.printStackTrace();
		    
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null, "Erro de conexão no Banco !! ");
		    // Erro caso haja problemas para se conectar ao banco de dados
		    ex.printStackTrace();
			
		}
	}
}

