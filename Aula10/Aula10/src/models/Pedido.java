package models;

public class Pedido {
    private int numero;
    private double valorProdutos;
    private double valorFrete;

    public Pedido(int numero, double valorProdutos, double valorFrete) {
        this.numero = numero;
        this.valorProdutos = valorProdutos;
        this.valorFrete = valorFrete;
    }

    public double calcularTotal() {
        return valorProdutos + valorFrete;
    }
}
