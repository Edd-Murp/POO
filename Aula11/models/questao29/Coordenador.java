package models.questao29;

public class Coordenador extends Colaborador {
    public Coordenador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 1.20;
    }
}

