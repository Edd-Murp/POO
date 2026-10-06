package models.questao22;

public class ContaEnergia extends ContaConsumo {

    public ContaEnergia(String nomeCliente, double consumo) {
        super(nomeCliente, consumo);
    }

    @Override
    public double calcularValor() {
        return consumo * 0.90;
    }
}

