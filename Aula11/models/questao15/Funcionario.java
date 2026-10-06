package models.questao15;

public abstract class Funcionario {
    protected final String nome;
    protected final double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularBonus();

    public double calcularSalarioFinal() {
        return salarioBase + calcularBonus();
    }
}
