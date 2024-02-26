public class MainEventos {
    public static void main(String[] args) {
        Evento evento1 = new Evento();
        evento1.nomeEvento = "FuturoTech";
        evento1.local = "Porto Digital Europa";
        evento1.data = "20/04/24";

        Evento evento2 = new Evento();
        evento2.nomeEvento = "Sabor da Cidade";
        evento2.local = "Praça 13 de Maio";
        evento2.data = "24/02/24";

        Evento evento3 = new Evento();
        evento3.nomeEvento = "Visões Abstratas";
        evento3.local = "Louvre Galerie";
        evento3.data = "02/05/24";

        System.out.println("Detalhes dos eventos:");
        evento1.imprimirDetalhes();
        evento2.imprimirDetalhes();
        evento3.imprimirDetalhes();

        
    }
}
