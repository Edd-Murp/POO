package models.questao12;

public class Onibus extends Transporte {

    public Onibus(double distancia) {
        super(distancia);
    }

    @Override
    public double calcularCusto() {
        return 5.5;
    }
}

