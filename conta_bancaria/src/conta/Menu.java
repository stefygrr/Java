package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
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

		ContaController contas = new ContaController();

		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumeros(), 123, 1, "João da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);

		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumeros(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);

		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumeros(), 125, 2, "Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);

		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumeros(), 125, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);

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

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
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

					contas.cadastrar(new ContaCorrente(contas.gerarNumeros(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					contas.cadastrar(
							new ContaPoupanca(contas.gerarNumeros(), agencia, tipo, titular, saldo, aniversario));
				}
				}

			}

			case 2 -> {
				System.out.println("Listar todas as Contas");
				contas.listarTodas();
				keyPress();

			}

			case 3 -> {
				System.out.println("Consultar dados da Conta - por número");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				contas.procurarPorNumero(numero);
				keyPress();
			}
			case 4 -> {
				System.out.println("Atualizar dados da Conta");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				if (contas.buscarNaCollection(numero) != null) {

					tipo = contas.retornaTipo(numero);

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

						contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
						// criar o objeto conta corrente
					}
					case 2 -> {
						System.out.println("Digite o dia do Aniversario da Conta: ");
						aniversario = leia.nextInt();

						contas.atualizar(
								new ContaPoupanca(contas.gerarNumeros(), agencia, tipo, titular, saldo, aniversario));
						// criar o objeto conta poupanca

					}
					default -> {
						System.out.println("Tipo de conta inválido!");
					}

					}

				} else
					System.out.println("A conta não foi encontrada!");

				// fim do condicional buscar na collection

			}
			case 5 -> {
				System.out.println("Apagar a Conta");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				contas.deletar(numero);
				keyPress();
			}
			case 6 -> {
				System.out.println("Saque");

				System.out.println("Digite o nome da conta:");
				numero = leia.nextInt();

				System.out.println("Digite o valor do Saque:");
				valor = leia.nextFloat();

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				contas.sacar(numero, valor);
			}

			case 7 -> {
				System.out.println("Depósito\\n\\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				System.out.println("Digite o valor do Saque:");
				valor = leia.nextFloat();
				contas.depositar(numero, valor);

			}
			case 8 -> {
				System.out.println("Transferência entre Contas");
				System.out.println("Digite o Numero da Conta de Origem: ");
				numero = leia.nextInt();
				System.out.println("Digite o Numero da Conta de Destino: ");
				numeroDestino = leia.nextInt();
				keyPress();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();

				} while (valor <= 0);

				contas.transferir(numero, numeroDestino, valor);
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

	public static void keyPress() {

		try {
			System.out.println(Cores.ANSI_BLUE_BACKGROUND_BRIGHT + "Pressione a tecla enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Erro de digitação!");
		}
	}

}
