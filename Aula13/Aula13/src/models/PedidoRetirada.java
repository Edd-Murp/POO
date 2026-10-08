package models;

public class PedidoRetirada extends Pedido {
    
    public PedidoRetirada(int numero, double valor) {
        super(numero, valor);
    }

    @Override
    public void calcularFrete() {
        System.out.println("Pedido de retirada não possui frete. Valor: " + getValor());
    }
    
}
