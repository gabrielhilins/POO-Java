package GerenciadorDeTarefa;
public class Tarefa {
    private String descricao;
    private boolean concluida;
    private int prioridade;

    // Construtor
    Tarefa(String descricao, boolean concluida, int prioridade) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.prioridade = prioridade;
    }

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

      // Getters
      public String getDescricao() {
        return this.descricao;
      }
      public boolean getConcluida() {
        return this.concluida;
      }
      public int getPrioridade() {
        return this.prioridade;
      }

      // Setters
      public void setDescricao(String descricao) {
        this.descricao = descricao;
      }
      public void setConcluida(boolean concluida) {
        this.concluida = concluida;
      }
      public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
      }


}
