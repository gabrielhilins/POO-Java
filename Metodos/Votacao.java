public class Votacao {
    String candidato;
    int votosRecebidos;

    void exibirResultado() {
        System.out.println("Candidato: " + candidato);
        System.out.println("Número de Votos Recebidos: " + votosRecebidos + " votos");
    }

    int adicionarVotos(int adicional) {
        votosRecebidos += adicional;
        return votosRecebidos;
    }

    int zerarVotos() {
        votosRecebidos = 0;
        return votosRecebidos;
    }

    // compararVotos(Votacao outroVotacao) { }
}
