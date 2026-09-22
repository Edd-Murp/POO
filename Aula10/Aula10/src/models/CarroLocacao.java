package models;

public class CarroLocacao extends VeiculoLocacao {
    private int quantidadePortas;

    public CarroLocacao(String placa, String modelo, double valorDiaria, int quantidadePortas) {
        super(placa, modelo, valorDiaria);
        this.quantidadePortas = quantidadePortas;
    }

    public CarroLocacao() {
        super();
        this.quantidadePortas = 0;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularValorLocacao(int dias) {
        double valor = super.calcularValorLocacao(dias);
        if (dias > 5) {
            valor *= 0.90;
        }
        return valor;
    }
}
