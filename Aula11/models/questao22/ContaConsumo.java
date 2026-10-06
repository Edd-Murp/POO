package models.questao22;

public abstract class ContaConsumo {
    protected final String nomeCliente;
    protected final double consumo;

    public ContaConsumo(String nomeCliente, double consumo) {
        this.nomeCliente = nomeCliente;
        this.consumo = consumo;
    }

    public abstract double calcularValor();
}
