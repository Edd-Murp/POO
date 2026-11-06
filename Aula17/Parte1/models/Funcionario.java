package Parte1.models;

import java.io.Serializable;

public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;

    private int matricula;
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;

    public Funcionario(int matricula, String nome, String cpf, String cargo, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
