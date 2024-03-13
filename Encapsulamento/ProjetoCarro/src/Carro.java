public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    private int ano;
    private String cor;
    private double vel_atual;

    // Construtores
    public Carro(String modelo, String marca, String placa, int ano, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
    }

    public Carro() {}

    // Getters e Setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVel_atual() {
        return vel_atual;
    }

    public void setVel_atual(double vel_atual) {
        this.vel_atual = vel_atual;
    }

    // Métodos

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + vel_atual + " km/h");
        System.out.println();
    }

    public double acelerar() {
        double aceleracao = 20;
        if (vel_atual >= 0) {
            vel_atual += aceleracao;
        } else {
            System.out.println("Velocidade menor que 0. Tente novamente");
        }
        return vel_atual;
    }

    public double freiar() {
        double desaceleracao = 20;
        if (vel_atual >= 0) {
            vel_atual -= desaceleracao;
        } else {
            System.out.println("Velocidade menor que 0. Tente novamente");
        }
        return vel_atual;
    }
}
