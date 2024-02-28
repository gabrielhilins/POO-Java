public class Curso {
    String nome;
    String categoria;
    int cargaHoraria;
    int numeroDeAlunosInscritos;

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
}
