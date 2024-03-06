package GerenciadorDeTarefa;
import java.util.Scanner;
public class AppGerenciadorDeTarefas {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // Versao sem uso de construtores:
        // System.out.println("Digite a descrição da Primeira Tarefa:");
        // tarefa1.descricao = dado.nextLine();
        // System.out.println("A tarefa jã foi concluída (Responda com sim ou nao)?");
        // String input = dado.nextLine();
        // input = input.toLowerCase();

        // if (input.equals("sim")) {
           // tarefa1.concluida = true;
       // } else if (input.equals("nao")) {
           // tarefa1.concluida = false;
        // } else {
            // System.out.println("Situação da tarefa inválida, assumindo 'nao'.");
            // tarefa1.concluida = false;
        //}
        // System.out.println("Digite a prioridade da tarefa (1 Sendo a prioridade mais urgente e 3 a menos urgente)");
        // tarefa1.prioridade = dado.nextInt();

        // Usando construtores
        Tarefa tarefa1 = new Tarefa("Levar o lixo", true, 3);
        Tarefa tarefa2 = new Tarefa("Continuar Projeto X", false, 1);
        Tarefa tarefa3 = new Tarefa("Lembrar Robertinho daquele negocio", false, 2);

        System.out.println("Suas Tarefas:");
        tarefa1.exibirTarefa();
        System.out.println();
        
        tarefa2.exibirTarefa();
        System.out.println();

        tarefa3.exibirTarefa();
        System.out.println();

        System.out.println("Qual função deseja fazer agora?");
        System.out.println("1) Concluir Tarefa");
        System.out.println("2) Resetar Tarefa");
        System.out.println("3) Mudar Prioridade");
        System.out.println("4) Sair do programa");

        int opcao = dado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Qual das 3 tarefas deseja concluir?");
                int opcao2 = dado.nextInt();

                switch (opcao2) {
                    case 1:
                    tarefa1.concluirTarefa();
                    tarefa1.exibirTarefa();
                    System.out.println();
                    break;
                    case 2:
                    tarefa2.concluirTarefa();
                    tarefa2.exibirTarefa();
                    System.out.println();
                        break;
                    case 3:
                    tarefa3.concluirTarefa();
                    tarefa3.exibirTarefa();
                    System.out.println();
                        break;
                
                    default:
                        break;
                }

                break;
            case 2:
                tarefa1.resetarTarefa();
                tarefa1.exibirTarefa();
                System.out.println();
                break;
            case 3:
                System.out.println("Pra qual nível de prioridade deseja mudar?");
                int novaPrioridade = dado.nextInt();
                tarefa1.mudarPrioridade(novaPrioridade);
                tarefa1.exibirTarefa();
                System.out.println();
                break;
            case 4:
                System.out.println("Encerrando o programa...");
                dado.close();
                return;
            default:
                break;
        }

    }
}
