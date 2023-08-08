import java.util.Scanner;

public class Exercicio4 {
    // Crie um método estático que receba uma string como parâmetro e retorne
    // verdadeiro se a string contiver apenas caracteres alfabéticos, caso
    // contrário, retorne falso.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe uma frase para verificar se possui apenas caracteres alfabéticos");
        String caracter = ler.nextLine();
        System.out.println(IsCaracter(caracter));
        ler.close();

    }

    public static boolean IsCaracter(String mensagem) {
        if (mensagem.matches("[a-zA-z]+")) {
            System.out.println("Frase possui caracteres alfabéticos");
            return true;

        } else {
            System.out.println("Frase não possui caracteres alfabéticos");
            return false;
        }

    }
}
