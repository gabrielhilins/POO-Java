import java.util.Scanner;
public class AppSistemaDeVotacao {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // System.out.println("Qual o nome do candidato?");
        // candidato1.candidato = dado.nextLine();
        // System.out.println("Quantos votos foram concebidos?");
        // candidato1.votosRecebidos = dado.nextInt();
        // System.out.println();

        Votacao candidato1 = new Votacao("Lacerda Junior", 35);
        Votacao candidato2 = new Votacao("Joao Almeida", 79);


        System.out.println("Resultado da votação do Candidatos:");
        candidato1.exibirResultado();
        System.out.println();

        candidato2.exibirResultado();
        System.out.println();

        System.out.println("Que Função deseja fazer?");
        System.out.println("1) Adicionar Voto");
        System.out.println("2) Zerar Votos");
        System.out.println("3) Comparar Votação (Em breve)");
        System.out.println("4) Sair do programa");

        int opcao = dado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Para qual dos candidatos serão adicionados votos?");
                System.out.println("11) Lacerda Junior");
                System.out.println("12) Joao Almeida");
                int opcao2 = dado.nextInt();

                switch (opcao2) {
                    case 11:
                    System.out.println("Quantos votos serão adicionados ao Candidato Lacerda Junior?");
                    int adicional = dado.nextInt();
                    candidato1.adicionarVotos(adicional);
                    candidato1.exibirResultado();
                    System.out.println();
                    break;
                    case 12:
                    System.out.println("Quantos votos serão adicionados ao Candidato Joao Almeida?");
                    int adicional2 = dado.nextInt();
                    candidato2.adicionarVotos(adicional2);
                    candidato2.exibirResultado();
                    System.out.println();
                        break;
                
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("Zerando Votos...");
                candidato1.zerarVotos();
                candidato1.exibirResultado();
                System.out.println();

                candidato2.zerarVotos();
                candidato2.exibirResultado();
                System.out.println();
                break;
            case 3:
                // Adicionar funcionalidade de comparar votações posteriormente
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
