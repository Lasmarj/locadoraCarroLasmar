package locadora.entrada;

import locadora.cadastro.Loja;
import locadora.carro.Motocicleta;
import locadora.carro.Veiculo;
import locadora.carro.VeiculoDePasseio;
import locadora.carro.VeiculoUilitario;

import java.util.List;
import java.util.Scanner;

public class EntradaLocadora {

    public static void main(String[] args) {
        Loja loja = new Loja();
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        while(opcao !=9){
            System.out.println("-----------------------------------------------");
            System.out.println("------------- Locadora Lasmar Car -------------");
            System.out.println("-----------------------------------------------");
            System.out.println("------- Escolaha uma das Opções Abaixo --------");
            System.out.println("|   1- Cadastrar Veiculo                      |");
            System.out.println("|   2- Consultar Veiculo (Placa)              |");
            System.out.println("|   3- Vender Veículo (Placa)                 |");
            System.out.println("|   4- Pesquisar Veículo (Modelo/Marca)       |");
            System.out.println("|   5- Pesquisar Veículos (Ano/Valor)         |");
            System.out.println("|   6- Listar Veículos Disponíveis            |");
            System.out.println("|   7- Listar Veículos Vendidos               |");
            System.out.println("|   8- Informações da Loja Lasmar Car         |");
            System.out.println("|   9- Sair                                   |");
            System.out.println("-----------------------------------------------");
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    cadastrarVeiculo(loja, entrada);
                    break;
                case 2:
                    consultarVeiculoPlaca(loja, entrada);
                    break;
                case 3:
                    venderVeiculoPlaca(loja, entrada);
                    break;
                case 4:
                    pesquisarVeiculoMarcaModelo(loja, entrada);
                    break;
                case 5:
                    pesquisarVeiculoAnoValor(loja, entrada);
                    break;
                case 6:
                    listarVeiculosDisponivel(loja);
                    break;
                case 7:
                    listarVeiculosVendidos(loja);
                    break;
                //case 8:
                //    informacoesDaLoja();
                //    break;
                case 9:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Operação inválida!!!");
            }
        }
    }

    private static void cadastrarVeiculo(Loja loja, Scanner entrada) {
        System.out.println("Informe o tipo de veículo: (1- Passeio, 2- Utilitário, 3-Motocicleta");
        int tipoVeiculo = entrada.nextInt();
        System.out.println("\n");

        System.out.println("Informe a Placa: ");
        String placa = entrada.next().toUpperCase();
        System.out.println("Informe a Cor: ");
        String cor = entrada.next().toUpperCase();
        System.out.println("Informe o Modelo: ");
        String modelo = entrada.next().toUpperCase();
        System.out.println("Informe o Fabricante: ");
        String fabricante = entrada.next().toUpperCase();
        System.out.println("Informe o Ano de Veículo (Ex: 2021): ");
        int anoFabricacao = entrada.nextInt();
        System.out.println("Informe o valor da Diária: ");
        double valorDiaria = entrada.nextDouble();
        System.out.println("\n");
        System.out.println("Informe a situação do veículo: (1- Alugado, 2- Manutenção, 3- Disponível ");
        int situacao = entrada.nextInt();

        if(tipoVeiculo == 1){
            System.out.println("Informe o número de portas: ");
            int numeroPortas = entrada.nextInt();
            System.out.println("Possui Ar Condicionado? (true/false): ");
            boolean possuiArCondicionado = entrada.nextBoolean();
            System.out.println("Possui Direção Hidraulica? (true/false): ");
            boolean possuiDirecao = entrada.nextBoolean();

            //Veiculo veiculoDePasseio = new VeiculoDePasseio(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao, numeroPortas, possuiArCondicionado, possuiDirecao);
            VeiculoDePasseio veiculoDePasseio = new VeiculoDePasseio(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao, numeroPortas, possuiArCondicionado, possuiDirecao);

            if(!loja.placaJaCadastrada(placa)){
                loja.cadastrarVeiculo(veiculoDePasseio);
                System.out.println("Cadastrado efetuado com sucesso!! ");
                System.out.println(veiculoDePasseio);
            }else{
                System.out.println("Placa existente!!!");
            }

        } else if (tipoVeiculo == 2) {
            System.out.println("Tipo de tração: ");
            String tracao = entrada.next();
            System.out.println("Possui Ar Condicionado? (true/false): ");
            boolean possuiArCondicionado = entrada.nextBoolean();
            System.out.println("Diâmetro da roda: ");
            int diametroRoda = entrada.nextInt();
            System.out.println("\n");
            System.out.println("Tipo (Urbano / Off-Road: ");
            String tipo = entrada.next();

            Veiculo veiculoUltilitario = new VeiculoUilitario(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao, tracao, possuiArCondicionado, diametroRoda, tipo);

            if(loja.placaJaCadastrada(placa)){
                loja.cadastrarVeiculo(veiculoUltilitario) ;
            }
            System.out.println("Placa existente!!!");
        } else if (tipoVeiculo == 3) {
            System.out.println("Potência: ");
            int potencia = entrada.nextInt();
            System.out.println("Tipo (Esportiva / Urbana / Off-Road: ");
            String tipo = entrada.next();

            Veiculo veiculoMotocicleta = new Motocicleta(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao, potencia, tipo);
            if(loja.placaJaCadastrada(placa)){
                loja.cadastrarVeiculo(veiculoMotocicleta) ;
            }else{
                System.out.println("Placa existente!!!");
            }
        }else{
            System.out.println("Opção inválida!!!");
        }
    }

    public static void consultarVeiculoPlaca(Loja loja, Scanner entrada) {
        System.out.println("Informe a Placa: ");
        String placa = entrada.next().toUpperCase();

        Veiculo veiculo = loja.consultarVeiculoPlaca(placa);

        if(veiculo != null){
            System.out.println(veiculo);
        }else{
            System.out.println("Placa não cadastrada!!!");
        }
    }

    public static void venderVeiculoPlaca(Loja loja, Scanner entrada) {
        System.out.println("Informe a Placa: ");
        String placa = entrada.next().toUpperCase();
        loja.venderVeiculoPorPlaca(placa);
    }

    public static void pesquisarVeiculoMarcaModelo(Loja loja, Scanner entrada) {
        System.out.println("Informe a Modelo: ");
        String modelo = entrada.next().toUpperCase();
        System.out.println("Informe a Marca: ");
        String marca = entrada.next().toUpperCase();

        var veiculos = loja.pesquisarVeiculo(modelo, marca);
        if(!veiculos.isEmpty()){
            System.out.println(veiculos.toString());
        }else{
            System.out.println("Veículo não encontrado!!!");
        }
    }

    public static void pesquisarVeiculoAnoValor(Loja loja, Scanner entrada) {
        System.out.println("Informe o Ano: ");
        int ano = entrada.nextInt();
        System.out.println("Informe o Valor: ");
        double valor = entrada.nextDouble();

        var veiculos = loja.pesquisarVeiculo(ano, valor);
        if(!veiculos.isEmpty()){
            System.out.println(veiculos.toString());
        }else{
            System.out.println("Veículo não encontrado!!!");
        }
    }

    public static void listarVeiculosDisponivel(Loja loja){
        loja.veiculosDisponiveis();
    }

    public static void listarVeiculosVendidos(Loja loja){
        loja.veiculosVendidos();
    }

}



