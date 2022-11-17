package jdbcflusao;

public class Aplicacao {

	public static void main(String[] args) {
		
		CriarBanco CriarBanco = new CriarBanco();
		CriarBanco.criaBanco();
		
		CriarTabelaFunc CriarTabelaFunc = new CriarTabelaFunc();
		CriarTabelaFunc.criaTabelaFunc();
		
		NovoFunc NovoFunc = new NovoFunc();
		NovoFunc.novoFunc();
		
		ConsultarFunc ConsultarFunc = new ConsultarFunc();
		ConsultarFunc.consultarFunc();
		
		ExcluirFunc ExcluirFunc = new ExcluirFunc();
		ExcluirFunc.excluirFunc();
		
		ConsultarFunc.consultarFunc();
		
	}

}
