package models;

public class Onibus extends Transporte {
    private double distancia;

    public Onibus(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double calcularCusto() {
        return 12;
    }
    
}
