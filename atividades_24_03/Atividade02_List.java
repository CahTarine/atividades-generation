package atividades_24_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade02_List {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
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
			int index = listaNumeros.indexOf(numeroProcurado);
			System.out.println("O numero " + numeroProcurado + " esta na posicao " + index);
		} else {
			System.out.println("O número " + numeroProcurado + " nao foi encontrado.");
		}
	}
}
