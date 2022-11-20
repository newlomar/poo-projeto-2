package jdbcflusao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirFunc {
	public void excluirFunc() {
		try {
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Informe o código: ");
			int codigo = entrada.nextInt();
			entrada.nextLine();
			
			Connection conexao = FabricaConexao.getConexao();
			
			String sql = "DELETE FROM ghflusao.func WHERE codigo = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.execute();
			
			System.out.println("\nFuncionario deletado com sucesso!\n");

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
