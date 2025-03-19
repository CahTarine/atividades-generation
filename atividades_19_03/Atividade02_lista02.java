package atividades_19_03;

import java.util.Scanner;

public class Atividade02_lista02 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		String nome;
		int cargo;
		float salario, aumento, novoSalario;
		
		System.out.println("Nome do colaborador: ");
		nome = lerScanner.nextLine();
		
		System.out.println("Cargo: ");
		cargo = lerScanner.nextInt();
		
		System.out.println("Salário: ");
		salario = lerScanner.nextFloat();
		
		switch (cargo) {
		case 1: 
			aumento = (10 / 100.0f) * salario;
			novoSalario = salario + aumento;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente ");
			System.out.printf("Salário: %.2f", novoSalario);
			break;

			
		case 2: 
			aumento = (7 / 100.0f) * salario;
			novoSalario = salario + aumento;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor ");
			System.out.printf("Salário: %.2f", novoSalario);
			break;

			
		case 3: 
			aumento = (9 / 100.0f) * salario;
			novoSalario = salario + aumento;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor ");
			System.out.printf("Salário: %.2f", novoSalario);
			break;

			
		case 4: 
			aumento = (6 / 100.0f) * salario;
			novoSalario = salario + aumento;			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista ");
			System.out.printf("Salário: %.2f", novoSalario);
			break;

			
		case 5: 
			aumento = (5 / 100.0f) * salario;
			novoSalario = salario + aumento;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista ");
			System.out.printf("Salário: %.2f", novoSalario);
			break;

			
		case 6: 
			aumento = (8 / 100.0f) * salario;
			novoSalario = salario + aumento;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI ");
			System.out.printf("Salário: %.2f", novoSalario);
			break;
			
		}
	}

}
