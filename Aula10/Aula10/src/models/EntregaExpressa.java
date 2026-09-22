package models;

public class EntregaExpressa extends Entrega {

    public EntregaExpressa(double distanciaKm) {
        super(distanciaKm);
    }

    @Override
    public double calcularFrete() {
        return super.calcularFrete()+ 20;
    }
    
}
