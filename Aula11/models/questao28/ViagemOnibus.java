package models.questao28;

public class ViagemOnibus extends Viagem {
    public ViagemOnibus(double distancia, int quantidadePassageiros) {
        super(distancia, quantidadePassageiros);
    }

    @Override
    public double calcularCusto() {
        return distancia * 0.30 * quantidadePassageiros;
    }
}

