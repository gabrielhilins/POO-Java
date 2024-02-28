public class ReservasDeVoo {
    int numeroDoVoo;
    String nomeDoPassageiro;
    String classe;
    String destino;

    //Construtor
    ReservasDeVoo(int numeroDoVoo, String nomeDoPassageiro, String classe, String destino) {
        this.numeroDoVoo = numeroDoVoo;
        this.nomeDoPassageiro = nomeDoPassageiro;
        this.classe = classe;
        this.destino = destino;
    }

    void exibirDetalhes() {
        System.out.println("Número do Voo: " + numeroDoVoo);
        System.out.println("Nome do Passageiro: " + nomeDoPassageiro);
        System.out.println("Classe: " + classe);
        System.out.println("Destino: " + destino);
    }

    String alterarClasse(String novaClasse) {
        if (novaClasse != classe) {
            classe = novaClasse;
            return classe;
        } else {
            return classe;
        }
    }

    // Adicionar método cancelarReserva()

    // Adicionar método Adicionarreserva()
}
