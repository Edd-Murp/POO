package models;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Funcionario> funcionarios;

    public Empresa(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double calcularCustoSalarios() {
        double custoTotal = 0.0;
        for (Funcionario funcionario : funcionarios) {
            custoTotal += funcionario.calcularSalario();
        }
        System.out.println("Custo total com salários: " + custoTotal);
        return custoTotal;
    }
}
