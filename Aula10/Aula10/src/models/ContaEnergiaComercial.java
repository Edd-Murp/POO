package models;

public class ContaEnergiaComercial extends ContaDeEnergia {

    public ContaEnergiaComercial(String titular, double consumo) {
        this.titular = titular;
        this.consumo = consumo;
    }

    @Override
    public double calcularValor() {
        return consumo * 0.75;
    }
    
}
