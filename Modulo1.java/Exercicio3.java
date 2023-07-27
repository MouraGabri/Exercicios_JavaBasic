import java.util.Scanner;

public class Exercicio3 {
    double calculoFahrenheit;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a temperatura em Graus Celsius\u00B0C\":");
        double celsius = ler.nextDouble();

        double calculoFahrenheit = celsius * (1.8) + 32;
        System.out.println("Temperatura convertida para Fahrenheit: " + calculoFahrenheit + "\u00B0F");

        double calculoKevin = celsius + 273.15;
        System.out.println("Temperatura convertida para Kelvin: " + calculoKevin + "\u00B0K");
        ler.close();
    }

}
