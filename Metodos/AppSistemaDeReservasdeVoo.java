import java.util.Scanner;
public class AppSistemaDeReservasdeVoo {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        ReservasDeVoo reserva1 = new ReservasDeVoo();

        System.out.println("Qual o número do voo?");
        reserva1.numeroDoVoo = dado.nextLine();
        System.out.println("Qual o Nome do Passageiro?");
        reserva1.nomeDoPassageiro = dado.nextLine();
        System.out.println("Qual a classe do Voo?");
        reserva1.classe = dado.nextLine();
        System.out.println();


        reserva1.exibirDetalhes();
        System.out.println();

        // Implementar o resto do código posteriormente 
        // com a logica de escolha caso
        // e com as chamadas dos devidos metodos
    }
}
