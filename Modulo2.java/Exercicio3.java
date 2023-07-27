import java.util.Scanner;

public class Exercicio3 {
    // Escreva um programa que peça ao usuário para inserir um número inteiro entre
    // 1 e 7 (representando os dias da semana) e, em seguida, exiba o nome do dia da
    // semana correspondente. Use um switch-case para realizar essa tarefa.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número de 1 à 7:");
        int semana = ler.nextInt();

        switch (semana) {
            case 1:
                System.out.print("Segunda -Feira ");
                break;
            case 2:
                System.out.print("Terça - Feira");
                break;
            case 3:
                System.out.println("Quarta - Feira");
                break;
            case 4:
                System.out.print("Quinta - Feira");
                break;
            case 5:
                System.out.println("Sexta - Feira");
                break;
            case 6:
                System.out.print("Sabádo");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.print("Tente novamente!!, Inserir um número de 1 à 7 ");
                break;
        }

        ler.close();
    }
}