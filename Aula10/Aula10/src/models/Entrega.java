package models;

public class Entrega {
    private double distanciaKm;

    public Entrega(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public double calcularFrete(){
        return distanciaKm * 2.0;
    }
}
