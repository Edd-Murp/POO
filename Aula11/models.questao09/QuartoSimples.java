package models.questao09;

public class QuartoSimples extends Quarto {

    public QuartoSimples(int numero, double valorDiaria) {
        super(numero, valorDiaria);
    }

    @Override
    public double calcularHospedagem(int dias) {
        return valorDiaria * dias;
    }
}

