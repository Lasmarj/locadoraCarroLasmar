package locadora.carro;

public class Motocicleta extends Veiculo{
    private int potencia;
    private String tipo;
    public Motocicleta(String placa, String cor, String modelo, String fabricante, int anoFabricacao, double valorDiaria, int situacao, int potencia, String tipo) {
        super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao);
        this.potencia = potencia;
        this.tipo = tipo;
    }
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "potencia=" + potencia +
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
