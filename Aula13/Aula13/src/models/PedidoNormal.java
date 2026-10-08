package models;

public class PedidoNormal extends Pedido {
    
    public PedidoNormal(int numero, double valor) {
        super(numero, valor);
    }

    @Override
    public void calcularFrete() {
        setValor(getValor() + getValor() * 0.1);
        System.out.println("Calculando frete normal... Frete: " + getValor());
    }
    
}
