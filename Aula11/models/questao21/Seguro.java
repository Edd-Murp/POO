package models.questao21;

public abstract class Seguro {
    protected final String nomeSegurado;
    protected final double valorBem;

    public Seguro(String nomeSegurado, double valorBem) {
        this.nomeSegurado = nomeSegurado;
        this.valorBem = valorBem;
    }

    public abstract double calcularPremio();
}
