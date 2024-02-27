public class Tarefa {
    String descricao;
    boolean concluida;
    int prioridade;

    void exibirTarefa() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Situação: " + (concluida ? "Concluída" : "Pendente")); 
        // se o atributo concluida for verdadeira (?), aparecerá a mensagem "Concluída"
        // se o atributo concluida for false (else = :) aparecerá a mensagem "Pendente"
        // O operador ternário ? : é uma forma compacta de expressar uma operação condicional.
        System.out.println("Prioridade: " + prioridade);
    }

    boolean concluirTarefa() {
        if (!concluida) { // se a tarefa nao tiver sido concluida antes...
            concluida = true;
            return true; // Tarefa concluída com sucesso
        }
        return false; // Tarefa já estava concluída
    }

    boolean resetarTarefa() {
        if (concluida) { // se a tarefa ja foi concluida antes...
            concluida = false;
            return true; // Tarefa resetada com sucesso
        }
        return false; // Tarefa já estava pendente
    }

    int mudarPrioridade(int novaPrioridade) {
        if (prioridade != novaPrioridade) { // se a prioridade for diferente da nova prioridade, a alteração é feita
            prioridade = novaPrioridade;
        } else { // caso a prioridade seja a mesma, ele retorna a mesma prioridade do início sem alterações
            return prioridade;
        }
        
        return prioridade;
    }


}
