package models;

public class Quadrado implements Calculavel {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcular() {
        return lado * lado;
    }
    
}
