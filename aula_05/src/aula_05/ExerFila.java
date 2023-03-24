package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExerFila {
	
	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		
		int ordem = 0;
		String nome;
		
		
		do {
			System.out.println("1 - Adicionar um novo cliente na fila");
			System.out.println("2 - Listar todos os Clientes na fila");
			System.out.println("3 - Retirar uma pessoa da fila ");
			System.out.println("0 - Finalizar programa");
			System.out.println("Entre com a opção desejada: ");
			
			ordem = leia.nextInt();
			
			switch (ordem) {
			
			case 1:
				System.out.println("Adicionar um novo cliente");
				System.out.println("Digite o nome do cliente: ");
				nome = leia.next();
				fila.add(nome);
				
				System.out.println("Cliente Adicionado!");
				break;
				
			case 2:
				System.out.println("Listagem de clientes");

				for (var Listagem : fila)
					System.out.println(Listagem);
				
				break;

			case 3:
				System.out.println("Retirar a primeira pessoa da fila");
				fila.poll();

				System.out.println("O Cliente foi Chamado!");
				break;

			default:
				if (ordem > 3)
					System.out.println("Opção invalida");
				break;
			}

		} while (ordem!= 0);

		System.out.println("Programa finalizado! ");

		leia.close();

				
				
			}
		
		
	}

