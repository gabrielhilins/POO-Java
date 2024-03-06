package BancoDigital;
public class ContaCorrente {
    private String numeroDaConta;
    private double saldo;
    private String nomeDoTitular;

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

    // Getters
    public String getNumeroDaConta() {
        return this.numeroDaConta;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public String getNomeDoTitular() {
        return this.nomeDoTitular;
    }

    // Setters
    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

}