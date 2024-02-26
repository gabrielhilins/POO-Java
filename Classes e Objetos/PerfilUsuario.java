public class PerfilUsuario {
    String username, bio;
    int numeroSeguidores;

    public void imprimirDetalhes(){
        System.out.println("Nome de Usuário: @" + username);
        System.out.println("Bio: " + bio);
        System.out.println("Seguidores: " + numeroSeguidores);
    }
}
