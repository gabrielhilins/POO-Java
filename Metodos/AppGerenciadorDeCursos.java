import java.util.Scanner;
public class AppGerenciadorDeCursos {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        Curso curso1 = new Curso();

        System.out.println("Qual o nome do curso?");
        curso1.nome = dado.nextLine();
        System.out.println("Qual a categoria (Área de Estudo) do curso?");
        curso1.categoria = dado.nextLine();
        System.out.println("Qual a carga horária do curso?");
        curso1.cargaHoraria = dado.nextInt();
        System.out.println("Qual o número de alunos inscritos no curso?");
        curso1.numeroDeAlunosInscritos = dado.nextInt();

        curso1.exibirInformacoes();
        System.out.println();

        System.out.println("Qual função deseja executar?");
        System.out.println("1) Aumentar Número de alunos inscritos");
        System.out.println("2) Cancelar Inscrição");
        System.out.println("3) Atualizar Carga Horária");
        System.out.println("4) Sair do programa");

        int opcao = dado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Quantos alunos deseja adicionar?");
                int adicional = dado.nextInt();
                curso1.aumentaAlunos(adicional);
                curso1.exibirInformacoes();
                System.out.println();
                break;
            case 2:
                System.out.println("Quantos alunos desejam cancelar sua inscrição?");
                int remocao = dado.nextInt();
                curso1.cancelarInscricao(remocao);
                curso1.exibirInformacoes();
                System.out.println();
                break;
            case 3:
                System.out.println("Digite a nova Carga Horária do Curso:");
                int novaCargaHoraria = dado.nextInt();
                curso1.atualizarCargaHoraria(novaCargaHoraria);
                curso1.exibirInformacoes();
                System.out.println();
                break;
            case 4:
                System.out.println("Encerrando o programa...");
                dado.close();
                break;
        
            default:
                break;
        }


    }
}
