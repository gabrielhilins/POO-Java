import java.util.Scanner;
public class AppControleDeEstoque {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        ProdutoEstoque produto1 = new ProdutoEstoque();

        System.out.println("Qual o nome do produto?");
        produto1.nome = dado.nextLine();

        System.out.println("Qual a quantidade de estoque do produto?");
        produto1.quantidade = dado.nextInt();

        System.out.println("Qual o preço do produto?");
        produto1.precoUnitario = dado.nextDouble();

        produto1.exibirProduto();
        System.out.println();

        System.out.println("Qual função deseja executar?");
        System.out.println("1) Adicionar Estoque");
        System.out.println("2) Remover Estoque");
        System.out.println("3) Atualizar Preço");
        System.out.println("4) Sair do programa");

        int opcao = dado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Quantas unidades deseja adicionar ao estoque?");
                int adicional = dado.nextInt();
                produto1.adicionarEstoque(adicional);
                produto1.exibirProduto();
                System.out.println();
                break;
            case 2:
                System.out.println("Quantas unidades deseja remover do estoque?");
                int remocao = dado.nextInt();
                produto1.removerEstoque(remocao);
                produto1.exibirProduto();
                System.out.println();
                break;
            case 3:
                System.out.println("Qual é o novo preço do Produto?");
                double novoPreco = dado.nextDouble();
                produto1.atualizarPreco(novoPreco);
                produto1.exibirProduto();
                System.out.println();
                break;
            case 4:
                System.out.println("Encerrando o programa...");
                dado.close();
                break;
        
            default:
                break;
        }


    }
}
