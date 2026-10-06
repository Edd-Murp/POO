package models;

public class EntregaExpressa extends Entrega {
    @Override
    public double calcularFrete() {
        return 20.0;
    }
    
}
