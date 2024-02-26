public class MainAlunos {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João da Silva";
        aluno1.idade = 16;
        aluno1.serie = "2 Ano EM";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria Oliveira";
        aluno2.idade = 14;
        aluno2.serie = "9 Ano EF II";

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Pedro Santos";
        aluno3.idade = 8;
        aluno3.serie = "2 Ano EF I";

        System.out.println("Detalhes dos ALunos:");
        aluno1.imprimirDetalhes();
        aluno2.imprimirDetalhes();
        aluno3.imprimirDetalhes();
        
    }
}
