package models.questao30;

public class Moto extends ItemLocacao {
    public Moto(int codigo, String descricao, double valorDiaria) {
        super(codigo, descricao, valorDiaria);
    }

    @Override
    public double calcularLocacao(int dias) {
        return valorDiaria * dias + 20.0;
    }
}

