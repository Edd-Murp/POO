package models.questao28;

public abstract class Viagem {
    protected final double distancia;
    protected final int quantidadePassageiros;

    public Viagem(double distancia, int quantidadePassageiros) {
        this.distancia = distancia;
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public abstract double calcularCusto();
}

