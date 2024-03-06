  package SistemaDeVotacao;

public class Candidato {
    private String nome;
    private String partido;
    private String cargo;

    // Construtor
    public Candidato(String nome, String partido, String cargo) {
        this.nome = nome;
        this.partido = partido;
        this.cargo = cargo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

