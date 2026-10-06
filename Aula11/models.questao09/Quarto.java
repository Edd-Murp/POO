package models.questao09;

public abstract class Quarto {
    protected final int numero;
    protected final double valorDiaria;

    public Quarto(int numero, double valorDiaria) {
        this.numero = numero;
        this.valorDiaria = valorDiaria;
    }

    public abstract double calcularHospedagem(int dias);
}

