package models.questao19;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int numero, double valorProdutos) {
        super(numero, valorProdutos);
    }

    @Override
    public double calcularTotal() {
        return valorProdutos + 30.0;
    }
}

