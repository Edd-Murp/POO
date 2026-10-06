package models;

public class EntregaAgendada extends Entrega {
    @Override
    public double calcularFrete() {
        return 15.0;
    }
    
}
