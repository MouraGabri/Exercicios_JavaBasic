import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a  Largura do Retângulo:");
        double largura = ler.nextDouble();

        System.out.print("Informe a  Altura do Retângulo:");
        double altura = ler.nextDouble();

        double area = largura * altura;
        System.out.print("A área do Retângulo é: " + area);
        ler.close();

    }
}
