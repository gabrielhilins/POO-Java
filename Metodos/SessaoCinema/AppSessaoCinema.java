package SessaoCinema;
import java.util.Scanner;

public class AppSessaoCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Filme filme1 = new Filme("Homem Aranha 2", "Sam Raimi", "2002", "127 min");
        Filme filme2 = new Filme("À Procura da Felicidade", "Gabriele Muccino", "2006", "117 min");
        Filme filme3 = new Filme("Oppenheimer", "Cristopher Nolan", "2023", "180 min");

        SessaoCinema sessao1 = new SessaoCinema(filme1, "20:00", 165, 165);
        SessaoCinema sessao2 = new SessaoCinema(filme2, "17:20", 200, 199);
        SessaoCinema sessao3 = new SessaoCinema(filme3, "21:45", 232, 191);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Exibir Sessões do Dia");
        System.out.println("2. Vender ingresso");
        System.out.println("3. Cancelar ingresso");
        System.out.println("4. Alterar horário da sessão");
        System.out.println("5. Sair");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        switch (opcao) {
            case 1:
                sessao1.exibirInfoSessao();
                System.out.println();
                sessao2.exibirInfoSessao();
                System.out.println();
                sessao3.exibirInfoSessao();
                break;
            case 2:
                System.out.println("Quantos ingressos deseja vender para a Sessão do filme " + sessao1.getFilme() + "?");
                int ingressoVendidosDepois1 = scanner.nextInt();
                sessao1.venderIngresso(ingressoVendidosDepois1);
                sessao1.exibirInfoSessao();
                break;
            case 3:
                System.out.println("Quantos ingressos serão Cancelados pra Sessao do filme " + sessao1.getFilme() + "?");
                int ingressosCancelados1 = scanner.nextInt();
                sessao1.cancelarIngresso(ingressosCancelados1);
                sessao1.exibirInfoSessao();
                break;
            case 4:
                System.out.println("Digite o novo Horário da Sessão do Filme " + sessao1.getFilme() + ":");
                String novoHorario = scanner.nextLine();
                sessao1.alterarHorario(novoHorario);
                sessao1.exibirInfoSessao();
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}
