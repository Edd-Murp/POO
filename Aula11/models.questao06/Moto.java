package models.questao06;

public class Moto extends Veiculo {

    public Moto(String modelo, double valor) {
        super(modelo, valor);
    }

    @Override
    public double calcularImposto() {
        return valor * 0.02;
    }
}

