public class ProdutoEstoque {
    String nome;
    int quantidade;
    double precoUnitario;

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
}
