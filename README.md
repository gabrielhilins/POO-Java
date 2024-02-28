# Programação Orientada a Objetos com Java

## Sobre o Repositório
- Este repositório contém diversos programas utilizando conhecimentos de **Programação Orientada à Objetos**, utilizando a linguagem de programação **Java**.

- O projeto está dividido em 2 partes: **Métodos** e **Classe e Objetos**

- Métodos: Nessa pasta contém programas em java, utilizando métodos e construtores

- Principais Programas dessa pasta:

- 🏦 Banco Digital Simples

    - [AppBancoDigital.java](https://github.com/gabrielhilins/POO-OOP-Java/blob/main/Metodos/AppBancoDigital.java) e [ContaCorrente.java](https://github.com/gabrielhilins/POO-OOP-Java/blob/main/Metodos/ContaCorrente.java)

        - **Requisitos**: Um **banco digital** deseja oferecer aos seus clientes uma experiência simplificada através de uma conta corrente que permita depósitos, saques, transferências e consulta de saldo. Para atender a essa necessidade, foi criada a classe ContaCorrente com os atributos numeroDaConta (String), saldo (double) e nomeDoTitular (String).
            - Métodos:
                - depositar(double valor): aumenta o saldo.
                - sacar(double valor): diminui o saldo, se houver saldo suficiente.
                - transferir(ContaCorrente destino, double valor): transfere valor de uma conta para outra.
                - exibirSaldo(): mostra o saldo atual da conta.

- 📦 Gerenciador de Estoque
    - [AppControleDeEstoque.java](https://github.com/gabrielhilins/POO-OOP-Java/blob/main/Metodos/AppControleDeEstoque.java) e [ProdutoEstoque.java](https://github.com/gabrielhilins/POO-OOP-Java/blob/main/Metodos/ProdutoEstoque.java)

        - **Requisitos**: Pequenos armazéns necessitam de um **Sistema Eficiente para gerenciar o estoque de seus produtos**. A classe ProdutoEstoque deve permitir o controle de nome (String), quantidade (int) e precoUnitario (double) de cada produto, facilitando a adição e remoção de itens, além de permitir a atualização de preços e exibição de informações dos produtos.
            - Métodos:
                - adicionarEstoque(int quantidade): aumenta a quantidade em estoque.
                - removerEstoque(int quantidade): diminui a quantidade em estoque, se houver quantidade suficiente.
                - atualizarPreco(double novoPreco): atualiza o preço unitário do produto.
                - exibirProduto(): mostra o nome, quantidade e preço do produto.

