package models.questao04;

public abstract class Produto {
    protected final String nome;
    protected final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularPrecoFinal();
}
