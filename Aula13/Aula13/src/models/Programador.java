package models;

import java.util.ArrayList;

public class Programador extends Funcionario {
    private ArrayList<String> linguagens;


    public Programador(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagens = new ArrayList<>();
        this.linguagens.add(linguagem);
    }

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }

    public void adicionarLinguagem(String linguagem) {
        this.linguagens.add(linguagem);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (linguagens.size() * 100);
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.1;
    }
    
}
