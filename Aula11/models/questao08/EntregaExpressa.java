package models.questao08;

public class EntregaExpressa extends Entrega {

    public EntregaExpressa(double distancia, double peso) {
        super(distancia, peso);
    }

    @Override
    public double calcularFrete() {
        return distancia * 3.5 + 10.0;
    }
}
