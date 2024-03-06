package GerenciadorDeCursos;
public class Curso {
    private String nome;
    private String categoria;
    private int cargaHoraria;
    private int numeroDeAlunosInscritos;

    // Construtor
    Curso(String nome, String categoria, int cargaHoraria, int numeroDeAlunosInscritos) {
        this.nome = nome;
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
        this.numeroDeAlunosInscritos = numeroDeAlunosInscritos;
    }

    void exibirInformacoes() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Número de Alunos Inscritos: " + numeroDeAlunosInscritos + " alunos");
        System.out.println("Categoria: " + categoria);
    }
    void exibirInformacoesNovosAlunos() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Número de Alunos Inscritos após o aumento: " + numeroDeAlunosInscritos + " alunos");
        System.out.println("Categoria: " + categoria);
    }
    void exibirInformacoesAlunosCancelados() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Número de Alunos Inscritos após o cancelamento: " + numeroDeAlunosInscritos + " alunos");
        System.out.println("Categoria: " + categoria);
    }
    void exibirInformacoesNovaCargaHoraria() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Carga Horária atualizada: " + cargaHoraria + " horas");
        System.out.println("Número de Alunos Inscritos: " + numeroDeAlunosInscritos + " alunos");
        System.out.println("Categoria: " + categoria);
    }

    int aumentaAlunos(int maisAlunos) {
        numeroDeAlunosInscritos += maisAlunos;
        return numeroDeAlunosInscritos;
    }

    int cancelarInscricao(int menosAlunos) {
        if (numeroDeAlunosInscritos > 0 && numeroDeAlunosInscritos > menosAlunos) {
            numeroDeAlunosInscritos -= menosAlunos;
            return numeroDeAlunosInscritos;
        } else {
            System.out.println("\nQuantidade de alunos inválida para Cancelar Inscrição!");
            return numeroDeAlunosInscritos;
        }
    }

    int atualizarCargaHoraria(int novaCargaHoraria) {
        cargaHoraria = novaCargaHoraria;
        return cargaHoraria;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public int getCargaHoraria() {
        return this.cargaHoraria;
    }
    public int getNumeroDeAlunosInscritos() {
        return this.numeroDeAlunosInscritos;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setNumeroDeAlunosInscritos(int numeroDeAlunosInscritos) {
        this.numeroDeAlunosInscritos = numeroDeAlunosInscritos;
    }
}
