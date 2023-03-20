package aula_03;

import java.util.Scanner;

public class ExerMediaMultiplosDeTres {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero, soma = 0, count = 0;

		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();

			if (numero % 3 == 0 && numero > 0) {
				soma = soma + numero;
				count++;
			}
		} while (numero != 0);
			
		System.out.println("A média é: "+ (float) soma/count);
	}

}
