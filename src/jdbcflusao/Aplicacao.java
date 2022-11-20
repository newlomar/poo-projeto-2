package jdbcflusao;

import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int continuar = 1;
		int opcao;
		while (continuar != 0) {
			System.out.println("---------Menu--------");
			System.out.println("");
			System.out.println("(1) Criar banco e tabela");
			System.out.println("(2) Adicionar funcionario");
			System.out.println("(3) Deletar funcionarios");
			System.out.println("(4) Ver funcionarios");
			System.out.println("(0) Para sair do programa");
			
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcao) {
			
				case 1:
					CriarBanco CriarBanco = new CriarBanco();
					CriarBanco.criaBanco();
					
					CriarTabelaFunc CriarTabelaFunc = new CriarTabelaFunc();
					CriarTabelaFunc.criaTabelaFunc();
					break;
					
				case 2:
					NovoFunc NovoFunc = new NovoFunc();
					NovoFunc.novoFunc();
					break;
				
				case 3:
					ExcluirFunc ExcluirFunc = new ExcluirFunc();
					ExcluirFunc.excluirFunc();
					break;
				
				case 4:
					ConsultarFunc ConsultarFunc = new ConsultarFunc();
					ConsultarFunc.consultarFunc();
					break;
			}
			continuar = opcao; 
		}
		System.out.println("\nPrograma finalizado");
	}
}
