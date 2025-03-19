package atividades_19_03;

import java.util.Scanner;

public class Atividade01_lista02 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		int item, quantidade, total;
		
		System.out.println("Código do produto: ");
		item = lerScanner.nextInt();
		System.out.println("Quantidade: ");
		quantidade = lerScanner.nextInt();
		
		switch (item) {
		case 1:
			total = quantidade * 10;
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor total: R$" + total + ".00");
			
			break;
			
		case 2:
			total = quantidade * 15;
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: R$" + total + ".00");
			
			break;
			
		case 3:
			total = quantidade * 18;
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor total: R$" + total + ".00");
			
			break;
		case 4:
			total = quantidade * 12;
			System.out.println("Produto: Bauru");
			System.out.println("Valor total: R$" + total + ".00");
			
			break;
		case 5:
			total = quantidade * 8;
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total: R$" + total + ".00");
			
			break;
		case 6:
			total = quantidade * 13;
			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor total: R$" + total + ".00");
			break;
			
		}
	}

}
