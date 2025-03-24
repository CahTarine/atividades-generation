package atividades_24_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade01_List {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i+1) + "* cor: ");
			cores.add(lerScanner.nextLine());
		}
		

		System.out.println("Cores adicionadas: \n");
		for (String cor: cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		System.out.println("\nCores ordenadas: \n");
		for (String corOrdenada: cores) {
			System.out.println(corOrdenada);
		}

	}

}
