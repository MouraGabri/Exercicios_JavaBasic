import java.util.Scanner;

public class Exercicio6 {
    // 17. Elabore um algoritmo que leia a hora e dê as seguintes mensagens nos
    // seguintes horários:
    // 0 as 6 – Boa Madrugada
    // 7 as 11 – Bom Dia
    // 12 as 18 – Boa Tarde
    // 19 as 23 – Boa noite
    // OBS: somente números inteiros.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o Horario:");
        int hora = ler.nextInt();

        if (hora >= 0 && hora <= 6) {
            System.out.print("Boa Madrugada");
        } else if (hora >= 7 && hora <= 11) {
            System.out.print("Bom dia");
        } else if (hora >= 12 && hora <= 18) {
            System.out.print("Boa tarde");
        } else if (hora >= 19 && hora <= 23) {
            System.out.print("Boa noite");
        } else {
            System.out.println("Informe um horario valido");
        }

        ler.close();
    }
}
