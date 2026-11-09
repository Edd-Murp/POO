package Parte1.models;

public class Gerente extends Funcionarios{

    private double bonus;

    public Gerente(int matricula, String nome, double salario, double bonus) {
        super(matricula, nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Gerente [bonus=" + bonus + ", getBonus()=" + getBonus() + ", getMatricula()=" + getMatricula()
                + ", getNome()=" + getNome() + ", getSalario()=" + getSalario() + "]";
    }

    
    
}
