package models.questao09;

public class QuartoLuxo extends Quarto {

    public QuartoLuxo(int numero, double valorDiaria) {
        super(numero, valorDiaria);
    }

    @Override
    public double calcularHospedagem(int dias) {
        return valorDiaria * dias + 100.0;
    }
}

