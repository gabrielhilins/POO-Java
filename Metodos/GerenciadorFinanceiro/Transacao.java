package GerenciadorFinanceiro;
public class Transacao {
    private String descricao;
    private String tipo;
    private double valor;

    //Construtor
    Transacao(String descricao, String tipo, double valor) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
    }

    void exibirtransacao() {
        System.out.println("Descrição da Transação: " + descricao);
        System.out.println("Tipo de Transação: " + tipo);
        System.out.println("Valor da transação: " + valor);
    }

    // int registrarTransacao(int novaTransacao) {}

    String alterarDescricao(String novaDescricao) {
        if (novaDescricao != descricao) {
            descricao = novaDescricao;
            return descricao;
        } else {
            System.out.println("Descrição igual à ultima!");
            return descricao;
        }
    }

    // ArrayList calcularSaldo(ArrayList<Transacao> transacoes) {}

    // Getters
    public String getDescricao() {
        return this.descricao;
    }
    public double getValor() {
        return this.valor;
    }
    public String getTipo() {
        return this.tipo;
    }

    // Setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
