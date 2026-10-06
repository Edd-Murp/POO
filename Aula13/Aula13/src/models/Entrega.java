package models;

public abstract class Entrega {
    private double peso;
    private double distancia;

    public abstract double calcularFrete();
}
