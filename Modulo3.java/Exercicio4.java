import java.util.Scanner;

public class Exercicio4 {

    // Escreva um programa Java que declare e inicialize um array de inteiros com os
    // valores 10, 20, 80, 40 e 50. Em seguida, use um loop 'for' para en0contrar o
    // maior valor no array e imprimir o resultado.
    public static void main(String[] args) {
        System.out.println("-----Valores armazenados no Array:-----");
        int[] numeros = { 10, 20, 80, 40, 50, };
        int maiorNumero = numeros[0]; //inicializamos na posição[0] para que a comparação tenha um valor válido para  comparar se é maior ou não.

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i]; // atribuo se o valor na posição do array for maior que a posição que
                // inicializei na variável maiorNumero. Se não for maior, não atualiza o valor,
                // apenas mantém o mesmo
            }
        }
        System.out.print("O número maior é:" + maiorNumero);
    }
}
