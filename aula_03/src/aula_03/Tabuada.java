package aula_03;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Mostre a tabuada do número: ");
		numero = leia.nextInt();
		
		System.out.println("Tabela Completa");
		
		for (int contador = 1; contador <= 10; contador ++) {
			if(contador%2 == 0);
			
			System.out.println(numero + "x" + contador + " = " + (numero * contador));
		
			leia.close();
		
		}
		
		
	
		
		

	}

}
