package models;

public class ProdutoFisico extends Produto {
    public ProdutoFisico(String nome, double preco, int quantidadeEstoque) {
        super(nome, preco, quantidadeEstoque);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.10;
    }

    @Override
    public void vender(int quantidade) {
        if (quantidade > quantidadeEstoque) {
            throw new IllegalStateException("Produto físico vendido sem estoque.");
        }
        super.vender(quantidade);
    }
}
