package atividades_20_03;

import java.util.Scanner;

public class Atividade02_DoWhile {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		int numero, contador = 0, somaMultiplos = 0;
		do {
			System.out.println("Digite um numero: ");
			numero = lerScanner.nextInt();
			
			if (numero % 3 == 0 && numero != 0) {
				somaMultiplos = somaMultiplos + numero;
				contador++;
			}
		} while (numero != 0);
		
		if (contador > 0) {
			float media = (float) somaMultiplos / contador;
			System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		} else {
			System.out.println("Nenhum número múltiplo de 3 encontrado.");
		}
		
	}

}
