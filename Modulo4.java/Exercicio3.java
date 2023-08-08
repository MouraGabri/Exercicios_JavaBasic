import java.util.Scanner;

public class Exercicio3 {
    // Crie um método estático que receba um número inteiro como parâmetro e retorne
    // verdadeiro se o número for um número primo, caso contrário, retorne falso.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é primo:");
        int numPrimo = ler.nextInt();

        System.out.println(isPrimo(numPrimo));
    }

    public static boolean isPrimo(int numPrimo) {
        if (numPrimo <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numPrimo); i++) {
            if (numPrimo % i == 0) {
                return false;
            }
        }
        return true;

    }

}