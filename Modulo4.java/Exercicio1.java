import java.util.Scanner;

public class Exercicio1 {

    // Crie um método estático que receba dois números inteiros como parâmetro e
    // retorne a soma dos números.

    public static void main(String[] args) {
        Soma(0, 0);

    }

    public static int Soma(int valor1, int valor2) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o valor 1:");
        valor1 = ler.nextInt();
        System.out.print("Informe o valor 2:");
        valor2 = ler.nextInt();

        int soma = valor1 + valor2;
        System.out.println("Soma dos valores:" + soma);
        ler.close();
        return soma;

    }
}
