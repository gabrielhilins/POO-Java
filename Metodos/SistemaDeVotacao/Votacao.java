package SistemaDeVotacao;

public class Votacao {
    private Candidato candidato;
    private int votosRecebidos;

    // Construtor
    public Votacao(Candidato candidato, int votosRecebidos) {
        this.candidato = candidato;
        this.votosRecebidos = votosRecebidos;
    }

    // Getters e Setters
    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public int getVotosRecebidos() {
        return votosRecebidos;
    }

    public void setVotosRecebidos(int votosRecebidos) {
        this.votosRecebidos = votosRecebidos;
    }

    // Método para exibir o resultado
    public void exibirResultado() {
        System.out.println("Candidato: " + candidato.getNome());
        System.out.println("Partido: " + candidato.getPartido());
        System.out.println("Cargo: " + candidato.getCargo());
        System.out.println("Número de Votos Recebidos: " + votosRecebidos + " votos");
    }

    // Método para adicionar votos
    public void adicionarVotos(int adicional) {
        votosRecebidos += adicional;
    }

    // Método para zerar votos
    public void zerarVotos() {
        votosRecebidos = 0;
    }

    // Método para comparar votos com outra instância de Votacao
    public int compararVotos(Votacao outraVotacao) {
        return this.votosRecebidos - outraVotacao.getVotosRecebidos();
    }
}
