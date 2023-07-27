import java.util.Scanner;

public class Exercicio4 {

    // Desenvolver um algoritmo peça o nome, idade, cidade e estado do usuário e
    // exiba as informações conforme o exemplo abaixo:
    // Olá seu nome é João, você têm 16 anos, é da cidade de Blumenau, situada no
    // estado de Santa Catarina.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.print("Digite sua idade:");
        int idade = ler.nextInt();
        ler.nextLine(); // Consumir a quebra de linha após a idade (para prosseguir com a leitura da
                        // próxima linha)

        System.out.print("Informe a sua cidade:");
        String cidade = ler.nextLine();

        System.out.print("Informe o estado:");
        String estado = ler.next();

        System.out.print(
                "Olá seu nome é " + nome + "," + "você tem " + idade + " anos " + "," + " é da cidade de " + cidade
                        + "," + "situada no estado do " + estado);

        ler.close();

    }
}
