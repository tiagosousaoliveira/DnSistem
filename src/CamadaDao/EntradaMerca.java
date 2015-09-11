package CamadaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import CamadaConexao.conexao;
import CamadaModel.EntradaItens;
/**
 *
 * @author Rosicléia Frasson
 */
public class EntradaMerca {

	private final String INSERT = "INSERT INTO CONTATO (NOME, TELEFONE, EMAIL) VALUES (?,?,?)";
	private final String UPDATE = "UPDATE CONTATO SET NOME=?, TELEFONE=?, EMAIL=? WHERE ID=?";
	private final String DELETE = "DELETE FROM CONTATO WHERE ID =?";
	private final String LIST = "SELECT * FROM itensent";
	private final String LISTBYID = "SELECT * FROM CONTATO WHERE ID=?";

	public void inserir(EntradaItens itens) {
		if (itens != null) {
			Connection conn = null;
			try {
				conexao conexao = new conexao();
				conexao.conect();
				PreparedStatement stm;
				stm = conn.prepareStatement(INSERT);

				stm.setInt	 (1, itens.getId());
				stm.setString(2, itens.getDescricao());
				stm.setInt	 (3, itens.getQuantidade());

				stm.execute();
				stm.close();
				JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso");
				conexao.con.close();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir contato no banco de"
						+ "dados " + e.getMessage());
			}
		} else {
			System.out.println("O contato enviado por parâmetro está vazio");
		}
	}

	public void atualizar(EntradaItens itens) {
		if (itens != null) {
			Connection conn = null;
			try {
				conexao conexao = new conexao();
				conexao.conect();
				PreparedStatement stm;
				stm = conn.prepareStatement(UPDATE);

				stm.setInt	 (1, itens.getId());
				stm.setString(2, itens.getDescricao());
				stm.setInt	 (3, itens.getQuantidade());
				
				stm.execute();
				stm.close();
				JOptionPane.showMessageDialog(null, "Contato alterado com sucesso");
				conexao.con.close();


			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao atualizar contato no banco de"
						+ "dados " + e.getMessage());
			}
		} else {
			JOptionPane.showMessageDialog(null, "O contato enviado por parâmetro está vazio");
		}


	}

	public void remover(int id) {
		Connection conn = null;
		try {
			conexao conexao = new conexao();
			conexao.conect();
			java.sql.PreparedStatement stm = conexao.con.prepareStatement(DELETE);
			ResultSet rs = stm.executeQuery();

			stm.setInt(1, id);

			stm.execute();
			stm.close();
			JOptionPane.showMessageDialog(null, "Contato alterado com sucesso");
			conexao.con.close();
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir contato do banco de"
					+ "dados " + e.getMessage());
		}
	}

	public List<EntradaItens> getContatos() {
		JOptionPane.showMessageDialog(null, " Entrou 1º");
		
		ArrayList<EntradaItens> contatos = new ArrayList<EntradaItens>();
		try {
			JOptionPane.showMessageDialog(null, " Entrou try");
			conexao conexao = new conexao();
			conexao.conect();
			java.sql.PreparedStatement stm = conexao.con.prepareStatement(LIST);
			ResultSet rs = stm.executeQuery();
			JOptionPane.showMessageDialog(null, " Entrou 2º");
			
			while (rs.next()) {
				
				EntradaItens itens = new EntradaItens();
				
				itens.setId(rs.getInt("codigo"));
				itens.setDescricao(rs.getString("descricao"));
				itens.setQuantidade(rs.getInt("quantidade"));
				
				contatos.add(itens);
			}
			stm.execute();
			stm.close();
			conexao.con.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
		}
		return contatos;
	}

/*	public contato getContatoById(int id) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		contato contato = new contato();
		try {
			conn = conexao.getConexao();
			pstm = conn.prepareStatement(LISTBYID);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			while (rs.next()) {
				contato.setId(rs.getInt("id"));
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));
				contato.setEmail(rs.getString("email"));
			}
			conexao.fechaConexao(conn, pstm, rs);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
		}
		return contato;
	}*/
}