package models.questao04;

public class ProdutoImportado extends Produto {

    public ProdutoImportado(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.20;
    }
}

