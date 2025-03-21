package atividades_21_03;

import java.util.Scanner;

public class Vetor01_Resolucao02 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int posicao = 0;
		
		System.out.println("Qual número deseja encontrar? ");
		int numeroDesejado = lerScanner.nextInt();
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] == numeroDesejado) {
				posicao = i;
			}
		}
		if (posicao >= 0) {
			System.out.println("O número " + numeroDesejado + " esta localizado na posicao " + posicao);
		} else {
			System.out.println("Número nao encontrado.");
		}
		
	}

}