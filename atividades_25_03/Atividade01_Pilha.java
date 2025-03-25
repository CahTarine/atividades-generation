package atividades_25_03;

import java.util.Scanner;
import java.util.Stack;

public class Atividade01_Pilha {

	public static void main(String[] args) {
		Stack<String> livros = new Stack<String>();
		Scanner lerScanner = new Scanner(System.in);
		
		boolean voltarMenu = false;
		int opcao;

		do {
			System.out.println("***********************************************");
			System.out.println("\n       1 - Adicionar livro na pilha");
			System.out.println("       2 - Listar todos os livros");
			System.out.println("       3 - Retirar livros da pilha");
			System.out.println("       0 - Sair \n");
			System.out.println("***********************************************");
			
			System.out.println("Digite uma opcao: ");
			opcao = lerScanner.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				lerScanner.nextLine();
				String nomeLivro = lerScanner.nextLine();
				livros.push(nomeLivro);
				
				System.out.println("\nLivro adicionado: " + nomeLivro);
				System.out.println("\nPilha de livros:");
				for (String pilha: livros) {
					System.out.println(pilha);
				}
				
				System.out.println("\nDeseja voltar ao Menu? (s/n)");
				voltarMenu = lerScanner.next().equalsIgnoreCase("s");
				
				break;
				
			case 2: 
				if (livros.isEmpty()) {
					System.out.println("\nA pilha de livros esta vazia!");
				} else {
					System.out.println("Lista de livros na pilha: ");
					for (String pilha: livros) {
						System.out.println(pilha);
					}
				}
				
				System.out.println("\nDeseja voltar ao Menu? (s/n)");
				voltarMenu = lerScanner.next().equalsIgnoreCase("s");
				
				break;
				
			case 3:
				if (livros.isEmpty()) {
					System.out.println("A pilha esta vazia.");
				} else {
					System.out.println("\nLivro retirado da pilha: " + livros.pop());
					
					System.out.println("\nPilha de livros: ");
					for (String pilha: livros) {
						System.out.println(pilha);
					}
				}
				
				
				
				System.out.println("\nDeseja voltar ao Menu? (s/n)");
				voltarMenu = lerScanner.next().equalsIgnoreCase("s");
				
				break;
				
			case 0:
				System.out.println("\nPrograma finalizado. Volte sempre :)");
				voltarMenu = false;
				break;
			}

		} while (voltarMenu);
		
		if (opcao != 0) {
			System.out.println("\nPrograma finalizado. Volte sempre :)");

		}
	}

}
