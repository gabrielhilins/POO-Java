public class Transacao {
    String descricao;
    String tipo;
    double valor;

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
}
