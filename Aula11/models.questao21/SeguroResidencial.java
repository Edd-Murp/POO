package models.questao21;

public class SeguroResidencial extends Seguro {

    public SeguroResidencial(String nomeSegurado, double valorBem) {
        super(nomeSegurado, valorBem);
    }

    @Override
    public double calcularPremio() {
        return valorBem * 0.02;
    }
}

