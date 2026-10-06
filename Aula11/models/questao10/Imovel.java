package models.questao10;

public abstract class Imovel {
    protected final String endereco;
    protected final double valorBase;

    public Imovel(String endereco, double valorBase) {
        this.endereco = endereco;
        this.valorBase = valorBase;
    }

    public abstract double calcularValorVenda();
}
