package models;

public class Taxi extends Transporte {
    private double distancia;
    private double tarifaBase;
    private double taxaPorKm;

    public Taxi(double distancia, double tarifaBase, double taxaPorKm) {
        this.distancia = distancia;
        this.tarifaBase = tarifaBase;
        this.taxaPorKm = taxaPorKm;
    }

    @Override
    public double calcularCusto() {
        return tarifaBase + (distancia * taxaPorKm);
    }
    
}
