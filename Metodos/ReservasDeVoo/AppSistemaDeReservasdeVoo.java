package ReservasDeVoo;
import java.util.Scanner;

public class AppSistemaDeReservasdeVoo {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        
        Destino destino1 = new Destino("Brasil", "Mato Grosso do Sul", "Campo Grande");
        Destino destino2 = new Destino("África do Sul", "África do Sul", "Cape Town");
        Destino destino3 = new Destino("Estados Unidos", "California", "Los Angeles");

        ReservasDeVoo reserva1 = new ReservasDeVoo(1234, "Maria Silva", "Executiva", destino1);
        ReservasDeVoo reserva2 = new ReservasDeVoo(5678, "Fernando Pereira", "Econômica", destino2);
        ReservasDeVoo reserva3 = new ReservasDeVoo(9101, "Lucas Schmidt", "Primeira Classe", destino3);

        System.out.println("Detalhes das Reservas:");
        reserva1.exibirDetalhes();
        System.out.println();

        reserva2.exibirDetalhes();
        System.out.println();

        reserva3.exibirDetalhes();
        System.out.println();

        ReservasDeVoo.adicionarReserva(reserva1);
        ReservasDeVoo.adicionarReserva(reserva2);
        ReservasDeVoo.adicionarReserva(reserva3);

        // Loop principal para continuar executando até que o usuário escolha sair
        while (true) {
            // Menu de opções
            System.out.println("Escolha uma opção:");
            System.out.println("1. Reservar voo");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Exibir todas as reservas");
            System.out.println("4. Sair");

            // Captura da opção do usuário
            int opcao = dado.nextInt();
            dado.nextLine(); // Limpar o buffer do teclado

            // Switch para tratar a opção selecionada
            switch (opcao) {
                case 1:
                    // Opção para reservar um voo
                    System.out.println("Digite o número do voo:");
                    int numeroVoo = dado.nextInt();
                    dado.nextLine(); // Limpar o buffer do teclado

                    System.out.println("Digite o nome do passageiro:");
                    String nomePassageiro = dado.nextLine();

                    System.out.println("Digite a classe:");
                    String classe = dado.nextLine();

                    System.out.println("Digite o País de destino:");
                    String novoPais = dado.nextLine();

                    System.out.println("Digite o Estado de destino:");
                    String novoEstado = dado.nextLine();

                    System.out.println("Digite a Cidade de destino:");
                    String novaCidade = dado.nextLine();

                    // Criação do novo destino e reserva
                    Destino novoDestino = new Destino(novoPais, novoEstado, novaCidade);
                    ReservasDeVoo novaReserva = new ReservasDeVoo(numeroVoo, nomePassageiro, classe, novoDestino);
                    ReservasDeVoo.adicionarReserva(novaReserva);
                    System.out.println("Reserva adicionada com sucesso!");
                    System.out.println("Informações da Nova reserva:");
                    novaReserva.exibirDetalhes();
                    break;
                case 2:
                    // Opção para cancelar uma reserva
                    System.out.println("Digite o número do voo da reserva a ser cancelada:");
                    int numeroVooCancelar = dado.nextInt();
                    dado.nextLine(); // Limpar o buffer do teclado

                    // Procura a reserva na lista de reservas
                    boolean reservaEncontrada = false;
                    for (ReservasDeVoo reserva : ReservasDeVoo.getReservas()) {
                        if (reserva.getNumeroDoVoo() == numeroVooCancelar) {
                            ReservasDeVoo.cancelarReserva(reserva);
                            System.out.println("Reserva cancelada com sucesso!");
                            reservaEncontrada = true;

                            System.out.println("Informações da Reserva Cancelada:");
                            System.out.println();
                            reserva.exibirDetalhes();
                            break;
                        }
                    }
                    if (!reservaEncontrada) {
                        System.out.println("Reserva não encontrada para o número do voo fornecido.");
                    }
                    break;
                case 3:
                    // Opção para exibir todas as reservas
                    System.out.println("Lista de todas as reservas:");
                    ReservasDeVoo.exibirTodasReservas();
                    break;
                case 4:
                    // Opção para sair do programa
                    System.out.println("Saindo...");
                    return; // Encerra o programa
                default:
                    // Opção inválida
                    System.out.println("Opção inválida");
            }
        }
    }
}
