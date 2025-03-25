package atividades_25_03;

import java.util.LinkedList;
import java.util.Scanner;

public class Atividade01_Fila {

	public static void main(String[] args) {
		LinkedList<String> clientes = new LinkedList<String>();
		Scanner lerScanner = new Scanner(System.in);
		
		boolean retornarMenu = false;
		int opcao;
		
		
		do {
			System.out.println("***********************************************");
			System.out.println("\n       1 - Adicionar clientes na fila");
			System.out.println("       2 - Listar todos os clientes");
			System.out.println("       3 - Retirar clientes da fila");
			System.out.println("       0 - Sair \n");
			System.out.println("***********************************************");

			System.out.println("\nDigite uma opcao: ");
			opcao = lerScanner.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.println("Digite o nome: ");
				lerScanner.nextLine();
				String nomeCliente = lerScanner.nextLine();
				clientes.add(nomeCliente);
				System.out.println("\nCliente Adicionado: " + nomeCliente);

				System.out.println("\nFila atual: ");
				for (String cliente: clientes) {
				 System.out.println(cliente);
				}
				
				System.out.println("\nDeseja retornar ao Menu? (s/n)");
				retornarMenu = lerScanner.next().equalsIgnoreCase("s");
				
				break;

			case 2: 
				System.out.println("Lista de clientes na fila: ");
				if (clientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					for (String cliente: clientes) {
						System.out.println(cliente);
					}
				}
				
				System.out.println("\nDeseja retornar ao Menu? (s/n)");
				retornarMenu = lerScanner.next().equalsIgnoreCase("s");
				
				break;
			case 3: 
				
				if (clientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Cliente chamado: " + clientes.poll());
					
					System.out.println("\nFila atual: ");
					for (String cliente: clientes) {
						System.out.println(cliente);
					}
				}
				
				
				System.out.println("\nDeseja retornar ao Menu? (s/n)");
				retornarMenu = lerScanner.next().equalsIgnoreCase("s");
				
				break;
				
			case 0:
				System.out.println("\nPrograma finalizado! Volte sempre :)");
				retornarMenu = false;
				break;
			}
		} while (retornarMenu);
		
		if (opcao != 0) {
			System.out.println("\nPrograma finalizado! Volte sempre :)");
		}
	}

}
