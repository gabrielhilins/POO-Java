import java.util.Scanner;
public class AppAgendaTelefonica {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        AgendaTelefonica contato1 = new AgendaTelefonica();

            System.out.println("\nDigite um nome:");
            contato1.nome = dado.nextLine();
            System.out.println("Digite um número de telefone:");
            contato1.telefone = dado.nextLine();
            System.out.println("Digite um email:");
            contato1.email = dado.nextLine();
    
            if (contato1.validarEmail() == true && contato1.validarTelefone() == true) {
                System.out.println("Detalhes do Contato 1:");
                contato1.exibirContato();
                System.out.println();
        
        
                System.out.println("Escolha uma opcão:");
                System.out.println("1) Alterar Email:");
                System.out.println("2) Alterar Telefone:");
                System.out.println("3) Sair do Programa:");
                int opcao = dado.nextInt();
        
                switch (opcao) {
                    case 1:
                        System.out.println("Qual será o novo Email?");
                        String novoEmail = dado.nextLine();
        
                        contato1.alterarEmail(novoEmail);
                        contato1.validarEmail();
                        contato1.exibirContato();
                        break;
                
                    case 2:
                        System.out.println("Qual será o novo telefone?");
                        String novoTelefone = dado.nextLine();
                        contato1.alterarTelefone(novoTelefone);
                        contato1.validarTelefone();
                        contato1.exibirContato();
            
                    case 3: 
                        System.out.println("Encerrando o programa...");
                        dado.close();
                        return; // Encerra o programa
                    default:
                        break;
                }
            }
            else {
               System.out.println("Informações Inválidas! Tente Novamente");
            }
            

        }

        
    }

