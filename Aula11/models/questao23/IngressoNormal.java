package models.questao23;

public class IngressoNormal extends Ingresso {

    public IngressoNormal(String nomeEvento, double valorBase) {
        super(nomeEvento, valorBase);
    }

    @Override
    public double calcularValor() {
        return valorBase;
    }
}
