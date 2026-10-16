package models;

public class ContaAgua implements Pagavel {

    private double metrosCubicos;
    private double precoMetroCubico;

    public ContaAgua(double metrosCubicos, double precoMetroCubico) {
        this.metrosCubicos = metrosCubicos;
        this.precoMetroCubico = precoMetroCubico;
    }

    @Override
    public double calcularValorPagar() {
        return metrosCubicos * precoMetroCubico;
    }
    
}
