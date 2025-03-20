package atividades_20_03;

import java.util.Scanner;

public class Atividade01_DoWhile {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		int numero, numeroPositivo = 0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = lerScanner.nextInt();
			
			if (numero > 0) {
				numeroPositivo = numeroPositivo + numero;
			}
			
		} while (numero != 0);
		System.out.println("A soma dos números positivos é: " + numeroPositivo);
	}

}
