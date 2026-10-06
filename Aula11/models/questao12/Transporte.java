package models.questao12;

public abstract class Transporte {
    protected final double distancia;

    public Transporte(double distancia) {
        this.distancia = distancia;
    }

    public abstract double calcularCusto();
}
