package aula_02;


import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerRestauranteSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		int escolha, quantidade;
		double valorTotal;
		
		System.out.println("Digite seu pedido:");
		System.out.println("1 - Cachorro Quente R$10,00 ");
		System.out.println("2 - X-Salada R$15,00 ");
		System.out.println("3 - X-Bacon R$18,00 ");
		System.out.println("4 - Bauru R$12,00");
		System.out.println("5 - Refrigerante R$8,00");
		System.out.println("6 - Suco de Laranja R$13,00");
		escolha = scan.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("Qual a quantidade do produto que você ira querer?");
			quantidade = scan.nextInt();
			valorTotal = quantidade * 10.00;
			System.out.println("O valor total será: R$" + df.format(valorTotal));
			
			break;
		case 2: 
			System.out.println("Qual a quantidade do produto que você ira querer?");
			quantidade = scan.nextInt();
			valorTotal = quantidade * 15.00;
			System.out.println("O valor total será: R$" + df.format(valorTotal) );
			
			break;	
		case 3: 
			System.out.println("Qual a quantidade do produto que você ira querer?");
			quantidade = scan.nextInt();
			valorTotal = quantidade * 18.00;
			System.out.println("O valor total será: R$" + df.format(valorTotal) );
			
			break;
		case 4: 
			System.out.println("Qual a quantidade do produto que você ira querer?");
			quantidade = scan.nextInt();
			valorTotal = quantidade * 12.00;
			System.out.println("O valor total será: R$" + df.format(valorTotal) );
			
			break;
		case 5: 
			System.out.println("Qual a quantidade do produto que você ira querer?");
			quantidade = scan.nextInt();
			valorTotal = quantidade * 8.00;
			System.out.println("O valor total será: R$" + df.format(valorTotal));
			
			break;
		case 6: 
			System.out.println("Qual a quantidade do produto que você ira querer?");
			quantidade = scan.nextInt();
			valorTotal = quantidade * 13.00;
			System.out.println("O valor total será: R$" + df.format(valorTotal));
			
			break;
		default:
			System.out.println("Opção Inválida!");
		}

	}

}
