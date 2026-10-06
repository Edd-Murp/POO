package models.questao14;

public class ReservaCarro extends Reserva {
    private final double valorDiariaVeiculo;

    public ReservaCarro(String nomeCliente, int quantidadeDias, double valorDiariaVeiculo) {
        super(nomeCliente, quantidadeDias);
        this.valorDiariaVeiculo = valorDiariaVeiculo;
    }

    @Override
    public double calcularValor() {
        return valorDiariaVeiculo * quantidadeDias;
    }
}

