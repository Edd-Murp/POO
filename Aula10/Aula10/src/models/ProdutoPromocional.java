package models;

public class ProdutoPromocional extends Produto {
    private double percentualDesconto;

    public ProdutoPromocional(String nome, double preco, double percentualDesconto) {
        super(nome, preco);
        this.percentualDesconto = percentualDesconto;
    }

    public ProdutoPromocional(String nome, double percentualDesconto) {
        super(nome);
        this.percentualDesconto = percentualDesconto;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double getPreco() {
        return super.getPreco() * (1 - percentualDesconto / 100);
    }
    
}
