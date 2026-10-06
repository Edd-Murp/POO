package models.questao23;

public class IngressoVIP extends Ingresso {

    public IngressoVIP(String nomeEvento, double valorBase) {
        super(nomeEvento, valorBase);
    }

    @Override
    public double calcularValor() {
        return valorBase * 1.50;
    }
}

