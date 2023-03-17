package aula_02;

import java.util.Scanner;

public class ExerAnimais {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String resposta;
	
	
	System.out.println("Seu animal é Vertebrado ou Invertebrado? ");
	resposta = scan.nextLine();
	resposta = resposta.toLowerCase();
	
	if (resposta.equals("vertebrado")) {
		System.out.println("Seu animal é ave ou mamifero? ");
		resposta = scan.nextLine();
		resposta = resposta.toLowerCase();
		
		if (resposta.equals("ave")) {
			System.out.println("Seu animal é Onivoro ou carnivoro? ");
			resposta = scan.nextLine();
			resposta = resposta.toLowerCase();
			
			if (resposta.equals("onivoro")) {
				System.out.println("Seu animal é uma Pomba! ");
				
			}else if (resposta.equals("carnivoro")) {
				System.out.println("Seu animal é uma Águia! ");
			}else {
				System.out.println("Opção Inválida! ");
			}
			
		}else if (resposta.equals("mamifero")) {
			System.out.println("Seu animal é Onivoro ou Herbivoro? ");
			resposta = scan.nextLine();
			resposta = resposta.toLowerCase();
			
			if (resposta.equals("onivoro")) {
				System.out.println("Seu animal é um Homem");
				
			}else if (resposta.equals("herbivoro")) {
				System.out.println("Seu animal é uma Vaca! ");
			}else {
				System.out.println("Opção Inválida! ");
			}
					
			
			
		}else {
			System.out.println("Opção Inválida! ");
		}
	}else if (resposta.equals("invertebrado")) {
		System.out.println("Seu animal é um inseto ou anelídeo? ");
		resposta = scan.nextLine(); 
		resposta = resposta.toLowerCase();
				
		if(resposta.equals("inseto")) {
			System.out.println("seu animal é um Hematófago ou Herbívoro? ");
			resposta = scan.nextLine();
			resposta = resposta.toLowerCase();
			
			if (resposta.equals("hematofago")) {
				System.out.println("Seu animal é uma Pulga! ");
				
			}else if (resposta.equals("herbivoro")) {
				System.out.println("Seu animal é uma Lagarta! ");
				
			}else {
				System.out.println("Opção Inválida! ");
			}
					
					
		}else if (resposta.equals("anelideo")) {
			System.out.println("Seu animal é um Hematófago ou um Onívoro? ");
			resposta = scan.nextLine();
			resposta = resposta.toLowerCase();
			
			if(resposta.equals("hematofago")) {
				System.out.println("Seu animal é uma Sanguessuga! ");
				
				
			}else if(resposta.equals("onivoro")) {
				System.out.println("Seu animal é uma Minhoca! ");
				
				
			} else {
				System.out.println("Opção Inválida! ");
			}
			
					
		}else {
			System.out.println("Opção Inválida! ");
		}
			
			
	}else {
		System.out.println("Opção Inválida! ");
	}
	
	
	
	
	
	
	
	
	
	
	
	scan.close();
	}

}
