import java.util.Scanner;

public class Exercicio3 {
    // Escreva um programa Java que declare um vetor de Strings e preencha-o com
    // nomes de alimentos. Em seguida, use um loop 'while' para perguntar ao usuário
    // quais alimentos ele deseja encontrar e, se encontrados, imprimir a posição e
    // o nome do alimento no vetor.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("-------Liste suas compras-------\n" + ("Informe a quantidade de Produtos: "));
        int quantidade = ler.nextInt();
        ler.nextLine();

        String[] alimentos = new String[quantidade];
        for (int i = 0; i < alimentos.length; i++) {
            System.out.print("Adicione o Produto N " + i + ": ");
            String produto = ler.nextLine();
            alimentos[i] = produto;
        }
        System.out.println("-----------------------------");

        boolean encontrado = false;// while vai continuar até que o alimento seja encontrado, no caso true
        while (!encontrado) {
            System.out.print("Quais alimentos deseja encontrar? ");
            String buscarAlimento = ler.nextLine();

            for (int i = 0; i < alimentos.length; i++) {
                if (alimentos[i].equalsIgnoreCase(buscarAlimento)) {
                    System.out.println("Alimento encontrado: " + buscarAlimento + " na posição " + i);
                    encontrado = true;// quando encontrado passa a ser true, parando o loop
                }
            }
            if (!encontrado)
                System.out.println("------Alimento não encontrado------");

        }
        ler.close();

    }

}