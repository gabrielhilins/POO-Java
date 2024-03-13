import java.util.ArrayList;

public class Cadastro {
    public static ArrayList<Carro> lista = new ArrayList<>();

    public Cadastro(ArrayList<Carro> lista) {
        this.lista = lista;
    }

    public Carro consultarCarro(String placa) {
        for (int i = 0; i < lista.size(); i++) {
            if (placa.equals(lista.get(i).getPlaca())) {
                return lista.get(i);
            }
        }
        
        return null;
    }
    
    public void inserirCarro(Carro carro) {
        lista.add(carro);
    }

    public void removerCarro(String placa) {
        for (int i = 0; i < lista.size(); i++) {
            if (placa.equals(lista.get(i).getPlaca())) {
                lista.remove(i);
                System.out.println("Carro da placa " + placa + " removido com sucesso!");
                return;
            }
        }
        System.out.println("Carro com a placa " + placa + " não encontrado!");
    }

    public void listarCarros() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).exibirInfo();
        }
    }
}
