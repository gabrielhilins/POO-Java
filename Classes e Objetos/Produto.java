public class Produto {
    String nome, categoria;
    double preco;

    public void imprimirDetalhes() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Preço: R$" + preco);
        System.out.println(); 
    }
}
