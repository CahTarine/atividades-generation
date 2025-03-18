package atividades18_03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		float salarioBruto, addNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o valor de seu salário bruto: ");
		salarioBruto = ler.nextFloat();
		System.out.println("Digite o valor de seu adicional noturno: ");
		addNoturno = ler.nextFloat();
		System.out.println("Digite o valor da sua hora extra: ");
		horasExtras = ler.nextFloat();
		System.out.println("Digite o valor dos seus descontos: ");
		descontos = ler.nextFloat();
		
		salarioLiquido = salarioBruto + addNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Seu salário líquido este mes é de: %.2f", salarioLiquido);
		
	}

}
