
public class Exercicio2 {
    // Crie um método estático que receba um array de números inteiros como
    // parâmetro e retorne a média aritmética dos valores no array.
    public static void main(String[] args) {
        int[] Media = { 10, 20, 30, 40, 50 };
        MediaAritmetica(Media);
    }

    public static double MediaAritmetica(int Media[]) {
        System.out.println("---Valores do Array:---");
        double media = 0;

        for (int i = 0; i < Media.length; i++) {
            System.out.print("|" + Media[i] + "|");
            media += Media[i];

        }
        System.out.println("\n--------------------");

        System.out.println("Média dos Valores do Array:");
        media = media / Media.length;
        System.out.println(media);

        return media;

    }
}