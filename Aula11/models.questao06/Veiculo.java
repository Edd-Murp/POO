package models.questao06;

public abstract class Veiculo {
    protected final String modelo;
    protected final double valor;

    public Veiculo(String modelo, double valor) {
        this.modelo = modelo;
        this.valor = valor;
    }

    public abstract double calcularImposto();
}

