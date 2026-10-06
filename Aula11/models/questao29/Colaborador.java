package models.questao29;

public abstract class Colaborador {
    protected final String nome;
    protected final double salarioBase;

    public Colaborador(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();
}

