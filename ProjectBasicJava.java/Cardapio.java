import java.util.Random;
import java.util.Scanner;

public class Cardapio {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;
        String[][] CadastroUsuario = new String[3][4]; // Matriz para cadastrar os usuários
        do {
            System.out.println("\n-----Bem vindo-----\n" + "Escolha uma das opções que deseja");
            System.out.println("Opção 1 --> Realize seu cadastro\n" +
                    "Opção 2 --> Listar Restaurantes\n" +
                    "Opção 3 --> Efetuar pagamento\n" +
                    "Opção 4 --> Mostrar pedido\n" +
                    "Opção 5 --> Digite 0 para sair do programa\n" + "-->");
            escolha = ler.nextInt();
            ler.nextLine();
            switch (escolha) {

                case 1:
                    System.out.println(RealizarCadastro(CadastroUsuario));
                    break;
                case 2:
                    System.out.print("Listar restaurantes");
                    break;
                case 3:
                    System.out.println("Efetuar pagamento");
                    break;
                case 4:
                    System.out.println("Mostrar pedido");
                    break;

                default:
                    break;
            }

        } while (escolha != 0);
        System.out.println("Programa Encerrado");
        ler.close();

    }

    public static String RealizarCadastro(String[][] CadastroUsuario) {
        System.out.println("-----------------------------------------------------");
        System.out.println("===Realize seu cadastro===");
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            Random random = new Random();
            int senhaAleatoria = random.nextInt(10000);
            System.out.print("Nome:");
            CadastroUsuario[i][0] = ler.nextLine();

            System.out.print("Idade:");
            CadastroUsuario[i][1] = ler.nextLine();

            System.out.print("CPF:");
            CadastroUsuario[i][2] = ler.nextLine();

            System.out.println("Sua senha é:" + senhaAleatoria);
            CadastroUsuario[i][3] = String.valueOf(senhaAleatoria);
            LoginUsuario(CadastroUsuario);

        }
        return "";
    }

    public static void LoginUsuario(String[][] CadastroUsuario) {
        System.out.println("-----------------------------------------------------");
        Scanner ler = new Scanner(System.in);

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
            ler.close();
        }
    }
}
