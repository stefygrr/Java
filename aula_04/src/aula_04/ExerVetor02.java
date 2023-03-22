package aula_04;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerVetor02 {

	public static void main(String[] args) {
		        
		int vetorInteiros[] = new int[10], soma = 0;
        double media = 0 ;
        ArrayList<Integer> numerosImpares = new ArrayList<Integer>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();

        Scanner leia = new Scanner(System.in);

        for(int indice = 0; indice < 10; indice ++) {
            System.out.println("Digite o " + (indice + 1)  +"º Número: ");
            vetorInteiros[indice] = leia.nextInt();
            soma += vetorInteiros[indice];

            if(vetorInteiros[indice]%2 == 0) {
                numerosPares.add(vetorInteiros[indice]);
            }else {
                numerosImpares.add(vetorInteiros[indice]);
            }

        }

        System.out.println("Elementos numeros pares: ");
        System.out.print(numerosPares);
        System.out.println("Elementos impares: ");
        System.out.print(numerosImpares);
        System.out.println("\nSoma: "+soma);

        media = (double) soma/ vetorInteiros.length;
        System.out.println("Média "+media);
		        
	}
	
}	

	


