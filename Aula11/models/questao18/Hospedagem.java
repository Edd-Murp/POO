package models.questao18;

public abstract class Hospedagem {
    protected final double valorDiaria;

    public Hospedagem(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public abstract double calcularValor(int dias);
}

