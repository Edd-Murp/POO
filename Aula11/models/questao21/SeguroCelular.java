package models.questao21;

public class SeguroCelular extends Seguro {

    public SeguroCelular(String nomeSegurado, double valorBem) {
        super(nomeSegurado, valorBem);
    }

    @Override
    public double calcularPremio() {
        return valorBem * 0.08;
    }
}
