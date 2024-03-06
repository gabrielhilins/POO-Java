package SessaoCinema;

public class SessaoCinema {
    private Filme filme;
    private String horario;
    private int capacidadeTotal;
    private int ingressosVendidos;

    // Construtor
    public SessaoCinema(Filme filme, String horario, int capacidadeTotal, int ingressosVendidos) {
        this.filme = filme;
        this.horario = horario;
        this.capacidadeTotal = capacidadeTotal;
        this.ingressosVendidos = ingressosVendidos;
    }

    // Métodos getters e setters
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    void exibirInfoSessao() {
        System.out.println("Filme: " + filme.getNome());
        System.out.println("Horario:" + horario);
        System.out.println("Capacidade Total: " + capacidadeTotal + " lugares");
        System.out.println("Ingressos Já Vendidos: " + ingressosVendidos + " ingressos");
    }

    int venderIngresso(int ingresso) {
        if (ingressosVendidos <= capacidadeTotal) {
            ingressosVendidos += ingresso;
        } else {
            System.out.println("Número de ingressos vendidos maior que a capacidade total da sala!");
            return 0;
        }
        return ingressosVendidos;
    }

    int cancelarIngresso(int ingresso) {
        capacidadeTotal -= ingresso;
        ingressosVendidos -= ingresso;
        return ingressosVendidos;
    }

    String alterarHorario(String novoHorario) {
        horario = novoHorario;
        return horario;
    }
}
