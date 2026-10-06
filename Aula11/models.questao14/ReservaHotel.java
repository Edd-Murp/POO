package models.questao14;

public class ReservaHotel extends Reserva {
    private final double valorDiaria;

    public ReservaHotel(String nomeCliente, int quantidadeDias, double valorDiaria) {
        super(nomeCliente, quantidadeDias);
        this.valorDiaria = valorDiaria;
    }

    @Override
    public double calcularValor() {
        return valorDiaria * quantidadeDias;
    }
}

