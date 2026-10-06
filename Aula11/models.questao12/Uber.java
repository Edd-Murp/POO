package models.questao12;

public class Uber extends Transporte {

    public Uber(double distancia) {
        super(distancia);
    }

    @Override
    public double calcularCusto() {
        return 2.0 * distancia;
    }
}

