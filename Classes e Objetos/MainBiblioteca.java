public class MainBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "1984";
        livro1.autor = "George Orwell";
        livro1.anoPublicacao = 1949;

        Livro livro2 = new Livro();
        livro2.titulo = "100 anos de Solidão";
        livro2.autor = "Gabriel García Márquez";
        livro2.anoPublicacao = 1967;

        Livro livro3 = new Livro();
        livro3.titulo = "Harry Potter e a Pedra Filosofal";
        livro3.autor = "J.K Rowling";
        livro3.anoPublicacao = 1997;

        System.out.println("Detalhes dos livros:");
        livro1.imprimirDetalhes();
        livro2.imprimirDetalhes();
        livro3.imprimirDetalhes();

    }
}
