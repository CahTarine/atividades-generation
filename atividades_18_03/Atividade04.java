package atividades18_03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Insira o primeiro valor: ");
		n1 = ler.nextFloat();	
		System.out.println("Insira o primeiro valor: ");
		n2 = ler.nextFloat();	
		System.out.println("Insira o primeiro valor: ");
		n3 = ler.nextFloat();	
		System.out.println("Insira o primeiro valor: ");
		n4 = ler.nextFloat();	
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferenca dos produtos é de: " + diferenca);
		
	}

}
