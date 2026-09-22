package models;

public class ContaDeEnergia {
    public String titular;
    public double consumo;

    public double calcularValor() {
        return consumo * 0.5;  
    }
}
