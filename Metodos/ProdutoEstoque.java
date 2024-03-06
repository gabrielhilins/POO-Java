public class ProdutoEstoque {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    // Construtor
    ProdutoEstoque(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    void exibirProduto() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Estoque do produto: " + quantidade + " unidades");
        System.out.println("Preço Unitário: R$" + precoUnitario);
    }

    int adicionarEstoque(int adicional) {
        quantidade += adicional;
        return quantidade;
    }

    int removerEstoque(int remocao) {
        if (quantidade > 0 && remocao > 0) {
            quantidade -= remocao;
            return quantidade;
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente!");
        }
        return quantidade;
    }

    double atualizarPreco(double novoPreco) {
        if (novoPreco != precoUnitario) {
            precoUnitario = novoPreco;
            return precoUnitario;
        } else {
            return precoUnitario;
        }
    }

    // Getters
    public String getNome() {
        return this.nome;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
