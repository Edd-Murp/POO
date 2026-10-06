package models;

public class Consultor extends Funcionario {
    private double taxaHora;

    public Consultor(String nome, double salarioBase, double taxaHora) {
        super(nome, salarioBase);
        this.taxaHora = taxaHora;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (taxaHora * 160); // Assuming 160 hours per month
    }

    public double getTaxaHora() {
        return taxaHora;
    }

    public void setTaxaHora(double taxaHora) {
        this.taxaHora = taxaHora;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.1;
    }
}