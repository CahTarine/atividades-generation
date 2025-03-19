package atividades_19_03;

import java.util.Scanner;

public class Atividade02_lista01 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número: ");
		numero = lerScanner.nextInt();
		
		if (numero % 2 == 0 && numero > 0) {
			System.out.println("O número " + numero + " é par e positivo");
		} else if (numero % 2 != 0 && numero > 0) {
			System.out.println("O número " + numero + " é ímpar e positivo");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo");
		} else {
			System.out.println("O número " + numero + " é ímpar e negativo");
		}
	}

}
