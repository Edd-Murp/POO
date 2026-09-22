package models;

public class VeiculoLocacao {
    private String placa;
    private String modelo;
    private double valorDiaria;

    public VeiculoLocacao(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public VeiculoLocacao() {
        this("", "", 0.0);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double calcularValorLocacao(int dias) {
        return dias * valorDiaria;
    }
}
