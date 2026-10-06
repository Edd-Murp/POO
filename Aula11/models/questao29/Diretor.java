package models.questao29;

public class Diretor extends Colaborador {
    public Diretor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 1.30;
    }
}

