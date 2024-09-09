package locadora.carro;

public abstract class Veiculo {

    protected String placa;
    protected String cor;
    protected String modelo;
    protected String fabricante;
    protected int anoFabricacao;
    protected double valorDiaria;
    protected int situacao;

    public Veiculo(String placa, String cor, String modelo, String fabricante, int anoFabricacao, double valorDiaria, int situacao) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.valorDiaria = valorDiaria;
        this.situacao = situacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public abstract String toString();
}
