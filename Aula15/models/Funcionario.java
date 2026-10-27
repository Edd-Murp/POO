package models;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public void calcularPagamento(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws Excecao {
         if (salario <  0) {
            throw new Excecao("Valor invalido");
        }
        this.salario = salario;
    };

    
}
