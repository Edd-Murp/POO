package models.questao19;

public class PedidoEntrega extends Pedido {

    public PedidoEntrega(int numero, double valorProdutos) {
        super(numero, valorProdutos);
    }

    @Override
    public double calcularTotal() {
        return valorProdutos + 15.0;
    }
}

