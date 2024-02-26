public class MainVeiculos {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.placa = "ABE-1211";
        veiculo1.ano = 2011;
        veiculo1.marca = "Fiat";

        Veiculo veiculo2 = new Veiculo();
        veiculo2.placa = "LKD-3343";
        veiculo2.ano = 2023;
        veiculo2.marca = "Mitsubishi";

        Veiculo veiculo3 = new Veiculo();
        veiculo3.placa = "PED-2390";
        veiculo3.ano = 2017;
        veiculo3.marca = "Chevrolet";
        
        System.out.println("Detalhes dos veiculos:");
        veiculo1.imprimirDetalhes();
        veiculo2.imprimirDetalhes();
        veiculo3.imprimirDetalhes();

    }
}
