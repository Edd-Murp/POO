package models;

public class Gerente extends Funcionario {
    private double bonus;
    private boolean meta;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        if(meta) {
            return getSalarioBase() + bonus;
        }
        return getSalarioBase();
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

    public boolean getMeta() {
        return meta;
    }

    public void definirMeta(boolean meta) {
        this.meta = meta;
    }
    
}
