import java.util.Scanner;
public class AppGerenciadorFinanceiro {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        Transacao transacao1 = new Transacao();

        // Adicionar laço while para o usuário poder ir adicionando novas transacoes

        System.out.println("Qual a descrição da transação?");
        transacao1.descricao = dado.nextLine();
        System.out.println("Qual o Tipo de Transação");
        transacao1.tipo = dado.nextLine();
        System.out.println("Qual o valor da transação?");
        transacao1.valor = dado.nextDouble();

        transacao1.exibirtransacao();
        System.out.println();

        // Adicionar logica dom escolha caso
    }
}
