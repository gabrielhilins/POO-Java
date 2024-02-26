
public class AppBancoDigital {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.nomeDoTitular = "Pedro";
        cc.numeroDaConta = "";
        cc.saldo = 50;

        System.out.println("Saldo Inicial:");
        cc.exibirInfo();
        System.out.println();

        
        cc.depositar(2);
        System.out.println("Deposito realizado com sucesso!");
        cc.exibirInfo();

        if (cc.sacar(30) == true) {
            System.out.println();
            System.out.println("Saque realizado com sucesso");
            cc.exibirInfo();
        }
        else {
            System.out.println();
            System.out.println("Saldo insuficiente!");
            cc.exibirInfo();
        }
    }
}
