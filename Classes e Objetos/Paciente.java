public class Paciente {
    String nome, diagnostico;
    int idade;

    public void imprimirDetalhes() {
        System.out.println("Nome do paciente: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Diagnóstico: " + diagnostico);
        System.out.println(); 
    }
}
