package aula_03;

import java.util.Scanner;

public class ExerIdadeTotal {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, totalPessoasIdadeMenor = 0, totalPessoasMaior = 0;

		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();

		if (idade < 21 && idade > 0) {
			totalPessoasIdadeMenor++;
		} else if (idade > 50) {
			totalPessoasMaior++;
		}

		while (idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

			if (idade < 21 && idade > 0) {
				totalPessoasIdadeMenor++;
			} else if (idade > 50) {
				totalPessoasMaior++;
			}

		}
		System.out.println("Total de pessoas menores de 21 anos: " + totalPessoasIdadeMenor);
		System.out.println("Total de pessoas mairoes de 50 anos: " + totalPessoasMaior);

	}

}
