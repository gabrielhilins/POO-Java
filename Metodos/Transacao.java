import java.util.ArrayList;

public class Transacao {
    String descricao, tipo;
    double valor;

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
