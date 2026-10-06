package models.questao18;

public class Hotel extends Hospedagem {
    public Hotel(double valorDiaria) {
        super(valorDiaria);
    }

    @Override
    public double calcularValor(int dias) {
        return valorDiaria * dias;
    }

    public double calcularValor(int dias, double desconto) {
        return calcularValor(dias) * (1.0 - desconto / 100.0);
    }
}

