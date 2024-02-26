public class Funcionario {
    String nome, departamento;
    double salario;

    public void imprimirDetalhes() {
        System.out.println("Nome do Funcionario: " +nome);
        System.out.println("Departamento: " +departamento);
        System.out.println("Salario: R$" + salario);
        System.out.println(); 
    }
}
