package models;

public abstract class Veiculo{
    private String modelo;
    private double valor;

    public Veiculo(String modelo, double valor) {
        this.modelo = modelo;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValor() {
        return valor;
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }
    
    public abstract double calcularImposto();
}
