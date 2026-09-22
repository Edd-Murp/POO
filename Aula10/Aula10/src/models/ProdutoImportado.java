package models;

public class ProdutoImportado extends Produto {
    private double taxaImportacao;

    public ProdutoImportado(String nome, double preco, double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    public double calcularPrecoFinal() {
        return super.getPreco() + taxaImportacao;    
    }
    
}
