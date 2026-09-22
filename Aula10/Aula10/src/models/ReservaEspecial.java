package models;

public class ReservaEspecial extends Reserva {
    private double valorServicosExtras;

    public ReservaEspecial(String nomeCliente, int numeroQuarto, double valorDiaria, double valorServicosExtras) {
        super(nomeCliente, numeroQuarto, valorDiaria);
        this.valorServicosExtras = valorServicosExtras;
    }

    @Override
    public double calcularTotal() {
        return super.calcularTotal() + valorServicosExtras;
    }
    
}
