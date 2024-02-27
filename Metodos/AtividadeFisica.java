public class AtividadeFisica {
    String tipoDeExercicio;
    int duracao, caloriasQueimadas;

    void exibirAtividade() {
        System.out.println("Tipo de Exercício: " + tipoDeExercicio);
        System.out.println("Duração (Em min): " + duracao + " minutos");
    }

    // int registrarAtividade(int duracao) {} fazer depois

    String alterarTipoDeAtividade(String novoTipo) {
        tipoDeExercicio = novoTipo;
        return tipoDeExercicio;
    }

    String caloriaPorExercicio(String tipoDeExercicio) {
        String mensagem;
        if (tipoDeExercicio.equals("Academia")) {
            caloriasQueimadas = 300;
            mensagem = "Calorias queimadas na academia: " + caloriasQueimadas;
        } else if (tipoDeExercicio.equals("Corrida")) {
            caloriasQueimadas = 500;
            mensagem = "Calorias queimadas durante a corrida: " + caloriasQueimadas;
        } else if (tipoDeExercicio.equals("Crossfit")) {
            caloriasQueimadas = 650;
            mensagem = "Calorias queimadas durante o crossfit: " + caloriasQueimadas;
        } else {
            mensagem = "Tipo de exercício não reconhecido.";
        }
        return mensagem;
    }
    

    // compararCalorias(AtividadeFisica outraAtividade) {} fazer depois
}
