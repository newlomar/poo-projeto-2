package jdbcflusao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaFunc {
	public void criaTabelaFunc() {
		try {
			Connection conexao = FabricaConexao.getConexao();
			String base = "use ghflusao";
			String sql = "CREATE TABLE IF NOT EXISTS func ("
					+ " codigo INT AUTO_INCREMENT PRIMARY KEY,"
					+ " nome VARCHAR(80) NOT NULL,"
					+ " cargo VARCHAR(80) NOT NULL,"
					+ " end VARCHAR(80) NOT NULL)";
			
			Statement stmt = conexao.createStatement();
			stmt.execute(base);
			stmt.execute(sql);
			
			System.out.println("Tabela criada com sucesso!\n");
			conexao.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}