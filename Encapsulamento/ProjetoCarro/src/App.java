import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner dado = new Scanner(System.in);
        
        Carro carro1 = new Carro("Onix" ,"Chevrolet", "qsd-1234", 2019, "Branco");
        Carro carro2 = new Carro("Uno" ,"Fiat", "jbb-2342", 2013, "Azul Marinho");
        Carro carro3 = new Carro("Jetta" ,"Volkswagen", "avs-3233", 2023, "Preto");
        
        ArrayList<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(carro1);
        listaCarros.add(carro2);
        listaCarros.add(carro3);
        
        Cadastro cadastro = new Cadastro(listaCarros);

        boolean sair = false;
        while (!sair) {
            // Menu de opções
            System.out.println("\nEscolha uma opção:");
            System.out.println("1) Cadastrar um novo Carro");
            System.out.println("2) Remover um Carro da lista");
            System.out.println("3) Listar os Carros");
            System.out.println("4) Consultar um carro");
            System.out.println("5) Acelerar um carro");
            System.out.println("6) Frear um carro");
            System.out.println("7) Sair do programa");
    
            System.out.print("Insira uma opcao:");
            int opcao = dado.nextInt();
            dado.nextLine();
    

            switch (opcao) {
                case 1:
                    System.out.println("Informe os detalhes do novo carro:");
                    System.out.println("Modelo:");
                    String modeloNovo = dado.next();
                    System.out.println("Marca:");
                    String marcaNova = dado.next();
                    System.out.println("Ano:");
                    int anoNovo = dado.nextInt();
                    System.out.println("Placa:");
                    String placaNova = dado.next();
                    System.out.println("Cor:");
                    String corNova = dado.next();
                    System.out.println("Velocidade atual:");
                    double velNova = dado.nextDouble();
    
                    Carro novoCarro = new Carro(modeloNovo, marcaNova, placaNova, anoNovo, corNova);
                    novoCarro.setVel_atual(velNova);
                    cadastro.inserirCarro(novoCarro);
    
                    System.out.println("Carro adicionado com sucesso!");
                    break;
    
                case 2:
                    System.out.println("Informe a placa do carro que deseja remover:");
                    String placaRemover = dado.next();
                    cadastro.removerCarro(placaRemover);
                    break;
    
                case 3:
                    System.out.println("Lista de Carros:");
                    cadastro.listarCarros();
                    break;
    
                case 4:
                    System.out.println("Informe a placa do carro que deseja consultar:");
                    String placaProcurada = dado.next();
    
                    Carro carroConsulta = cadastro.consultarCarro(placaProcurada);

                    if (placaProcurada == null) {
                        System.out.println("Carro nao encontrado!");
                    } else {
                        System.out.println("Dados do carro:");
                        carroConsulta.exibirInfo();
                    }

                    
                    break;
                case 5:
                    System.out.println("Informe a Placa do Carro que deseja Acelerar:");
                    String placaAcelerada = dado.next();
                
                    Carro carroAcelerado = cadastro.consultarCarro(placaAcelerada);
                    double novaVelocidadeAcelerar = carroAcelerado.acelerar();
                    carroAcelerado.setVel_atual(novaVelocidadeAcelerar);
                
                    System.out.println("Novo velocidade do carro " + carroAcelerado.getModelo() + ": " + novaVelocidadeAcelerar + " km/h");
                    break;
    
                case 6:
                    System.out.println("Informe a Placa do Carro que deseja Freiar:");
                    String placaFreiada = dado.next();
                
                    Carro carroFreiado = cadastro.consultarCarro(placaFreiada);
                    double novaVelocidadeFreiar = carroFreiado.freiar();
                    carroFreiado.setVel_atual(novaVelocidadeFreiar);
                
                    System.out.println("Novo velocidade do carro " + carroFreiado.getModelo() + ": " + novaVelocidadeFreiar + " km/h");
                    break;
    
                case 7:
                    sair = true;
                    break;
    
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        System.out.println("Saindo...");
        
        dado.close();
    }
}
