package models;

public class FuncionarioCLT extends Funcionario{

    @Override
    public void calcularPagamento() {
        System.out.println("Seu salario é essse: " + getSalario());
    }

}
