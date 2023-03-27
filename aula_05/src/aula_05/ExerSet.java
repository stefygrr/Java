package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerSet {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		
		int resposta;
		
		numeros.add(1);
		numeros.add(7);
		numeros.add(13);
		numeros.add(19);
		numeros.add(24);
		numeros.add(32);
		
		System.out.println("Digite um numero para ver se existe: ");
		resposta = leia.nextInt();
		
		if(numeros.contains(resposta)) {
			System.out.println("O numero " + resposta + " foi encontrado");
		}else {
			System.out.println("O numero " + resposta + " não foi encomtrado");
		}
				
	}

}
