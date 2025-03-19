package atividades_19_03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade03_lista02 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in).useLocale(Locale.US);
		
		float num1, num2, resul;
		int codigo;
		
		System.out.println("Digite o primeiro número: ");
		num1 = lerScanner.nextFloat();
		System.out.println("Digite o segundo número: ");
		num2 = lerScanner.nextFloat();
		System.out.println("Escolha a operacao: \n (1) soma \n (2) subtracao \n (3) multiplicacao \n (4) divisao");
		codigo = lerScanner.nextInt();
		
		switch (codigo) {
		case 1: 
			resul = num1 + num2;
			System.out.println(num1 + " + " + num2 +" = "+ resul);
			break;
			
		case 2: 
			resul = num1 - num2;
			System.out.println(num1 + " - " + num2 +" = "+ resul);
			break;
			
		case 3: 
			resul = num1 * num2;
			System.out.println(num1 + " * " + num2 +" = "+ resul);
			break;
			
		case 4: 
			resul = num1 / num2;
			System.out.println(num1 + " / " + num2 +" = "+ resul);
			break;
			
			default:
				System.out.println("Operacao Inválida!");
		}
	}

}
