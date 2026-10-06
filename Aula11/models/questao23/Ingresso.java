package models.questao23;

public abstract class Ingresso {
    protected final String nomeEvento;
    protected final double valorBase;

    public Ingresso(String nomeEvento, double valorBase) {
        this.nomeEvento = nomeEvento;
        this.valorBase = valorBase;
    }

    public abstract double calcularValor();
}
