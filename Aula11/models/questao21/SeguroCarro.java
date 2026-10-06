package models.questao21;

public class SeguroCarro extends Seguro {

    public SeguroCarro(String nomeSegurado, double valorBem) {
        super(nomeSegurado, valorBem);
    }

    @Override
    public double calcularPremio() {
        return valorBem * 0.05;
    }
}
