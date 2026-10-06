package models.questao08;

public class EntregaNormal extends Entrega {

    public EntregaNormal(double distancia, double peso) {
        super(distancia, peso);
    }

    @Override
    public double calcularFrete() {
        return distancia * 2.0;
    }
}

