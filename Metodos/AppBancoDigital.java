
public class AppBancoDigital {
    public static void main(String[] args) {
        // Objetos prrenchidos com o uso dos construtores
        ContaCorrente cc1 = new ContaCorrente("18294-2", "Pedro", 50);
        ContaCorrente cc2 = new ContaCorrente("233323-2", "Jonas", 200);
        ContaCorrente cc3 = new ContaCorrente("123456-4", "Roberta", 700);
        System.out.println("Saldo Inicial:");
       
        cc1.exibirInfo();
        System.out.println();
        cc2.exibirInfo();
        System.out.println();
        cc3.exibirInfo();
        System.out.println();

        cc1.depositar(25);
        System.out.println("Deposito realizado com sucesso!");
        cc1.exibirInfo();
        System.out.println();

        cc2.depositar(2000);
        System.out.println("Deposito realizado com sucesso!");
        cc2.exibirInfo();
        System.out.println();

        cc3.depositar(39);
        System.out.println("Deposito realizado com sucesso!");
        cc3.exibirInfo();
        System.out.println();

        if (cc1.sacar(30)) {
            System.out.println();
            System.out.println("Saque realizado com sucesso");
            cc1.exibirInfo();
        } if (cc2.sacar(42)) {
            System.out.println();
            System.out.println("Saque realizado com sucesso");
            cc2.exibirInfo();
        } if (cc3.sacar(92)) {
            System.out.println();
            System.out.println("Saque realizado com sucesso");
            cc3.exibirInfo();
        } else {
            System.out.println();
            System.out.println("Saldo insuficiente!");
            cc1.exibirInfo();
            cc2.exibirInfo();
            cc3.exibirInfo();
        }
        
    }
}
