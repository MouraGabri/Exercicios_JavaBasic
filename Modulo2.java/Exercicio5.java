import java.util.Scanner;

public class Exercicio5 {

    // Desenvolver um programa que calcule o menor de três números digitados.
    // Em outras palavras o usuário informa três números e o programa deverá
    // informar qual deles é o menor.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um valor para Número 1:");
        int numero1 = ler.nextInt();

        System.out.print("Informe um valor para Número 2:");
        int numero2 = ler.nextInt();

        System.out.print("Informe um valor para Número 3:");
        int numero3 = ler.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.print("Número 1 é o menor");
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.print("Número 2 é o menor");
        } else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println("Número 3 é o menor");
        } else if (numero1 == numero2 && numero3 == numero1 && numero2 == numero3) {
            System.out.println("TODOS NÚMEROS SÃO IGUAIS!! Informe números diferentes");

        }

        ler.close();
    }
}
