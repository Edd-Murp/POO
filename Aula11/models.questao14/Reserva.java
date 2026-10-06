package models.questao14;

public abstract class Reserva {
    protected final String nomeCliente;
    protected final int quantidadeDias;

    public Reserva(String nomeCliente, int quantidadeDias) {
        this.nomeCliente = nomeCliente;
        this.quantidadeDias = quantidadeDias;
    }

    public abstract double calcularValor();
}

