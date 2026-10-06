package models.questao23;

public class IngressoMeia extends Ingresso {

    public IngressoMeia(String nomeEvento, double valorBase) {
        super(nomeEvento, valorBase);
    }

    @Override
    public double calcularValor() {
        return valorBase * 0.50;
    }
}
