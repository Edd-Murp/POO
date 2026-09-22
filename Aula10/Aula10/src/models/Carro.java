package models;

public class Carro extends VeiculoMotorizado {
    private int quantidadePortas;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, double potenciaMotor, String tipoCombustivel, int quantidadePortas) {
        super(marca, modelo, ano, potenciaMotor, tipoCombustivel);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirQuantidadePortas() {
        super.exibirDados();
        super.exibirEspecificacoes();
        System.out.println("Quantidade de Portas: " + quantidadePortas);
    }
}
