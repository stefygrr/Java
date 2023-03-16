package aula_01;

import java.util.Scanner;

public class Exer04 {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	float num1, num2, num3, num4, diferenca;
	
	System.out.println("Digite o primeiro numero:");
	num1= leia.nextFloat();
	System.out.println("Digite o segundo numero:");
	num2= leia.nextFloat();
	System.out.println("Digite o terceiro numero:");
	num3= leia.nextFloat();
	System.out.println("Digite o quarto numero:");
	num4= leia.nextFloat();
	
	diferenca = (num1 * num2) - (num3 * num4);
	
	System.out.print("A diferença é:" + diferenca);
	
	leia.close();
	

	}

}
