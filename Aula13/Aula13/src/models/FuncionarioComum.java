package models;

public class FuncionarioComum extends Funcionario {
    public FuncionarioComum(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase();
    }
    
}
