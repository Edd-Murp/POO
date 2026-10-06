package models.questao06;

public class Carro extends Veiculo {

    public Carro(String modelo, double valor) {
        super(modelo, valor);
    }

    @Override
    public double calcularImposto() {
        return valor * 0.04;
    }
}
