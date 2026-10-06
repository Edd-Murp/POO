package models;

public class Estagiario extends Funcionario {
    private double bolsaAuxilio;

    public Estagiario(String nome, double salarioBase, double bolsaAuxilio) {
        super(nome, salarioBase);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bolsaAuxilio;
    }

    @Override
    public double calcularBonus() {
        return 0;
    }
    
}
