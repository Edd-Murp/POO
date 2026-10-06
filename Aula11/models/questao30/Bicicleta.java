package models.questao30;

public class Bicicleta extends ItemLocacao {
    public Bicicleta(int codigo, String descricao, double valorDiaria) {
        super(codigo, descricao, valorDiaria);
    }

    @Override
    public double calcularLocacao(int dias) {
        return valorDiaria * dias;
    }
}

