public class Pedido {
    int numeroPedido;
    String descricao;
    double valorPedido;

    public void imprimirDetalhes() {
        System.out.println("Número do pedido: " + numeroPedido);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valorPedido);
        System.out.println(); 
    }
}
