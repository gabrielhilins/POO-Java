public class AppAgendaTelefonica {
    public static void main(String[] args) {
        AgendaTelefonica contato1 = new AgendaTelefonica();
        contato1.nome = "Cachorrinho";
        contato1.telefone = "8190350061";
        contato1.email = "lildog@gmail.com";

        System.out.println("Detalhes do Contato 1:");
        contato1.exibirContato();
        System.out.println();

        contato1.alterarEmail("cachorroWyrla@gmail.com");
        contato1.exibirContato();
        System.out.println();

        contato1.alterarTelefone("81939448393");
        contato1.exibirContato();
        System.out.println();

        contato1.validarEmail();
        contato1.validarTelefone();
        contato1.exibirContato();
    }
}
