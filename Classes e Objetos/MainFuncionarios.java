public class MainFuncionarios {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Waldemir Silva";
        funcionario1.departamento = "Vendas";
        funcionario1.salario = 2900;

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Monica Santos";
        funcionario2.departamento = "Administrativo";
        funcionario2.salario = 4300;

        Funcionario funcionario3 = new Funcionario();
        funcionario3.nome = "Jobson Pereira";
        funcionario3.departamento = "Logística";
        funcionario3.salario = 3100;

        System.out.println("Detalhes dos Funcionarios:");
        funcionario1.imprimirDetalhes();
        funcionario2.imprimirDetalhes();
        funcionario3.imprimirDetalhes();
    }
}
