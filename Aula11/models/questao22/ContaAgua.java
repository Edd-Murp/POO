package models.questao22;

public class ContaAgua extends ContaConsumo {

    public ContaAgua(String nomeCliente, double consumo) {
        super(nomeCliente, consumo);
    }

    @Override
    public double calcularValor() {
        return consumo * 4.0;
    }
}
