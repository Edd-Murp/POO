package models.questao30;

public abstract class ItemLocacao {
    protected final int codigo;
    protected final String descricao;
    protected final double valorDiaria;

    public ItemLocacao(int codigo, String descricao, double valorDiaria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }

    public abstract double calcularLocacao(int dias);
}

