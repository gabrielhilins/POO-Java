public class AtividadeFisica {
    String tipoDeExercicio;
    int duracao;
    int caloriasQueimadas;

    // Construtor
    public AtividadeFisica(String tipoDeExercicio, int duracao) {
        this.tipoDeExercicio = tipoDeExercicio;
        this.duracao = duracao;
        this.caloriasQueimadas = caloriaPorExercicio(tipoDeExercicio);
    }

    void exibirAtividade() {
        System.out.println("Tipo de Exercício: " + tipoDeExercicio);
        System.out.println("Duração (Em min): " + duracao + " minutos");
        System.out.println("Calorias Queimadas: " + caloriasQueimadas);
    }

    void registrarAtividade(String tipoDeExercicio, int duracao) {
        // Método para registrar uma nova atividade física e atualizar as informações
    
        this.tipoDeExercicio += tipoDeExercicio;
        // Adiciona a duração fornecida ao total de duração da atividade atual
        this.duracao += duracao;
    
        // Calcula as calorias queimadas com base no tipo de exercício e na nova duração
        this.caloriasQueimadas = caloriaPorExercicio(this.tipoDeExercicio) * this.duracao;
    
        // Imprime uma mensagem indicando que a atividade foi registrada com sucesso
        System.out.println("Atividade registrada com sucesso!");
    
        // Exibe as informações atualizadas da atividade
        exibirAtividade();
    }
    

    String alterarTipoDeAtividade(String novoTipo) {
        tipoDeExercicio = novoTipo;
        this.caloriasQueimadas = caloriaPorExercicio(novoTipo) * this.duracao;
        return tipoDeExercicio;
    }

    int caloriaPorExercicio(String tipoDeExercicio) {
        int calorias;
        switch (tipoDeExercicio) {
            case "Academia":
                calorias = 300;
                break;
            case "Corrida":
                calorias = 500;
                break;
            case "Crossfit":
                calorias = 650;
                break;
            default:
                calorias = 0;
                break;
        }
        return calorias;
    }

    void compararCalorias(AtividadeFisica outraAtividade) {
        // Método para comparar as calorias queimadas entre duas atividades físicas
    
        // Verifica se as calorias queimadas pela atividade atual são maiores do que as calorias queimadas pela outra atividade
        if (this.caloriasQueimadas > outraAtividade.caloriasQueimadas) {
            // Se sim, imprime uma mensagem indicando que a atividade atual queimou mais calorias do que a outra
            System.out.println("Esta atividade queimou mais calorias do que a outra.");
        } 
        // Verifica se as calorias queimadas pela atividade atual são menores do que as calorias queimadas pela outra atividade
        else if (this.caloriasQueimadas < outraAtividade.caloriasQueimadas) {
            // Se sim, imprime uma mensagem indicando que a atividade atual queimou menos calorias do que a outra
            System.out.println("Esta atividade queimou menos calorias do que a outra.");
        } 
        // Se nenhuma das condições anteriores for verdadeira, significa que as calorias queimadas pelas duas atividades são iguais
        else {
            // Nesse caso, imprime uma mensagem indicando que as duas atividades queimaram a mesma quantidade de calorias
            System.out.println("Ambas as atividades queimaram a mesma quantidade de calorias.");
        }
    }
    
}
