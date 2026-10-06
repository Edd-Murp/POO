package models.questao22;

public class ContaGas extends ContaConsumo {

    public ContaGas(String nomeCliente, double consumo) {
        super(nomeCliente, consumo);
    }

    @Override
    public double calcularValor() {
        return consumo * 7.0;
    }
}

