package models;

public abstract class Pagamento {
    private double valor;

    public abstract double calcularValorFinal();
}