package atividades_19_03;

import java.util.Scanner;

public class Atividade03_lista01 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Insira o nome do doador: ");
		nome = lerScanner.nextLine();
		System.out.println("Insira a idade do doador: ");
		idade = lerScanner.nextInt();
		System.out.println("Primeira doacao de sangue? (responda com true para verdadeiro e false para falso):");
		primeiraDoacao = lerScanner.nextBoolean();
		
		if (idade >= 18 && idade < 60) {
			System.out.println(nome + " esta apto(a) para doar sangue.");
		} else if (idade >= 60 && idade <= 69 && !primeiraDoacao) {
			System.out.println(nome + " esta apto(a) para doar sangue.");
		} else {
			System.out.println(nome + " nao esta apto(a) para doar sangue.");
		}
		
	}

}
