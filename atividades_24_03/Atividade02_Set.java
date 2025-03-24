package atividades_24_03;

import java.util.HashSet;
import java.util.Scanner;

public class Atividade02_Set {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		HashSet<Integer> listaNumeros = new HashSet<Integer>();
		
		listaNumeros.add(2);
		listaNumeros.add(5);
		listaNumeros.add(1);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(9);
		listaNumeros.add(7);
		listaNumeros.add(8);
		listaNumeros.add(10);
		listaNumeros.add(6);
		
		System.out.println("Digite o número que voce deseja encontrar: ");
		int numeroProcurado = lerScanner.nextInt();
		
		if (listaNumeros.contains(numeroProcurado)) {
			System.out.println("O número " + numeroProcurado + " foi encontrado!");
		} else {
			System.out.println("O numero " + numeroProcurado + " nao foi encontrado!");
		}
	}

}
