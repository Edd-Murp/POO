package models.questao04;

public class ProdutoNacional extends Produto {

    public ProdutoNacional(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco;
    }
}

