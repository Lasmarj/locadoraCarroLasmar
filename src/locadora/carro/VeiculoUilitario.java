package locadora.carro;

public class VeiculoUilitario extends Veiculo {
    private String tipoTracao;
    private boolean possuiTetoSolar;
    private int diametroAro;
    private String tipo;

    public VeiculoUilitario(String placa, String cor, String modelo, String fabricante, int anoFabricacao, double valorDiaria, int situacao, String tipoTracao, boolean possuiTetoSolar, int diametroAro, String tipo) {
        super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao);
        this.tipoTracao = tipoTracao;
        this.possuiTetoSolar = possuiTetoSolar;
        this.diametroAro = diametroAro;
        this.tipo = tipo;
    }

    public String getTipoTracao() {
        return tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    public boolean isPossuiTetoSolar() {
        return possuiTetoSolar;
    }

    public void setPossuiTetoSolar(boolean possuiTetoSolar) {
        this.possuiTetoSolar = possuiTetoSolar;
    }

    public int getDiametroAro() {
        return diametroAro;
    }

    public void setDiametroAro(int diametroAro) {
        this.diametroAro = diametroAro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "VeiculoUilitario{" +
                "tipoTracao='" + tipoTracao + '\'' +
                ", possuiTetoSolar=" + possuiTetoSolar +
                ", diametroAro=" + diametroAro +
                ", tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", valorDiaria=" + valorDiaria +
                ", situacao=" + situacao +
                '}';
    }
}
