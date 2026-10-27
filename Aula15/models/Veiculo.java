package models;

public class Veiculo {
    protected double velocidade;

    public void acelerar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Velocidade solicitada não pode ser negativa.");
        }
        velocidade += valor;
    }

    public double getVelocidade() {
        return velocidade;
    }
}
