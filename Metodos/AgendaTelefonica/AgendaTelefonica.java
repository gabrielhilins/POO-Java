package AgendaTelefonica;
public class AgendaTelefonica {
    private String nome;
    private String telefone;
    private String email;

    // Construtor
    AgendaTelefonica(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

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

    // Getter
    public String getNome() {
        return this.nome;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public String getEmail() {
        return this.email;
    }
    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
