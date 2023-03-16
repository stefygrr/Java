package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("###,##0.00");
	
	float salarioBruto, adicionalNoturno, desconto, salarioLiquido; 
	int horaExtra;
		
	System.out.println("Digite o salário bruto:");
	salarioBruto = leia.nextFloat();
	System.out.println("Digite o adicional noturno:");
	adicionalNoturno = leia.nextFloat();
	System.out.println("Digite o numero de horas extras:");
	horaExtra = leia.nextInt();
	System.out.println("Digite o desconto:");
	desconto = leia.nextFloat();
	
	salarioLiquido= salarioBruto + adicionalNoturno + (float) (horaExtra * 5) - desconto;
   
	System.out.println("O Salário Líquido é: "+ df.format(salarioLiquido));
	
	leia.close();

		
	}

	
	
	}


