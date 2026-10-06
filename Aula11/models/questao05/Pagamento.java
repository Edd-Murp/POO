package models.questao05;

public abstract class Pagamento {
    protected final double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract double calcularValorFinal();
}
