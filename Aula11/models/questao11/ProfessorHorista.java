package models.questao11;

public class ProfessorHorista extends Professor {
    private final int horas;

    public ProfessorHorista(String nome, double valorHora, int horas) {
        super(nome, valorHora);
        this.horas = horas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horas;
    }
}
