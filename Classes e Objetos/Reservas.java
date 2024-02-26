public class Reservas {
    String nomeHospede, tipoDeQuarto;
    int numeroDeNoites;
    
        // Método para imprimir os detalhes da reserva
        public void imprimirDetalhes() {
            System.out.println("Hóspede: " + nomeHospede);
            System.out.println("Número de Noites: " + numeroDeNoites);
            System.out.println("Tipo de Quarto: " + tipoDeQuarto);
            System.out.println(); 
        }
    }
