public class MainRedeSocial {
    public static void main(String[] args) {
        PerfilUsuario user1 = new PerfilUsuario();
        user1.username = "aventureiro_23";
        user1.bio = "Amante de viagens, fotografia e aventuras ao ar livre. Sempre em busca da próxima grande experiência.";
        user1.numeroSeguidores = 10523;

        PerfilUsuario user2 = new PerfilUsuario();
        user2.username = "chef_gourmet";
        user2.bio = "Chef de cozinha apaixonado por criar pratos deliciosos e compartilhar receitas únicas. Amante de gastronomia e bons vinhos.";
        user2.numeroSeguidores = 15789;

        PerfilUsuario user3 = new PerfilUsuario();
        user3.username = "fashionista_2023";
        user3.bio = "Blogueira de moda e estilo compartilhando as últimas tendências e dicas de estilo. Viciada em moda, beleza e viagens. ";
        user3.numeroSeguidores = 25674;

        System.out.println("Detalhes dos Perfils:");
        user1.imprimirDetalhes();
        user2.imprimirDetalhes();
        user3.imprimirDetalhes();

    }
}
