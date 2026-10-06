package models.questao19;

public class PedidoRetirada extends Pedido {

    public PedidoRetirada(int numero, double valorProdutos) {
        super(numero, valorProdutos);
    }

    @Override
    public double calcularTotal() {
        return valorProdutos;
    }
}
