package atividades_20_03;

import java.util.Scanner;

public class Atividade01_While {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		int idade = 1, menor21 = 0, maior50 = 0;
		
		while (idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = lerScanner.nextInt();
			
			if (idade < 21 && idade > 0) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
	}

}
