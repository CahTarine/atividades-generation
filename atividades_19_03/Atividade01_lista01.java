package atividades_19_03;

import java.util.Scanner;

public class Atividade01_lista01 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.println("Informe o valor de A: ");
		a = lerScanner.nextInt();
		System.out.println("Informe o valor de B: ");
		b = lerScanner.nextInt();
		System.out.println("Informe o valor de C: ");
		c = lerScanner.nextInt();
		
		soma = a + b;
		
		if (soma > c) {
			System.out.println("A soma de A + B é maior que C.");
		} else if (soma == c) {
			System.out.println("A soma de A + B é igual a C.");
		} else {
			System.out.println("A soma de A + B é menor que C.");
		}
	}

}
