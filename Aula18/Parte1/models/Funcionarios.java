package Parte1.models;

public class Funcionarios {
    private int matricula;
    private String nome;
    private double salario;
    
    public Funcionarios(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public boolean equals(Object obj) {
        Funcionarios outro = (Funcionarios) obj;
        if (outro.getMatricula() == this.matricula) {
            return true;
        }else{
            return false;
        }
    }

    
    
}
