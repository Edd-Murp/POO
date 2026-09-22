package models;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario, null, 0);
        this.bonus = bonus;
        System.out.println("Gerente criado");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularSalarioTotal() {
        return getSalario() + bonus;
    }
    
    @Override 
    public double calcularAumento() {
        return getSalario() + (getSalario() * 0.10);
    }
}
