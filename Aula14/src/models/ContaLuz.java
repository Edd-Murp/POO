package models;

public class ContaLuz implements Pagavel {

    private double kwhHora;
    private double precoKwhHora;

    public ContaLuz(double kwhHora, double precoKwhHora) {
        this.kwhHora = kwhHora;
        this.precoKwhHora = precoKwhHora;
    }

    @Override
    public double calcularValorPagar() {
        return kwhHora * precoKwhHora;
    }   
    
}
