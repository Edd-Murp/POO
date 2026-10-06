package models;

public class Desenvolvedor extends Funcionario {
    private double bonus;

    public Desenvolvedor(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * bonus);
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * bonus;
    }
    
}
