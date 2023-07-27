import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um valor para X:");
        int x = ler.nextInt();

        System.out.print("Informe um valor para Y:");
        int y = ler.nextInt();

        int calc = x + y;
        System.out.print("A soma de X e Y é: " + calc);

        ler.close();
    }

}
