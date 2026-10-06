package models;

public class ProdutoNacional extends Produto {
    public ProdutoNacional(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.10;
    }
}
