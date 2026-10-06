package models.questao11;

public abstract class Professor {
    protected final String nome;
    protected final double valorHora;

    public Professor(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public abstract double calcularSalario();
}

