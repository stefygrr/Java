package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		float salário;
		float abono;
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário:");
		salário = leia.nextFloat();
		
		System.out.println("Digite o abono:");
		abono = leia.nextFloat();
		
		System.out.println("Novo salário: \n" + df.format (salário + abono));
		
		leia.close();
		
		
		
		
		
		
		
		
				
		
		
	}

}
