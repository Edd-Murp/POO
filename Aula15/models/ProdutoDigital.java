package models;

public class ProdutoDigital extends Produto {
    public ProdutoDigital(String nome, double preco, int quantidadeEstoque) {
        super(nome, preco, quantidadeEstoque);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco;
    }
}
