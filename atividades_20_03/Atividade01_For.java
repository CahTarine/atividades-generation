package atividades_20_03;

import java.util.Scanner;

public class Atividade01_For {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		boolean temMultiplos = false;

		System.out.println("Digite o primeiro numero do intervalo: ");
		int numero1 = lerScanner.nextInt();
		System.out.println("Digite o ultimo numero do intervalo: ");
		int numero2 = lerScanner.nextInt();
		
		if (numero1 >= numero2) {
			System.out.println("Intervalo inválido!");
		} else {
			for (int cont = numero1; cont <= numero2; cont++) {
				if ((cont % 3 == 0) && (cont % 5 == 0)) {
					System.out.println(cont +" é multiplo de 3 e 5");
					temMultiplos = true;
				}
			}
			if (!temMultiplos) {
				System.out.println("Nao achamos nenhum numero multiplo de 3 e 5 neste intervalo.");
			}	
		}
	}

}
