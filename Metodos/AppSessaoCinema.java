import java.util.Scanner;
public class AppSessaoCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Objeto sessao1 da Classe SessaoCinema igual a uma nova instância SessaoCinema()
        SessaoCinema sessao1 = new SessaoCinema();

        // Preenchimento dos atributos de acordo com o que o usuário digitar
        System.out.println("Qual o nome do Filme:");
        sessao1.filme = scanner.nextLine(); // nextLine() é usado para String

        System.out.println("Qual o horário da Sessão?");
        sessao1.horario = scanner.nextLine(); 

        System.out.println("Qual a capacidade total da Sala?");
        sessao1.capacidadeTotal = scanner.nextInt();

        System.out.println("Quantos Ingressos foram vendidos?");
        sessao1.ingressosVendidos = scanner.nextInt();

        if (sessao1.ingressosVendidos > sessao1.capacidadeTotal) {
            System.out.println("Erro! Número de ingressos vendidos maior que a capacidade total da sala");
        } else {
            System.out.println("Informações da Sessão:");
        sessao1.exibirInfoSessao();
        System.out.println(); // pulando uma linha

        System.out.println("Quantos ingressos deseja vender?");
        int ingressoVendidosDepois = scanner.nextInt(); // outro nome de variavel para nao chocar com o atributo

        sessao1.venderIngresso(ingressoVendidosDepois);
        sessao1.exibirInfoSessao();
        System.out.println();

        System.out.println("Quantos ingressos serão Cancelados?");
        int ingressosCancelados = scanner.nextInt();
        sessao1.cancelarIngresso(ingressosCancelados);
        sessao1.exibirInfoSessao();
        System.out.println();

        System.out.println("Digite o novo Horário da Sessão:");
        String novoHorario = scanner.nextLine();
        sessao1.alterarHorario(novoHorario);
        sessao1.exibirInfoSessao();
        System.out.println();

        }

    }
}
