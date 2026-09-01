package models;

import java.util.ArrayList;

public class Funcionario {
    private int matricula;
    private String nome;
    private double salario;
    private Departamento departamento;
    private Funcionario gerente;
    private ArrayList<Funcionario> funcionarios;
}
