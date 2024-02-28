import java.util.Scanner;
public class AppGerenciadorFinanceiro {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // Versao sem uso de construtores:
        // System.out.println("Qual a descrição da transação?");
        // transacao1.descricao = dado.nextLine();
        // System.out.println("Qual o Tipo de Transação");
        // transacao1.tipo = dado.nextLine();
        // System.out.println("Qual o valor da transação?");
        // transacao1.valor = dado.nextDouble();
        // System.out.println();


        Transacao transacao1 = new Transacao("Feira", "Cartãp de Débito", 750);
        Transacao transacao2 = new Transacao("Compra de Tênis de Corrida", "Cartão de Crédito", 350);
        Transacao transacao3 = new Transacao("Barzinho com os amigos", "Pix", 50);

        System.out.println("Detalhes da Transações:");
        transacao1.exibirtransacao();
        System.out.println();

        transacao2.exibirtransacao();
        System.out.println();

        transacao3.exibirtransacao();
        System.out.println();
        
        // Adicionar laço while para o usuário poder ir adicionando novas transacoes
        // Adicionar logica dom escolha caso
    }
}
