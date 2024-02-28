public class SessaoCinema {
    String filme;
    String horario;
    int capacidadeTotal;
    int ingressosVendidos;

    // Construtor
    SessaoCinema(String filme, String horario, int capacidadeTotal, int ingressosVendidos) {
        this.filme = filme;
        this.horario = horario;
        this.capacidadeTotal = capacidadeTotal;
        this.ingressosVendidos = ingressosVendidos;
    }

    void exibirInfoSessao() {
        System.out.println("Filme: " + filme);
        System.out.println("Horario:" + horario);
        System.out.println("Capacidade Total: " + capacidadeTotal + " lugares");
        System.out.println("Ingressos Já Vendidos: " + ingressosVendidos + " ingressos");
    }

    int venderIngresso(int ingresso) {
        if (ingressosVendidos <= capacidadeTotal) {
            ingressosVendidos += ingresso;
        } else {
            System.out.println("Número de ingressos vendidos maior que a capacidade total da sala!");
            return 0;
        }
        return ingressosVendidos;
    }

    int cancelarIngresso(int ingresso) {
        capacidadeTotal -= ingresso;
        ingressosVendidos -= ingresso;
        return ingressosVendidos;
    }

    String alterarHorario(String novoHorario) {
        horario = novoHorario;
        return horario;
    }
    
    }
