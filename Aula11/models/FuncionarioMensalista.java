package models;

public class FuncionarioMensalista extends Funcionario {

    public FuncionarioMensalista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase();
    }
    
}
