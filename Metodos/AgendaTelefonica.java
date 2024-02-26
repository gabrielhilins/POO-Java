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

    void validarEmail() {
        for (int i = 0; i < email.length(); i++) {
            if (email == "@") {
                System.out.println("Email Validado com sucesso!");
            }
            else {
                System.out.println("Email Inválido! Tente novamente");
            }
        }
    }

    void validarTelefone() {
        for (int i = 0; i < telefone.length(); i++) {
            if (telefone.length() == 11) {
                System.out.println("Telefone Validado com sucesso!");
            }
            else {
                System.out.println("Telefone Inválido! Tente novamente");
            }
        }
    }

   
}
