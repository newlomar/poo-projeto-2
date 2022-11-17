package jdbcflusao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	public static Connection getConexao() {
		try {
			final String url = "jdbc:mysql://localhost:3306/?user=root";
			final String usuario = "root";
			final String senha = "3Fadac#5*^euSGukhMywe$u%Q6$dud%";
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}