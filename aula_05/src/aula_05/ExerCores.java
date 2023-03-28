package aula_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExerCores {

	public static void main(String[] args) {
	
		ArrayList<String> cores = new ArrayList();
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			cores.add(leia.next());
		}

		System.out.println(cores);
		System.out.println();
		Collections.sort(cores);
		System.out.println(cores);
		

	}
		

}


