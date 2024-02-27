public class ReservasDeVoo {
    String numeroDoVoo, nomeDoPassageiro, classe;

    void exibirDetalhes() {
        System.out.println("Número do Voo: " + numeroDoVoo);
        System.out.println("Nome do Passageiro: " + nomeDoPassageiro);
        System.out.println("Classe: " + classe);
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
