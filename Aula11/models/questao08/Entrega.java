package models.questao08;

public abstract class Entrega {
    protected final double distancia;
    protected final double peso;

    public Entrega(double distancia, double peso) {
        this.distancia = distancia;
        this.peso = peso;
    }

    public abstract double calcularFrete();
}
