package models.questao19;

public abstract class Pedido {
    protected final int numero;
    protected final double valorProdutos;

    public Pedido(int numero, double valorProdutos) {
        this.numero = numero;
        this.valorProdutos = valorProdutos;
    }

    public abstract double calcularTotal();
}

