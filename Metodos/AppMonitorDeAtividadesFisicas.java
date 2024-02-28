import java.util.Scanner;
public class AppMonitorDeAtividadesFisicas {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // System.out.println("Qual foi o tipo de exercício?");
        // atividade1.tipoDeExercicio = dado.nextLine();
        // System.out.println("Qual foi a Duração (Em minutos) do exercício?");
        // atividade1.duracao = dado.nextInt();
        // System.out.println();
        
        AtividadeFisica atividade1 = new AtividadeFisica("Academia", 60);
        AtividadeFisica atividade2 = new AtividadeFisica("Crossfit", 38);
        AtividadeFisica atividade3 = new AtividadeFisica("Corrida", 25);

        System.out.println("Detalhes da Atividades:");
        atividade1.exibirAtividade();
        System.out.println();

        atividade2.exibirAtividade();
        System.out.println();

        atividade3.exibirAtividade();
        System.out.println();


        System.out.println("O que deseja fazer agora?");
        System.out.println("1) Registrar Atividade");
        System.out.println("2) Alterar Tipo de Atividade");
        System.out.println("3) Comparar Caloria (Em breve)");
        System.out.println("4) Sair do programa");

        int opcao = dado.nextInt();

        switch (opcao) {
            case 1:
                dado.nextLine();
                System.out.println("Qual o tipo de Exercício?");
                String tipoDeExercicio1 = dado.nextLine();

                System.out.println("Qual a duração do Exercício?");
                int duracao1 = dado.nextInt();

                atividade1.registrarAtividade(tipoDeExercicio1, duracao1);
                break;
            case 2:
                dado.nextLine();
                System.out.println("Qual será o novo Tipo de Exercício?");
                String novoTipo = dado.nextLine();
                atividade1.alterarTipoDeAtividade(novoTipo);
                atividade1.exibirAtividade();
                System.out.println();
                break;
            case 3:
                // adicionar chamada do metodo compararCalorias()
                break;
            case 4:
                System.out.println("Saindo do programa...");
                dado.close();
                return;
        
            default:
                break;
        }
    }
}
