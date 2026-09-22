package models;

public class Frete {
    private double peso;
    private double distancia;

    public Frete(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public double calcularValor(){
        return (peso * 0.5) + (distancia * 0.1);
    }
}
