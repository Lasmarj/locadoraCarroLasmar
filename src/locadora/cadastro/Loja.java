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

    public Veiculo consultarVeiculoPlaca(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    public void venderVeiculoPorPlaca(String placa) {
        Veiculo veiculo = consultarVeiculoPlaca(placa);
        if(veiculo != null){
            for (Veiculo veiculo1 : veiculos) {
                if(veiculo1.getSituacao() == 3) {
                    vendas.add(veiculo1);
                    veiculos.remove(veiculo1);
                    System.out.println("Veículo vendido com sucesso!!");
                }else{
                    System.out.println("Veículo não encontra disponivel no momento!!!");
                }
            }
        }else{
            System.out.println("Veículo não encontrado no sistema!!!");
        }
    }

    public List<Veiculo> pesquisarVeiculo(String modelo, String marca) {
        List<Veiculo> resultado = new ArrayList<>();
        for(Veiculo veiculo : veiculos){
            if(veiculo.getModelo().equals(modelo) && veiculo.getFabricante().equals(marca)){
                resultado.add(veiculo);
                return resultado;
            }
        }
        resultado = List.of();
        return resultado;
    }

    public List<Veiculo> pesquisarVeiculo(int ano, double valroDiaria) {
        List<Veiculo> resultado = new ArrayList<>();
        for(Veiculo veiculo : veiculos){
            if(veiculo.getAnoFabricacao() == ano && veiculo.getValorDiaria() == valroDiaria){
                resultado.add(veiculo);
                return resultado;
            }
        }
        resultado = List.of();
        return resultado;
    }

    public void veiculosDisponiveis(){
        for(Veiculo veiculo : veiculos){
            if(veiculo.getSituacao() == 3){
                System.out.println(veiculo.toString());
            }
        }
        System.out.println("No momento não temos carro dispoíveis!!!");
    }

    public void veiculosVendidos(){
        for(Veiculo veiculo : vendas){
            System.out.println(veiculo.toString());
        }
        System.out.println("No momento não temos carro dispoíveis!!!");
    }
}