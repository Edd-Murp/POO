package models.questao28;

public class ViagemAviao extends Viagem {
    public ViagemAviao(double distancia, int quantidadePassageiros) {
        super(distancia, quantidadePassageiros);
    }

    @Override
    public double calcularCusto() {
        return distancia * 0.70 * quantidadePassageiros;
    }
}

