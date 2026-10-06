package models.questao17;

public class Vendedor extends Funcionario {
    private final double salarioBase;

    public Vendedor(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    public double calcularSalario(double bonusExtra) {
        return calcularSalario() + bonusExtra;
    }
}

