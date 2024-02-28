import java.util.Scanner;
public class AppSessaoCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Versao sem uso de construtores
        // Preenchimento dos atributos de acordo com o que o usuário digitar
        // System.out.println("Qual o nome do Filme:");
        // sessao1.filme = scanner.nextLine(); // nextLine() é usado para String

        // System.out.println("Qual o horário da Sessão?");
        // sessao1.horario = scanner.nextLine(); 

        // System.out.println("Qual a capacidade total da Sala?");
        // sessao1.capacidadeTotal = scanner.nextInt();

        // System.out.println("Quantos Ingressos foram vendidos?");
        // sessao1.ingressosVendidos = scanner.nextInt();

        // Versao com uso de construtores
        // Objeto sessao1 da Classe SessaoCinema igual a uma nova instância SessaoCinema()
        SessaoCinema sessao1 = new SessaoCinema("Homem Aranha 2", "16:30", 200, 200);
        SessaoCinema sessao2 = new SessaoCinema("À Procura da Felicidade", "19:00", 120, 75);
        SessaoCinema sessao3 = new SessaoCinema("Curtindo a Vida Adoidado", "14:20", 150, 40);


        if (sessao1.ingressosVendidos > sessao1.capacidadeTotal || sessao2.ingressosVendidos > sessao2.capacidadeTotal || sessao3.ingressosVendidos > sessao3.capacidadeTotal) {
            System.out.println("Erro! Número de ingressos vendidos maior que a capacidade total da sala");
        } else {
            System.out.println("Informações das Sessões Disponíveis:");
        sessao1.exibirInfoSessao();
        System.out.println(); // pulando uma linha

        sessao2.exibirInfoSessao();
        System.out.println();

        sessao3.exibirInfoSessao();
        System.out.println();

        System.out.println("Quantos ingressos deseja vender para a Sessão do filme " + sessao1.filme + "?");
        int ingressoVendidosDepois1 = scanner.nextInt(); // outro nome de variavel para nao chocar com o atributo
        System.out.println("Quantos ingressos deseja vender para a Sessão do filme " + sessao2.filme + "?");
        int ingressoVendidosDepois2 = scanner.nextInt(); // outro nome de variavel para nao chocar com o atributo
        System.out.println("Quantos ingressos deseja vender para a Sessão do filme " + sessao3.filme + "?");
        int ingressoVendidosDepois3 = scanner.nextInt(); // outro nome de variavel para nao chocar com o atributo

        sessao1.venderIngresso(ingressoVendidosDepois1);
        sessao1.exibirInfoSessao();
        System.out.println();

        sessao2.venderIngresso(ingressoVendidosDepois2);
        sessao2.exibirInfoSessao();
        System.out.println();

        sessao1.venderIngresso(ingressoVendidosDepois3);
        sessao3.exibirInfoSessao();
        System.out.println();

        System.out.println("Quantos ingressos serão Cancelados pra Sessao do filme " + sessao1.filme + "?");
        int ingressosCancelados1 = scanner.nextInt();

        System.out.println("Quantos ingressos serão Cancelados pra Sessao do filme " + sessao2.filme + "?");
        int ingressosCancelados2 = scanner.nextInt();

        System.out.println("Quantos ingressos serão Cancelados pra Sessao do filme " + sessao3.filme + "?");
        int ingressosCancelados3 = scanner.nextInt();

        sessao1.cancelarIngresso(ingressosCancelados1);

        sessao2.cancelarIngresso(ingressosCancelados2);

        sessao3.cancelarIngresso(ingressosCancelados3);

        sessao1.exibirInfoSessao();
        System.out.println();

        sessao2.exibirInfoSessao();
        System.out.println();

        sessao3.exibirInfoSessao();
        System.out.println();

        System.out.println("Digite o novo Horário da Sessão do Filme " + sessao1.filme + ":");
        String novoHorario = scanner.nextLine();
        System.out.println("Digite o novo Horário da Sessão do Filme " + sessao2.filme + ":");
        String novoHorario2 = scanner.nextLine();
        System.out.println("Digite o novo Horário da Sessão do Filme " + sessao3.filme + ":");
        String novoHorario3 = scanner.nextLine();

        sessao1.alterarHorario(novoHorario);

        sessao1.alterarHorario(novoHorario2);
        
        sessao1.alterarHorario(novoHorario3);


        sessao1.exibirInfoSessao();
        System.out.println();

        sessao2.exibirInfoSessao();
        System.out.println();

        sessao3.exibirInfoSessao();
        System.out.println();

        }

    }
}
