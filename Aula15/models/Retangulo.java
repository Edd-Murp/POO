package models;

public class Retangulo extends FormaGeometrica{

    private double lado;

    public Retangulo(double lado) {
        setLado(lado);
    }

    @Override
    public void calcularArea() {
       System.out.println(lado * lado); 
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.lado = lado;
    }

    
}
