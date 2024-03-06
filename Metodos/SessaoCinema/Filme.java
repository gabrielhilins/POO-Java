package SessaoCinema;

public class Filme {
    private String nome;
    private String diretor;
    private String ano;
    private String duracao;

    // Construtor
    public Filme(String nome, String diretor, String ano, String duracao) {
        this.nome = nome;
        this.diretor = diretor;
        this.ano = ano;
        this.duracao = duracao;
    }

    // Getters e setters (opcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
