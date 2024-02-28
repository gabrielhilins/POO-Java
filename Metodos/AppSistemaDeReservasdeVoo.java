import java.util.Scanner;
public class AppSistemaDeReservasdeVoo {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // Versao sem uso de construtores
        // System.out.println("Qual o número do voo?");
        // reserva1.numeroDoVoo = dado.nextLine();
        // System.out.println("Qual o Nome do Passageiro?");
        // reserva1.nomeDoPassageiro = dado.nextLine();
        // System.out.println("Qual a classe do Voo?");
        // reserva1.classe = dado.nextLine();
        // System.out.println();

        // Versao usando construtores
        ReservasDeVoo reserva1 = new ReservasDeVoo(1234, "Maria Silva", "Executiva", "Campo Grande - MS");
        ReservasDeVoo reserva2 = new ReservasDeVoo(5678, "Fernando Pereira", "Econômica", "Boa Vista - RR");
        ReservasDeVoo reserva3 = new ReservasDeVoo(9101, "Lucas Schmidt", "Primeira Classe", "New York");


        System.out.println("Detalhes das Reservas:");
        reserva1.exibirDetalhes();
        System.out.println();

        reserva2.exibirDetalhes();
        System.out.println();

        reserva3.exibirDetalhes();
        System.out.println();

        // Implementar o resto do código posteriormente 
        // com a logica de escolha caso
        // e com as chamadas dos devidos metodos
    }
}
