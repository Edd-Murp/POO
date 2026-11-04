//Edu Dagnoni Mazureck
package models;

public class Acao implements Ativo{

    private int qtdCota;
    private double valorCota;
    private double dividendo;

    public Acao(int qtdCota, double valorCota, double dividendo) {
        setQtdCota(qtdCota);
        setValorCota(valorCota);
        setDividendo(dividendo);
    }

    @Override
    public double calcularRendimento() {
        return qtdCota * dividendo;
    }

    @Override
    public double calcularValorInvestido() {
       return qtdCota * valorCota;
    }



    public int getQtdCota() {
        return qtdCota;
    }

    public void setQtdCota(int qtdCota) {
        if (qtdCota <= 0) {
            throw new IllegalArgumentException("Valor para o campo qtdCota está incorreto");
        }
        this.qtdCota = qtdCota;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        if (valorCota <= 0) {
            throw new IllegalArgumentException("Valor para o campo qtdCota está incorreto");
        }
        this.valorCota = valorCota;
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        if (dividendo <= 0) {
            throw new IllegalArgumentException("Valor para o campo qtdCota está incorreto");
        }
        this.dividendo = dividendo;
    }


    
    
}
