package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioSwitch {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		String nomeDoColaborador;
		int cargoDoColaborador;
		float salario;
		
		System.out.println("Digite seu nome:");
		nomeDoColaborador = leia.nextLine();
		
		System.out.println("\nDigite o número do seu cargo:");
		System.out.println("1 - Gerente ");
		System.out.println("2 - Vendedor ");
		System.out.println("3 - Supervisor ");
		System.out.println("4 - Motorista ");
		System.out.println("5 - Estoquista ");
		System.out.println("6 - Técnico de TI");
		cargoDoColaborador = leia.nextInt();
		
		switch (cargoDoColaborador) {
		
		case 1: 
		    System.out.println("Digite seu salário:");
		    salario = leia.nextFloat();
		    salario += (salario * 0.1);
		    
		    System.out.println("Nome de Funcionário: " + nomeDoColaborador);
		    System.out.println("Cargo do Funcionário: Gerente");
		    System.out.println("Salário do funcionário após o reajuste: R$" + df.format(salario));
		    break;
		
		case 2: 
			System.out.println("Digite seu salário:");
		    salario = leia.nextFloat();
		    salario += (salario * 0.07);
		    
		    System.out.println("Nome de Funcionário: " + nomeDoColaborador);
		    System.out.println("Cargo do Funcionário: Vendedor");
		    System.out.println("Salário do funcionário após o reajuste: R$" + df.format(salario));
		    break;
		
		case 3:
			System.out.println("Digite seu salário:");
		    salario = leia.nextFloat();
		    salario += (salario * 0.09);
		    
		    System.out.println("Nome de Funcionário: " + nomeDoColaborador);
		    System.out.println("Cargo do Funcionário: Supervisor");
		    System.out.println("Salário do funcionário após o reajuste: R$" + df.format(salario));
			break;
		
		case 4: 
			System.out.println("Digite seu salário:");
		    salario = leia.nextFloat();
		    salario += (salario * 0.06);
		    
		    System.out.println("Nome de Funcionário: " + nomeDoColaborador);
		    System.out.println("Cargo do Funcionário: Motorista");
		    System.out.println("Salário do funcionário após o reajuste: R$" + df.format(salario));
			break;
		
		case 5: 
			System.out.println("Digite seu salário:");
		    salario = leia.nextFloat();
		    salario += (salario * 0.05);
		    
		    System.out.println("Nome de Funcionário: " + nomeDoColaborador);
		    System.out.println("Cargo do Funcionário: Estoquista");
		    System.out.println("Salário do funcionário após o reajuste: R$" + df.format(salario));
			break;
		
		case 6: 
			System.out.println("Digite seu salário:");
		    salario = leia.nextFloat();
		    salario += (salario * 0.08);
		    
		    System.out.println("Nome de Funcionário: " + nomeDoColaborador);
		    System.out.println("Cargo do Funcionário: Técnico em TI");
		    System.out.println("Salário do funcionário após o reajuste: R$" + df.format(salario));
			break;
			
		default:
			System.out.println("Idade Inválida!");
			
		leia.close();
		
		}
		
	
		

	}

}
