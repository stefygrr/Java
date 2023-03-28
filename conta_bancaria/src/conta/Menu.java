package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.util.Cores;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;


		// teste da Classe Conta
		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();

		// teste da CLasse Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Mariana", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		// teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Victor", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		while (true) {

			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.ANSI_BLACK_BACKGROUND
					+ "******************************************************");
			System.out.println("                                                      ");
			System.out.println("   		    BANCO DO BRAZIL COM Z             ");
			System.out.println("                                                      ");
			System.out.println("******************************************************");
			System.out.println("                                                      ");
			System.out.println("           1 - Criar Conta                            ");
			System.out.println("           2 - Listar todas as Contas                 ");
			System.out.println("           3 - Buscar Conta por Numero                ");
			System.out.println("           4 - Atualizar Dados da Conta               ");
			System.out.println("           5 - Apagar Conta                           ");
			System.out.println("           6 - Sacar                                  ");
			System.out.println("           7 - Depositar                              ");
			System.out.println("           8 - Transferir valores entre Contas        ");
			System.out.println("           9 - Sair                                   ");
			System.out.println("                                                      ");
			System.out.println("******************************************************");
			System.out.println(" Entre com a opção desejada:                          ");
			System.out.println("                                                      " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("Banco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);

			}

			switch (opcao) {

			case 1 -> {
				System.out.println("Criar Conta");

				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca
				}
				}

			}

			case 2 -> {
				System.out.println("Listar todas as Contas");

				// criar o objeto conta poupanca

			}

			case 3 -> {
				System.out.println("Consultar dados da Conta - por número");
				{
				}
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}
			case 4 -> {
				System.out.println("Atualizar dados da Conta");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				tipo = 1;
				// condicional buscar na collection

				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				// retornar tipo

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca

				}
				default -> {
					System.out.println("Tipo de conta inválido!");
				}
				}

				// fim do condicional buscar na collection
			}

			case 5 -> {
				System.out.println("Apagar a Conta");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}
			case 6 -> {
				System.out.println("Saque");

				System.out.println("Digite o nome da conta:");
				numero = leia.nextInt();

				System.out.println("Digite o valor do Saque:");
				valor = leia.nextFloat();

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}

			case 7 -> {
				System.out.println("Depósito\\n\\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				System.out.println("Digite o valor do Saque:");
				valor = leia.nextFloat();
			}
			case 8 -> {
				System.out.println("Transferência entre Contas");
				System.out.println("Digite o Numero da Conta de Origem: ");
				numero = leia.nextInt();
				System.out.println("Digite o Numero da Conta de Destino: ");
				numeroDestino = leia.nextInt();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();

				} while (valor <= 0);
				{

				}
			}

			default -> System.out.println("Opção inválida!");

			}
		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Stephany Camily - stefycamly@gmail.com");
		System.out.println("github.com/stefygrr");
		System.out.println("*********************************************************");
	}

}
