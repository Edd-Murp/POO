package models;

public class Uber extends Transporte {
    private double distancia;
    private double valorPorKm;

    public Uber(double distancia, double valorPorKm) {
        this.distancia = distancia;
        this.valorPorKm = valorPorKm;
    }

    @Override
    public double calcularCusto() {
        return Math.pow(valorPorKm, distancia);
    }
    
}
