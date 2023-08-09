import java.util.Scanner;

public class Program {
    // projeto sobre um bloco de notas em formato java, estou pensando em fazer uma
    // matriz em forma de semana, adicionando
    // funções e tarefas diáarias(fazer um crud para adicionar e excluir tarefas)
    // Ser bem criativo na hora de mostrar as tarefas.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;
        String ListaTarefas[] = { "Segunda - Feira", "Terça - Feira", "Quarta - Feira", "Quinta - Feira",
                "Sexta - Feira" };// Matriz criada para o Adicionar Tarefas
        do {
            System.out
                    .println(
                            "\n-----Seja bem vindo ao JAVA NOTES-----\n" + ("---Escolha uma das opções que deseja---"));
            System.out.println();
            System.out.print("Opção 1 --> Adicione tarefas na sua lista\n"
                    + ("Opção 2 --> Remova tarefas da sua\n"
                            + ("Opção 3 --> Ver lista completa\n" + ("Opção 0 --> Sair do programa\n" + "-->"))));
            escolha = ler.nextInt();
            ler.nextLine();
            switch (escolha) {

                case 1:
                    AdicionarTarefasLista(ListaTarefas);
                    break;
                case 2:
                    System.out.print("Remova tarefas da sua lista");
                    break;
                case 3:
                    System.out.println("Ver lista completa");
                    break;
                default:
                    break;
            }

        } while (escolha != 0);
        System.out.println("Programa Encerrado");
        ler.close();

    }

    public static void AdicionarTarefasLista(String[] AdicionarTarefasLista) {
        Scanner ler = new Scanner(System.in);
        System.out.println("---Adicione Tarefas na sua lista---");

        for (int i = 0; i < AdicionarTarefasLista.length; i++) {
            System.out.print("Adicione Sua tarefa na:" + AdicionarTarefasLista[i] + "\n" + ("-->"));
            String tarefa = ler.nextLine();
            AdicionarTarefasLista[i] = tarefa;

        }

    }

}
