package models;

public class PedidoExpress extends Pedido {
    
    public PedidoExpress(int numero, double valor) {
        super(numero, valor);
    }

    @Override
    public void calcularFrete() {
        setValor(getValor() + getValor() * 0.2);
        System.out.println("Calculando frete express... Frete: " + getValor());
    }
    
}
