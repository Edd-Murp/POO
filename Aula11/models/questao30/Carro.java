package models.questao30;

public class Carro extends ItemLocacao {
    public Carro(int codigo, String descricao, double valorDiaria) {
        super(codigo, descricao, valorDiaria);
    }

    @Override
    public double calcularLocacao(int dias) {
        return valorDiaria * dias + 50.0;
    }

    public double calcularLocacao(int dias, double desconto) {
        return calcularLocacao(dias) * (1.0 - desconto / 100.0);
    }
}

