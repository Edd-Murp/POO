package models.questao11;

public class ProfessorIntegral extends Professor {

    public ProfessorIntegral(String nome, double valorHora) {
        super(nome, valorHora);
    }

    @Override
    public double calcularSalario() {
        return valorHora * 160.0;
    }
}
