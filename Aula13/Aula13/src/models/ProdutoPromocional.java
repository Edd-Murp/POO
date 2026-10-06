package models;

public class ProdutoPromocional extends Produto {
    private double desconto;

    public ProdutoPromocional(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * (1 - (desconto / 100));
    }
}
