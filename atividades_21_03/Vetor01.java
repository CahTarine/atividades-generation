package atividades_21_03;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		Arrays.sort(vetorInteiros);
		
		System.out.println("Qual número deseja encontrar? ");
		int numeroDesejado = lerScanner.nextInt();
		
		int posicao = Arrays.binarySearch(vetorInteiros, numeroDesejado);
		
		if (posicao >= 0) {
			System.out.println("O número " + numeroDesejado + " esta localizado na posicao " + posicao);
		} else {
			System.out.println("Número nao encontrado.");
		}
		
	}

}
