package models.questao29;

public class Analista extends Colaborador {
    public Analista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 1.10;
    }
}

