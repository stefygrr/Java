package aula_02;

import java.util.Scanner;

public class ExerABCIf {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int A, B , C; 
			
		System.out.println("Escreva o valor A: ");
		A =leia.nextInt();
		
		System.out.println("Escreva o valor B: ");
		 B =leia.nextInt();
		
		System.out.println("Escreva o valor C: ");
		C =leia.nextInt();
		
		if(A + B > C ){
			System.out.println("A soma é maior que C");
		
		}else if(A + B < C ) {
			System.out.println("A soma é menor que C");
			
		}else{
			System.out.println("A soma é igual a C");
		
		}
			leia.close();
	}
}

