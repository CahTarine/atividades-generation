package atividades18_03;

import java.util.Scanner;
import java.util.Locale;

public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("Insira a primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.println("Insira a segunda nota: ");
		nota2 = ler.nextFloat();
		System.out.println("Insira a terceira nota: ");
		nota3 = ler.nextFloat();
		System.out.println("Insira a quarta nota: ");
		nota4 = ler.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Sua média final é de: %.1f", mediaFinal);
		
	}

}
