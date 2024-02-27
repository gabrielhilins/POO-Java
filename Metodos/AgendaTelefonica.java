public class AgendaTelefonica {
    String nome, telefone, email;

    void exibirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }

    String alterarTelefone(String novoTelefone) {
        telefone = novoTelefone;
        return telefone;
    }

    String alterarEmail(String novoEmail) {
        email = novoEmail;
        return email;
    }

    boolean validarEmail() {
        if (email.contains("@")) {
            return true;
        } else {
            return false;
        }
    }

    boolean validarTelefone() {
        if (telefone.length() == 11) {
            return true;
        } else {
            return false;
        }
    }

}
