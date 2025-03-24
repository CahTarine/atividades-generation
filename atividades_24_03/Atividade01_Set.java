package atividades_24_03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade01_Set {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		HashSet<Integer> setValores =  new HashSet<Integer> ();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "* valor: ");
			setValores.add(lerScanner.nextInt());
		}
		
		Iterator<Integer> iSetValores = setValores.iterator();
		
		System.out.println("Valores inseridos: \n");
		while (iSetValores.hasNext()) {
			System.out.println(iSetValores.next());

		}
	}

}
