public class Livro {
    String titulo, autor;
    int anoPublicacao;

    public void imprimirDetalhes() {
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println(); 
    }
}
