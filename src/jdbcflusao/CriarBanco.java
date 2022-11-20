package jdbcflusao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public void criaBanco() {
		try {
			Connection conexao = FabricaConexao.getConexao();
			
			Statement stmt = conexao.createStatement();
			stmt.execute("CREATE DATABASE IF NOT EXISTS ghflusao");
			
			System.out.println("Banco criado com sucesso!\n");
			conexao.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
