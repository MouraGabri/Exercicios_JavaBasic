import java.text.DecimalFormat;

public class Exercicio5 {

    // Escreva um programa Java que declare uma matriz 3x3 de doubles e preencha-a
    // com os valores 1.0, 2.5 e 3.7 (para todas as linhas). Em seguida, use dois
    // loops 'for' aninhados para imprimir cada elemento da matriz e a soma dos
    // valores da coluna.
    public static void main(String[] args) {

        double[][] matriz = {
                { 1.0, 2.5, 3.7 },
                { 1.0, 2.5, 3.7 },
                { 1.0, 2.5, 3.7 }
        };

        // Imprime a matriz em formato de tabela e calcula a soma de cada coluna
        System.out.println("    ---Matriz---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(("|") + matriz[i][j] + ("|") + "  ");
            }
            System.out.println(); // Cria uma nova linha após imprimir cada linha da matriz
        }

        // entender explicação dessa matriz/entender o decimal for(Anotar no caderno),Se
        // precisar anotar sobre a matriz, perfeito

        // Calcula e imprime a soma de cada coluna
        System.out.println("Soma das colunas:");
        for (int j = 0; j < matriz[0].length; j++) {
            double somaColuna = 0.0;
            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j]; // Calcula a soma da coluna j
            }
            DecimalFormat formato = new DecimalFormat("0.00");
            System.out.println("Coluna " + j + ": " + formato.format(somaColuna));
        }
    }
}