package GerenciadorDeCursos;
import java.util.Scanner;
public class AppGerenciadorDeCursos {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // Versao sem uso de construtores:
        // System.out.println("Qual o nome do curso?");
        // curso1.nome = dado.nextLine();
        // System.out.println("Qual a categoria (Área de Estudo) do curso?");
        // curso1.categoria = dado.nextLine();
        // System.out.println("Qual a carga horária do curso?");
        // curso1.cargaHoraria = dado.nextInt();
        // System.out.println("Qual o número de alunos inscritos no curso?");
        // curso1.numeroDeAlunosInscritos = dado.nextInt();
        // System.out.println();
        
        // Versao com construtores
        Curso curso1 = new Curso("Sistemas pra Internet", "Ciências Exatas e Tecnologicas", 2060, 260);
        Curso curso2 = new Curso("Arquitetura e Urbanismo", "Artes e Letras", 3600, 490);
        Curso curso3 = new Curso("Medicina", "Ciências Biológicas e da Saúde", 7200, 900);
        
        System.out.println("Detalhes do Cursos oferecidos:");
        curso1.exibirInformacoes();
        System.out.println();

        curso2.exibirInformacoes();
        System.out.println();

        curso3.exibirInformacoes();
        System.out.println();

        // Opcoes
        System.out.println("Qual função deseja executar?");
        System.out.println("1) Aumentar Número de alunos inscritos");
        System.out.println("2) Cancelar Inscrição");
        System.out.println("3) Atualizar Carga Horária");
        System.out.println("4) Sair do programa");

        int opcao = dado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Em qual curso deseja realizar o aumento de alunos?");
                System.out.println("10) Sistemas pra Internet");
                System.out.println("20) Arquitetura e Urbanismo");
                System.out.println("30) Medicina");
                System.out.println("Curso escolhido (10, 20 ou 30):");
                int opcaoCurso = dado.nextInt();

                switch (opcaoCurso) {
                    case 10:
                        System.out.println("Quantos alunos deseja adicionar em " + curso1.getNome() + "?");
                        int adicional = dado.nextInt();
                        curso1.aumentaAlunos(adicional);
                        curso1.exibirInformacoesNovosAlunos();
                        System.out.println();
                        
                    break;
                    case 20:
                        System.out.println("Quantos alunos deseja adicionar em " + curso2.getNome() + "?");
                        int adicional2 = dado.nextInt();
                        curso2.aumentaAlunos(adicional2);
                        curso2.exibirInformacoesNovosAlunos();
                        System.out.println();
                    
                    break;
                    case 30:
                        System.out.println("Quantos alunos deseja adicionar em " + curso3.getNome() + "?");
                        int adicional3 = dado.nextInt();
                        curso3.aumentaAlunos(adicional3);
                        curso3.exibirInformacoesNovosAlunos();
                        System.out.println();
                    
                    break;
                    
                    default:
                    break;
                }
                
                break;
                case 2:
                    System.out.println("Em qual curso deseja realizar o cancelamento de inscrições?");
                    System.out.println("10) Sistemas pra Internet");
                    System.out.println("20) Arquitetura e Urbanismo");
                    System.out.println("30) Medicina");
                    System.out.println("Curso escolhido (10, 20 ou 30):");
                    int opcaoCurso2 = dado.nextInt();
                
                    switch (opcaoCurso2) {
                        case 10:
                            System.out.println("Quantos alunos desejam cancelar sua inscrição em " + curso1 + "?");
                            int remocao = dado.nextInt();
                            curso1.cancelarInscricao(remocao);
                            curso1.exibirInformacoes();
                            System.out.println();
                        
                        break;
                        case 20:
                            System.out.println("Quantos alunos desejam cancelar sua inscrição em " + curso2 + "?");
                            int remocao2 = dado.nextInt();
                            curso2.cancelarInscricao(remocao2);
                            curso2.exibirInformacoes();
                            System.out.println();
                            
                        break;
                        case 30:
                            System.out.println("Quantos alunos desejam cancelar sua inscrição em " + curso3 + "?");
                            int remocao3 = dado.nextInt();
                            curso3.cancelarInscricao(remocao3);
                            curso3.exibirInformacoes();
                            System.out.println();
                            
                            break;
                    
                        default:
                            break;
                    }
                break;
                case 3:
                System.out.println("Em qual curso deseja atualizar a carga horária?");
                System.out.println("10) Sistemas pra Internet");
                System.out.println("20) Arquitetura e Urbanismo");
                System.out.println("30) Medicina");
                System.out.println("Curso escolhido (10, 20 ou 30):");
                int opcaoCurso3 = dado.nextInt();

                switch (opcaoCurso3) {
                    case 10:
                    System.out.println("Digite a nova Carga Horária do Curso:");
                    int novaCargaHoraria = dado.nextInt();
                    curso1.atualizarCargaHoraria(novaCargaHoraria);
                    curso1.exibirInformacoesNovaCargaHoraria();
                    System.out.println();
                        break;
                    case 20:
                        System.out.println("Digite a nova Carga Horária do Curso:");
                        int novaCargaHoraria2 = dado.nextInt();
                        curso2.atualizarCargaHoraria(novaCargaHoraria2);
                        curso2.exibirInformacoesNovaCargaHoraria();
                        System.out.println();
                        
                        break;
                    case 30:
                        
                    System.out.println("Digite a nova Carga Horária do Curso:");
                    int novaCargaHoraria3 = dado.nextInt();
                    curso3.atualizarCargaHoraria(novaCargaHoraria3);
                    curso3.exibirInformacoesNovaCargaHoraria();
                    System.out.println();
                        break;
                
                    default:
                        break;
                }

                
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
