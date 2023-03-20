package aula_03;

import java.util.Scanner;

public class ExerParImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, totalPares = 0, totalImpar= 0;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("infome um numero:");
			numero = leia.nextInt();
			
			
			if(numero%2 == 0) {
			totalPares ++;
			
			}else {
			totalImpar ++;
			}
		}
		System.out.println("Total de pares: " + totalPares);
		System.out.println("Total de Impares:");
		
	}

}
