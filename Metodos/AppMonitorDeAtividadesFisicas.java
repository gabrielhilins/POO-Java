import java.util.Scanner;
public class AppMonitorDeAtividadesFisicas {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        AtividadeFisica atividade1 = new AtividadeFisica();

        System.out.println("Qual foi o tipo de exercício?");
        atividade1.tipoDeExercicio = dado.nextLine();
        System.out.println("Qual foi a Duração (Em minutos) do exercício?");
        atividade1.duracao = dado.nextInt();
        
        atividade1.exibirAtividade();
        String mensagemCalorias = atividade1.caloriaPorExercicio(atividade1.tipoDeExercicio);
        System.out.println(mensagemCalorias);

        System.out.println("O que deseja fazer agora?");
        System.out.println("1) Registrar Atividade (Em breve)");
        System.out.println("2) Alterar Tipo de Atividade");
        System.out.println("3) Comparar Calorias (Em breve)");
        System.out.println("4) Sair do programa");

        int opcao = dado.nextInt();

        switch (opcao) {
            case 1:
                // adicionar chamada do metodo registrarAtividade()
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
