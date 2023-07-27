import java.util.Scanner;

public class Exercicio2 {
    // Escreva um programa Java que peça ao usuário quantos números quer ter em uma
    // lista de compras. Em seguida, peça à ele os itens da lista e ao final imprima
    // todos os itens.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantos números deseja ter em sua lista de Compras?");
        int lista = ler.nextInt();

        String[] listaDeCompras = new String[lista];
        for (int i = 0; i < listaDeCompras.length; i++) {
            System.out.print("Adicione o produto n" + i + ":");
            String produto = ler.next(); // só lê o valor digitado pelo usuário
            listaDeCompras[i] = produto;// preciso armazenar esse valor dentro de cada indíce no Array
        }
        System.out.println("_______________________________________________________");

        System.out.println("Sua lista de Compras:");
        for (int i = 0; i < listaDeCompras.length; i++) {
            System.out.println("Lista de Compras:" + listaDeCompras[i]);
        }
        ler.close();
    }

}
