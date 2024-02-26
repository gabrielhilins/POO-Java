public class MainPedidosRestaturante {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        pedido1.numeroPedido = 1001;
        pedido1.descricao = "Pizza Margherita (tomate, muçarela, manjericão)";
        pedido1.valorPedido = 49.90;

        Pedido pedido2 = new Pedido();
        pedido2.numeroPedido = 1002;
        pedido2.descricao = "Espaguete à Carbonara (espaguete, molho à base de queijo, bacon, ovos)";
        pedido2.valorPedido = 34.90;

        Pedido pedido3 = new Pedido();
        pedido3.numeroPedido = 1003;
        pedido3.descricao = "Hambúrguer Gourmet (pão brioche, hambúrguer de carne angus, queijo cheddar, bacon crocante, alface, tomate, cebola caramelizada)";
        pedido3.valorPedido = 36.90;

        System.out.println("Detalhes dos pedidos:");
        pedido1.imprimirDetalhes();
        pedido2.imprimirDetalhes();
        pedido3.imprimirDetalhes();

        
    }
}
