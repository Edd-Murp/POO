package models;

public class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(double preco, double valorAdicional) {
        super(preco);
        this.valorAdicional = valorAdicional;
    }

    public double calcularValorTotal() {
        return super.getPreco() + valorAdicional;
    }
    
}
