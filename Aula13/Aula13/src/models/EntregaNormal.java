package models;

public class EntregaNormal extends Entrega {
    @Override
    public double calcularFrete() {
        return 10.0;
    }
    
}
