import java.util.Random;
import java.util.Scanner;

public class Cardapio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int escolha;
		String[][] CadastroUsuario = new String[1][4]; // Matriz para cadastrar os usuários
		String[][] Restaurantes = {
				{ "Paladar", "7895446", "Marmitas", "R$20,00" },
				{ "Primavera", "4547812", "Pizzas", "R$70,00" }, };
		do {
			System.out.println("\n-----Bem vindo-----\n" + "Escolha uma das opções que deseja");
			System.out.print("Opção 1 --> Realize seu cadastro\n" +
					"Opção 2 --> Fazer pedido\n" +
					"Opção 3 --> Efetuar pagamento\n" +
					"Opção 4 --> Mostrar pedido\n" +
					"Opção 5 --> Digite 0 para sair do programa\n" + "-->");
			escolha = ler.nextInt();
			switch (escolha) {

				case 1:
					System.out.println(RealizarCadastro(CadastroUsuario, ler));
					break;
				case 2:
					ListarRestaurantes(Restaurantes, ler);
					break;
				case 3:
					FazerPagamento(Restaurantes, ler);
					break;
				case 4:
					System.out.println("Mostrar pedido");
					break;

				default:
					break;
			}

		} while (escolha != 0);

		System.out.println("Programa Encerrado");

	}

	public static String RealizarCadastro(String[][] CadastroUsuario, Scanner ler) {
		System.out.println("-----------------------------------------------------");
		System.out.println("===Realize seu cadastro===");

		Random random = new Random();
		int senhaAleatoria = random.nextInt(10000);

		// Consumir a quebra de linha deixada após o número lido
		ler.nextLine();

		System.out.print("Nome:");
		CadastroUsuario[0][0] = ler.nextLine();

		System.out.print("Idade:");
		CadastroUsuario[0][1] = ler.nextLine();

		System.out.print("CPF:");
		CadastroUsuario[0][2] = ler.nextLine();

		System.out.println("Sua senha é:" + senhaAleatoria);
		CadastroUsuario[0][3] = String.valueOf(senhaAleatoria);

		LoginUsuario(CadastroUsuario, ler);

		return "";
	}

	public static void LoginUsuario(String[][] CadastroUsuario, Scanner ler) {
		System.out.println("-----------------------------------------------------");

		System.out.println("===Faça seu login===");
		int maxTentativa = 2;
		int tentativa = 0;
		boolean loginSucesso = false;

		while (!loginSucesso && tentativa < maxTentativa) {
			System.out.print("Informe seu nome:");
			String nome = ler.nextLine();

			System.out.print("Informe sua senha:");
			String senha = ler.nextLine();

			for (int i = 0; i < CadastroUsuario.length; i++) {
				if (nome.equalsIgnoreCase(CadastroUsuario[i][0]) && senha.equalsIgnoreCase(CadastroUsuario[i][3])) {
					System.out.println("==Seja bem vindo== " + nome);
					loginSucesso = true; // Defina como true para sair do loop
					break; // Saia do loop de verificação
				}
			}

			if (!loginSucesso) {
				System.out.println("-----------------------------------------------------");
				System.out.println("xxxxUsuário não encontradoxxxx\n" + ("Informe seus dados"));
				tentativa++; // Incrementa o contador de tentativas

				if (tentativa < maxTentativa) {
					System.out.println("Tentativa " + tentativa + " de " + maxTentativa);
				} else {
					System.out.println("Número máximo de tentativas excedido. Refaça seu cadastro.");
				}
			}
		}

		if (loginSucesso) {

		}
	}

	public static void ListarRestaurantes(String[][] Restaurantes, Scanner ler) {
		String[][] PratosRestaurantes = new String[][] {
				{ "Arroz", "Feijão", "Ovo", "Fritas", "Salada" },
				{ "Calabresa", "Coração", "4 Queijos", "Strogonof", "Camarão" },
		};

		System.out.println("-----------------------------------------------------");
		System.out.println("\n                 ===Restaurantes===\n"
				+ "    Nome         CNPJ          Pratos        Valores\n");

		for (int i = 0; i < Restaurantes.length; i++) {
			for (int j = 0; j < Restaurantes[i].length; j++) {
				String formattedValue = String.format("| %-12s", Restaurantes[i][j]);
				System.out.print(formattedValue);
			}
			System.out.println("|");
		}

		int tentativa = 0;
		int tentativaMax = 2;
		boolean restauranteEncontrado = false;

		while (!restauranteEncontrado && tentativa < tentativaMax) {
			System.out.print("\nEscolha o nome do restaurante:\n" + ("-->"));
			String nomeRestaurante = ler.next();
			ler.nextLine();

			for (int i = 0; i < Restaurantes.length; i++) {
				if (nomeRestaurante.equalsIgnoreCase(Restaurantes[i][0])) {
					System.out.println("-->Restaurante: " + Restaurantes[i][0]);
					System.out.println("Cardápio:");
					for (String prato : PratosRestaurantes[i]) {
						System.out.println("- " + prato);
					}
					System.out.println("Valor total: " + Restaurantes[i][3]);
					restauranteEncontrado = true;
					System.out.println("     ===Realize o pagamento para continuar prosseguir seu atendimento===");
					System.out.println("-----------------------------------------------------");

					break;
				}
			}

			if (!restauranteEncontrado) {
				tentativa++;
				if (tentativa < tentativaMax) {
					System.out.println("Restaurante não encontrado.");
					System.out.println("Tentativa " + tentativa + " de " + tentativaMax);
				} else {
					System.out.println("===Número máximo de tentativas excedido. Saindo do menu de escolha===");
				}
			}

		}
	}

	public static void FazerPagamento(String[][] Restaurantes, Scanner ler) {
		int escolhaUsuario;
		System.out.print("    ===Escolha a forma de pagamento===\n" + "[1]--> Débito\n" + "[2]--> Crédito\n"
				+ "[3]--> Dinheiro\n" + "-->");
		escolhaUsuario = ler.nextInt();

		if (escolhaUsuario == 1) {
			for (int i = 0; i < Restaurantes.length; i++) {
				System.out.println("Valor total: " + Restaurantes[i][3]);
			}
		}

		else if (escolhaUsuario == 2) {
			System.out.println("TESTE");
		}

		else if (escolhaUsuario == 3) {

		}
	}

	public static void MostrarPedido() {
		System.out.println("");
	}
}
