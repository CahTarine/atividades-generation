package atividades18_03;

import java.util.Scanner;
import java.util.Locale;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		String nome;
		float salario, abono, novoSalario;
		
		
		System.out.println("-----------------------------------");
		System.out.println("Informe seu nome: ");
		nome = ler.nextLine();
		System.out.println("-----------------------------------");

		System.out.println("Digite o salário: ");
		salario = ler.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = ler.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf(nome + ", seu novo salário é de: %.2f", novoSalario);

	}

}
