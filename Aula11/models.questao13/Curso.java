package models.questao13;

public abstract class Curso {
    protected final String nome;
    protected final double cargaHoraria;

    public Curso(String nome, double cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public abstract double calcularMensalidade();
}

