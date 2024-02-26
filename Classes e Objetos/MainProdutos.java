public class MainProdutos {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Caixa de Som";
        produto1.preco = 350;
        produto1.categoria = "Eletrônicos";

        Produto produto2 = new Produto();
        produto2.nome = "Mesa de Jantar";
        produto2.preco = 540;
        produto2.categoria = "Móveis";

        Produto produto3 = new Produto();
        produto3.nome = "Geladeira";
        produto3.preco = 2600;
        produto3.categoria = "Eletrodomésticos";

        System.out.println("Detalhes dos produtos:");
        produto1.imprimirDetalhes();
        produto2.imprimirDetalhes();
        produto3.imprimirDetalhes();

    }
}
