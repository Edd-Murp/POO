package models.questao28;

public class ViagemCarro extends Viagem {
    public ViagemCarro(double distancia, int quantidadePassageiros) {
        super(distancia, quantidadePassageiros);
    }

    @Override
    public double calcularCusto() {
        return distancia * 0.80;
    }
}

