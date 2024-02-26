public class MainHotel {

    public static void main(String[] args) {
        Reservas reserva1 = new Reservas();
        reserva1.nomeHospede = "Maria Clara";
        reserva1.numeroDeNoites = 5;
        reserva1.tipoDeQuarto = "Duplo";

        Reservas reserva2 = new Reservas();
        reserva2.nomeHospede = "Maria Eduarda";
        reserva2.numeroDeNoites = 4;
        reserva2.tipoDeQuarto = "Simples";

        Reservas reserva3 = new Reservas();
        reserva3.nomeHospede = "Maria Alcione";
        reserva3.numeroDeNoites = 6;
        reserva3.tipoDeQuarto = "Suíte";

        System.out.println("Detalhes das Reservas:");
        reserva1.imprimirDetalhes();
        reserva2.imprimirDetalhes();
        reserva3.imprimirDetalhes();
    }
}
