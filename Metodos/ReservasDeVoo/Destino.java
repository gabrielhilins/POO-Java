package ReservasDeVoo;

public class Destino {
    private String pais;
    private String estado;
    private String cidade;

    public Destino(String pais, String estado, String cidade) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
    }

    public String getPais() {
        return this.pais;
    }
    public String getEstado() {
        return this.estado;
    }
    public String getCidade() {
        return this.cidade;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
