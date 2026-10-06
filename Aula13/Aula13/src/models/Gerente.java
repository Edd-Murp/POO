package models;

public class Gerente extends Funcionario {
    private double bonus;
    private double meta;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * bonus;
    }

    public double getMeta() {
        return meta;
    }

    public void definirMeta(double meta) {
        this.meta = meta;
    }
    
}
