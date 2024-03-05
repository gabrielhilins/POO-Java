import java.util.Scanner;

public class AppAgendaTelefonica {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        AgendaTelefonica contato1 = new AgendaTelefonica("Fernando", "81923467896", "fe12@gmail.com");
        AgendaTelefonica contato2 = new AgendaTelefonica("Josiane", "85867823049", "josilabel@gmail.com");
        AgendaTelefonica contato3 = new AgendaTelefonica("Laura", "11158684059", "laurinhag@gmail.com");

        // Verificação e interação com o contato1
        if (contato1.validarEmail() && contato1.validarTelefone()) {
            System.out.println("Detalhes do Contato do(a) " + contato1 + ":");
            contato1.exibirContato();
            System.out.println();

            // Lógica de interação com o contato1
            System.out.println("Escolha uma opção para o Contato do(a) " + contato1 + ":");
            System.out.println("1) Alterar Email");
            System.out.println("2) Alterar Telefone");
            System.out.println("3) Sair do Programa");
            int opcao1 = dado.nextInt();
            dado.nextLine(); // Limpar o buffer de entrada

            switch (opcao1) {
                case 1:
                    System.out.println("Qual será o novo Email?");
                    String novoEmail1 = dado.nextLine();
                    contato1.alterarEmail(novoEmail1);
                    contato1.exibirContato();
                    break;

                case 2:
                    System.out.println("Qual será o novo telefone?");
                    String novoTelefone1 = dado.nextLine();
                    contato1.alterarTelefone(novoTelefone1);
                    contato1.exibirContato();
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    dado.close();
                    return; // Encerra o programa

                default:
                    break;
            }
        } else {
            System.out.println("Informações do Contato do(a) " + contato1.getNome() +  " inválidas! Tente Novamente");
        }

        // Verificação e interação com o contato2
        if (contato2.validarEmail() && contato2.validarTelefone()) {
            System.out.println("Detalhes do Contato do(a) " + contato2.getNome() + ":");
            contato2.exibirContato();
            System.out.println();

            // Lógica de interação com o contato2
            System.out.println("Escolha uma opção para o Contato do(a) " + contato2.getNome() + ":");
            System.out.println("1) Alterar Email");
            System.out.println("2) Alterar Telefone");
            System.out.println("3) Sair do Programa");
            int opcao2 = dado.nextInt();
            dado.nextLine(); // Limpar o buffer de entrada

            switch (opcao2) {
                case 1:
                    System.out.println("Qual será o novo Email?");
                    String novoEmail2 = dado.nextLine();
                    contato2.alterarEmail(novoEmail2);
                    contato2.exibirContato();
                    break;

                case 2:
                    System.out.println("Qual será o novo telefone?");
                    String novoTelefone2 = dado.nextLine();
                    contato2.alterarTelefone(novoTelefone2);
                    contato2.exibirContato();
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    dado.close();
                    return; // Encerra o programa

                default:
                    break;
            }
        } else {
            System.out.println("Informações do(a) " + contato2.getNome() + " inválidas! Tente Novamente");
        }

        // Verificação e interação com o contato3
        if (contato3.validarEmail() && contato3.validarTelefone()) {
            System.out.println("Detalhes do Contato do(a) " + contato3.getNome() + ":");
            contato3.exibirContato();
            System.out.println();

            // Lógica de interação com o contato3
            System.out.println("Escolha uma opção para o Contato do(a)" + contato3.getNome() + ":");
            System.out.println("1) Alterar Email");
            System.out.println("2) Alterar Telefone");
            System.out.println("3) Sair do Programa");
            int opcao3 = dado.nextInt();
            dado.nextLine(); // Limpar o buffer de entrada

            switch (opcao3) {
                case 1:
                    System.out.println("Qual será o novo Email?");
                    String novoEmail3 = dado.nextLine();
                    contato3.alterarEmail(novoEmail3);
                    contato3.exibirContato();
                    break;

                case 2:
                    System.out.println("Qual será o novo telefone?");
                    String novoTelefone3 = dado.nextLine();
                    contato3.alterarTelefone(novoTelefone3);
                    contato3.exibirContato();
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    dado.close();
                    return; // Encerra o programa

                default:
                    break;
            }
        } else {
            System.out.println("Informações do Contato do(a) " + contato3.getNome() +  "inválidas! Tente Novamente");
        }
    }
}
