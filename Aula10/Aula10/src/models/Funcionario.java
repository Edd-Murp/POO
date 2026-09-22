package models;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, double salario, String cpf, int idade) {
        super(nome, idade, cpf);
        this.salario = salario;
        System.out.println("Funcionario criado");
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularAumento(){
        return salario + (salario * 0.05);
    }
}
