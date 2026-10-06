package models;

public abstract class FormaGeometrica {
    private String cor;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }

    public abstract double calcularArea();    
}
