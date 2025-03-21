package atividades_21_03;

import java.util.Locale;
import java.util.Scanner;

public class Vetor02 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in).useLocale(Locale.US);

		int vetorInteiros[] = new int [10];
		int i = 0, soma = 0;
		String indicesImpares = "", elementosPares = "";
		
		for (i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite um numero: ");
			vetorInteiros[i] = lerScanner.nextInt();
			
		}
		
		for (i = 0; i < vetorInteiros.length; i++) {
			if (i % 2 != 0) {
				indicesImpares += vetorInteiros[i] + " ";
			}
		}
		
		for (i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] % 2 == 0) {
				elementosPares += vetorInteiros[i] + " ";
			}
		}
		
		for (i = 0; i < vetorInteiros.length; i++) {
			soma += vetorInteiros[i];
		}
		
		float media = (float) soma / vetorInteiros.length;
		
		System.out.println("Elementos nos índices ímpares: " + indicesImpares);
		System.out.println("Elementos pares: " + elementosPares);
		System.out.println("Soma: " + soma);
		System.out.printf("Média: %.2f", media);
	}

}
