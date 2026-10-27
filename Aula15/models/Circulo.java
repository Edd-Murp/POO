package models;

public class Circulo extends FormaGeometrica{
    
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Area = " + area);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.raio = raio;
    }

    
}
