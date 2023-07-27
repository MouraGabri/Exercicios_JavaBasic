
public class Exercicio1 {
    // Escreva um programa Java que declare um vetor de Strings e preencha-o com
    // nomes de países. Em seguida, use um loop for para imprimir os valores do
    // vetor de paises.
    public static void main(String[] args) {

        String[] nomeDePaises = { "França", "Brasil", "Inglaterra", "Espanha", "Japão" };
        System.out.println("Países contidos no Array:");
        for (int i = 0; i < nomeDePaises.length; i++) {
            System.out.println("*" + nomeDePaises[i]);
        }
    }
}