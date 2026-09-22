package models;

public class PedidoExpress extends Pedido {
    private double taxaUrgencia;

    public PedidoExpress(int numero, double valorProdutos, double valorFrete, double taxaUrgencia) {
        super(numero, valorProdutos, valorFrete);
        this.taxaUrgencia = taxaUrgencia;
    }

    @Override
    public double calcularTotal() {
        return super.calcularTotal() + taxaUrgencia;
    }
    
}
