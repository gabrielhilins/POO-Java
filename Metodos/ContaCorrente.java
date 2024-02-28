public class ContaCorrente {
    String numeroDaConta;
    double saldo;
    String nomeDoTitular;

    // Atualizacao do codigo, agora com metodo construtor
    ContaCorrente(String numeroDaConta, String nomeDoTitular,double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

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