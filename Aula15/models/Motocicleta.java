package models;

public class Motocicleta extends Veiculo {
    @Override
    public void acelerar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Velocidade solicitada não pode ser negativa.");
        }
        velocidade += valor + 5;
    }
}
