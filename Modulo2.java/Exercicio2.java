import java.util.Scanner;

public class Exercicio2 {

    // Escreva um programa que peça ao usuário para inserir um número inteiro e, em
    // seguida, verifique se esse número é par ou ímpar. Exiba uma mensagem
    // apropriada na tela com o resultado.w]

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um número:");
        int num = ler.nextInt();

        if (num % 2 == 0) {
            System.out.print("Número é Par");

        } else {
            System.out.print("Número é Ìmpar!!");
        }

        ler.close();

    }

}
