import java.util.Scanner;
public class AppControleDeEstoque {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // Versao com infos preenchidas pelo usuario:

        // System.out.println("Qual o nome do produto?");
        // produto1.nome = dado.nextLine();
        // System.out.println("Qual a quantidade de estoque do produto?");
        // produto1.quantidade = dado.nextInt();
        // System.out.println("Qual o preço do produto?");
        // produto1.precoUnitario = dado.nextDouble();
        // System.out.println();
        // System.out.println("Detalhes do produto:");
        // produto1.exibirProduto();
        // System.out.println();

        // Uso de Construtores
        ProdutoEstoque produto1 = new ProdutoEstoque("AppleWatch Series 5", 10, 2499);
        ProdutoEstoque produto2 = new ProdutoEstoque("Iphone 13", 6, 3599);
        ProdutoEstoque produto3 = new ProdutoEstoque("Macbook Air", 2, 6999);

        // Exibindo as info dos produtos
        produto1.exibirProduto();
        System.out.println();

        produto2.exibirProduto();
        System.out.println();

        produto3.exibirProduto();
        System.out.println();

        // Opcoes
        System.out.println("Qual função deseja executar?");
        System.out.println("1) Adicionar Estoque");
        System.out.println("2) Remover Estoque");
        System.out.println("3) Atualizar Preço");
        System.out.println("4) Sair do programa");

        int opcao = dado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Quantas unidades de " + produto1.getNome() + " deseja adicionar ao estoque?");
                int adicional1 = dado.nextInt();
                produto1.adicionarEstoque(adicional1);
                produto1.exibirProduto();
                System.out.println();

                System.out.println("Quantas unidades de " + produto2.getNome() + " deseja adicionar ao estoque?");
                int adicional2 = dado.nextInt();
                produto2.adicionarEstoque(adicional2);
                produto2.exibirProduto();
                System.out.println();

                System.out.println("Quantas unidades de " + produto3.getNome() + " deseja adicionar ao estoque?");
                int adicional3 = dado.nextInt();
                produto3.adicionarEstoque(adicional3);
                produto3.exibirProduto();
                System.out.println();
                break;
            case 2:
                System.out.println("Quantas unidades do produto " + produto1.getNome() + "deseja remover do estoque?");
                int remocao1 = dado.nextInt();
                produto1.removerEstoque(remocao1);
                produto1.exibirProduto();
                System.out.println();
                
                
                System.out.println("Quantas unidades do produto " + produto2.getNome() + "deseja remover do estoque?");
                int remocao2 = dado.nextInt();
                produto2.removerEstoque(remocao2);
                produto2.exibirProduto();
                System.out.println();
                
                
                System.out.println("Quantas unidades do produto " + produto3.getNome() + "deseja remover do estoque?");
                int remocao3 = dado.nextInt();
                produto3.removerEstoque(remocao3);
                produto3.exibirProduto();
                System.out.println();
                break;
            case 3:
                System.out.println("Qual é o novo preço do Produto " + produto1.getNome() + "?");
                double novoPreco1 = dado.nextDouble();
                produto1.atualizarPreco(novoPreco1);
                produto1.exibirProduto();
                System.out.println();
                
                
                System.out.println("Qual é o novo preço do Produto " + produto2.getNome() + "?");
                double novoPreco2 = dado.nextDouble();
                produto1.atualizarPreco(novoPreco2);
                produto1.exibirProduto();
                System.out.println();
                
                
                System.out.println("Qual é o novo preço do Produto " + produto3.getNome() + "?");
                double novoPreco3 = dado.nextDouble();
                produto1.atualizarPreco(novoPreco3);
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
