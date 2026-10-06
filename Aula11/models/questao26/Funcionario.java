package models.questao26;

public abstract class Funcionario {
    protected final String nome;
    protected final double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}

