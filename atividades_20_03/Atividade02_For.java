package atividades_20_03;

import java.util.Scanner;

public class Atividade02_For {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		int numeroPar = 0,numeroImpar = 0 ;
		
		for (int cont=1; cont <= 10; cont++) {
			System.out.println("Digite o "+ cont + "* numero: ");
			int numero = lerScanner.nextInt();
			
			if (numero % 2 == 0) {
				numeroPar ++;
			} else {
				numeroImpar ++;
			}
			
		}
		System.out.println("Total de números pares: " + numeroPar);
		System.out.println("Total de números ímpares: " + numeroImpar);
	}

}
