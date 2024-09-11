package locadora.carro;

public class VeiculoDePasseio extends Veiculo{

    private int numeroPortas;
    private boolean possuiArCondicionado;
    private boolean possuiDirecao;
    public VeiculoDePasseio(String placa, String cor, String modelo, String fabricante, int anoFabricacao, double valorDiaria, int situacao, int numeroPortas, boolean possuiArCondicionado, boolean possuiDirecao) {
        super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao);
        this.numeroPortas = numeroPortas;
        this.possuiArCondicionado = possuiArCondicionado;
        this.possuiDirecao = possuiDirecao;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public boolean isPossuiArCondicionado() {
        return possuiArCondicionado;
    }

    public void setPossuiArCondicionado(boolean possuiArCondicionado) {
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public boolean isPossuiDirecao() {
        return possuiDirecao;
    }

    public void setPossuiDirecao(boolean possuiDirecao) {
        this.possuiDirecao = possuiDirecao;
    }

    @Override
    public String toString() {
        return "Veiculo De Passeio{" +
                "Quantidade de Portas= '" + numeroPortas + '\'' +
                ", Ar Condicionado= '" + possuiArCondicionado + '\'' +
                ", Direcao= '" + possuiDirecao + '\'' +
                ", Placa= '" + placa + '\'' +
                ", Cor= '" + cor + '\'' +
                ", Modelo= '" + modelo + '\'' +
                ", Fabricante= '" + fabricante + '\'' +
                ", Ano de Fabricacao= '" + anoFabricacao + '\'' +
                ", Valor da Diaria= '" + valorDiaria + '\'' +
                ", 'Situacao= '" + situacao +'\'' +
                '}';
    }
}
