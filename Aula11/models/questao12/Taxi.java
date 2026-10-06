package models.questao12;

public class Taxi extends Transporte {

    public Taxi(double distancia) {
        super(distancia);
    }

    @Override
    public double calcularCusto() {
        return 6.0 + 2.5 * distancia;
    }
}
