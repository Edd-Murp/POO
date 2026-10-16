package models;

public class Gerente extends Funcionario{

    private double percentualBonus;

    public Gerente(String nome, double salario, double percentualBonus) {
        super(nome, "GERENTE", salario);
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularBonus() {
        return super.getSalario() * (percentualBonus / 100);
    }

    public String obterIdentificacao() {
        return "Salário: " + Double.toString(super.getSalario()) + " - " + super.getNome();
    }
    
}
