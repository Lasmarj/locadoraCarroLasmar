package locadora.cadastro;

import locadora.carro.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Veiculo> veiculos;
    private List<Veiculo> vendas;

    public Loja() {
        this.veiculos = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public boolean placaJaCadastrada(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    public List<Veiculo> consultarVeiculoPlaca(String placa) {
        List<Veiculo> veiculosPlacas = new ArrayList<>();
        if (!veiculos.isEmpty()) {
            for (Veiculo veiculo : veiculos) {
                if (veiculo.getPlaca().equals(placa)) {
                    veiculosPlacas.add(veiculo);
                    return veiculosPlacas;
                }
            }
        }
        return veiculosPlacas;
    }
}