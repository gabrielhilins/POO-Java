package ReservasDeVoo;

import java.util.ArrayList;
import java.util.List;

public class ReservasDeVoo {
    // Variáveis de instância para armazenar os detalhes da reserva
    private int numeroDoVoo;
    private String nomeDoPassageiro;
    private String classe;
    private Destino destino;

    // Lista estática para armazenar todas as reservas
    private static List<ReservasDeVoo> reservas = new ArrayList<>();

    // Construtor para inicializar os detalhes da reserva
    public ReservasDeVoo(int numeroDoVoo, String nomeDoPassageiro, String classe, Destino destino) {
        this.numeroDoVoo = numeroDoVoo;
        this.nomeDoPassageiro = nomeDoPassageiro;
        this.classe = classe;
        this.destino = destino;
    }

    // Métodos getters e setters para cada variável de instância
    public int getNumeroDoVoo() {
        return numeroDoVoo;
    }

    public void setNumeroDoVoo(int numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }

    public String getNomeDoPassageiro() {
        return nomeDoPassageiro;
    }

    public void setNomeDoPassageiro(String nomeDoPassageiro) {
        this.nomeDoPassageiro = nomeDoPassageiro;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public static List<ReservasDeVoo> getReservas() {
        return reservas;
    }

    public static void setReservas(List<ReservasDeVoo> novaListaReservas) {
        reservas = novaListaReservas;
    }
    
    // Método para exibir os detalhes da reserva
    public void exibirDetalhes() {
        System.out.println("Número do Voo: " + numeroDoVoo);
        System.out.println("Nome do Passageiro: " + nomeDoPassageiro);
        System.out.println("Classe: " + classe);
        System.out.println("Destino: " + destino.getPais() + ", " + destino.getEstado() + ", " + destino.getCidade());
    }

    // Método estático para adicionar uma reserva à lista de reservas
    public static void adicionarReserva(ReservasDeVoo reserva) {
        reservas.add(reserva); // Adiciona a reserva à lista de reservas
    }

    // Método estático para cancelar uma reserva da lista de reservas
    public static void cancelarReserva(ReservasDeVoo reserva) {
        reservas.remove(reserva); // Remove a reserva da lista de reservas
    }

    // Método opcional para exibir detalhes de todas as reservas
    public static void exibirTodasReservas() {
        for (ReservasDeVoo reserva : reservas) {
            reserva.exibirDetalhes(); // Exibe os detalhes de cada reserva
            System.out.println();
        }
    }
}
