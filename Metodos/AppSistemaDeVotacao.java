import java.util.Scanner;
public class AppSistemaDeVotacao {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        Votacao candidato1 = new Votacao();

        System.out.println("Qual o nome do candidato?");
        candidato1.candidato = dado.nextLine();
        System.out.println("Quantos votos foram concebidos?");
        candidato1.votosRecebidos = dado.nextInt();

        candidato1.exibirResultado();
        System.out.println();

        System.out.println("Que Função deseja fazer?");
        System.out.println("1) Adicionar Voto");
        System.out.println("2) Zerar Votos");
        System.out.println("3) Comparar Votação (Em breve)");
        System.out.println("4) Sair do programa");

        int opcao = dado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Quantos votos serã adicionados?");
                int adicional = dado.nextInt();
                candidato1.adicionarVotos(adicional);
                candidato1.exibirResultado();
                System.out.println();
                break;
            case 2:
                System.out.println("Zerando Votos...");
                candidato1.zerarVotos();
                candidato1.exibirResultado();
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
