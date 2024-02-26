public class ContaCorrente {
    String numeroDaConta;
    double saldo;
    String nomeDoTitular;

    void depositar(double valor) {
        saldo += valor;
    }

    void exibirInfo() {
        System.out.println("Nome: " + nomeDoTitular + 
                            "\nConta: " + numeroDaConta +
                            "\nSaldo: " + saldo);

    }

    boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        else {
            return false;
        }
        
    }
}