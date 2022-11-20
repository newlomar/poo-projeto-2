package jdbcflusao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovoFunc {
	public void novoFunc() {
		try {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Informe o nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Informe o cargo: ");
			String cargo = entrada.nextLine();
			
			System.out.print("Informe o endereco: ");
			String end = entrada.nextLine();
			
			Connection conexao = FabricaConexao.getConexao();
			
			String sql = "INSERT INTO ghflusao.func (nome, cargo, end) VALUES (?, ?, ?)";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setString(2, cargo);
			stmt.setString(3, end);
			
			stmt.execute();
			
			System.out.println("\nFuncionario inserido com sucesso!\n");

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}