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

        System.out.println("    ---Matriz---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(("|") + matriz[i][j] + ("|") + "  ");// Imprime a matriz em forma de tabela
            }
            System.out.println(); // Responsavel por criar uma nova linha no console, após cada linha da matriz
                                  // ser impressa
        }

        System.out.println("Soma das colunas:");
        for (int j = 0; j < matriz.length; j++) {
            ;// vai percorrer todas as colunas da matriz
            double somaColuna = 0.0;
            for (int i = 0; i < matriz.length; i++) {
                ;// percorre as linhas,passando os valores para a variavel soma
                somaColuna += matriz[i][j]; // Calcula a soma da coluna passando o valor da linha[i] e coluna atual[j]
            }
            DecimalFormat formato = new DecimalFormat("0.00");
            System.out.println("Coluna " + j + ": " + formato.format(somaColuna));
        }

    }

}
