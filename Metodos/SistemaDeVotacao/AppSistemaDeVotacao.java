package SistemaDeVotacao;
import java.util.Scanner;

public class AppSistemaDeVotacao {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        Candidato candidato1 = new Candidato("Lacerda Junior", "Partido A", "Prefeito");
        Candidato candidato2 = new Candidato("Joao Almeida", "Partido B", "Vereador");

        Votacao votacaoCandidato1 = new Votacao(candidato1, 35);
        Votacao votacaoCandidato2 = new Votacao(candidato2, 79);

        System.out.println("Resultado da votação dos Candidatos:");
        votacaoCandidato1.exibirResultado();
        System.out.println();
        votacaoCandidato2.exibirResultado();
        System.out.println();

        System.out.println("Escolha uma opção:");
        System.out.println("1) Adicionar Voto");
        System.out.println("2) Zerar Votos");
        System.out.println("3) Comparar Votação");
        System.out.println("4) Sair do programa");

        int opcao = dado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Para qual dos candidatos serão adicionados votos?");
                System.out.println("1) Lacerda Junior");
                System.out.println("2) Joao Almeida");
                int opcao2 = dado.nextInt();

                switch (opcao2) {
                    case 1:
                        System.out.println("Quantos votos serão adicionados ao Candidato Lacerda Junior?");
                        int adicional = dado.nextInt();
                        votacaoCandidato1.adicionarVotos(adicional);
                        votacaoCandidato1.exibirResultado();
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Quantos votos serão adicionados ao Candidato Joao Almeida?");
                        int adicional2 = dado.nextInt();
                        votacaoCandidato2.adicionarVotos(adicional2);
                        votacaoCandidato2.exibirResultado();
                        System.out.println();
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("Zerando Votos...");
                votacaoCandidato1.zerarVotos();
                votacaoCandidato1.exibirResultado();
                System.out.println();

                votacaoCandidato2.zerarVotos();
                votacaoCandidato2.exibirResultado();
                System.out.println();
                break;
            case 3:
                int diferencaVotos = votacaoCandidato1.compararVotos(votacaoCandidato2);
                if (diferencaVotos > 0) {
                    System.out.println("O Candidato " + votacaoCandidato1.getCandidato().getNome() +
                            " está na frente com " + diferencaVotos + " votos a mais.");
                } else if (diferencaVotos < 0) {
                    System.out.println("O Candidato " + votacaoCandidato2.getCandidato().getNome() +
                            " está na frente com " + (-diferencaVotos) + " votos a mais.");
                } else {
                    System.out.println("Os candidatos estão empatados com o mesmo número de votos.");
                }
                break;
            case 4:
                System.out.println("Saindo do programa...");
                break;
            default:
                break;
        }

        dado.close();
    }
}
