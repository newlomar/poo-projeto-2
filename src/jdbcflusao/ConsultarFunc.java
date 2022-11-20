package jdbcflusao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarFunc {
	public void consultarFunc() {
		try {
			Connection conexao = FabricaConexao.getConexao();
			String sql = "SELECT * FROM ghflusao.func";

			Statement stmt = conexao.createStatement();
			ResultSet resultado = stmt.executeQuery(sql);

			List<Func> funcionarios = new ArrayList<>();

			while (resultado.next()) {
				int codigo = resultado.getInt("codigo");
				String nome = resultado.getString("nome");
				String cargo = resultado.getString("cargo");
				String end = resultado.getString("end");

				funcionarios.add(new Func(codigo, nome, cargo, end));
			}

			for (Func f : funcionarios) {
				System.out.println("\nCodigo: " + f.getCodigo() + " | Nome: " + f.getNome() + " | Cargo: " + f.getCargo() + " | Endereço: " + f.getEnd() + "\n");
			}

			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
