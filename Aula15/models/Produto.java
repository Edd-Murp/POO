package models;

public class Produto {
    protected String nome;
    protected double preco;
    protected int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        setNome(nome);
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }
    public Produto(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto inválido.");
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Estoque não pode ser negativo.");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double calcularPrecoFinal() {
        return preco;
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade de venda inválida.");
        }
        if (quantidade > quantidadeEstoque) {
            throw new IllegalStateException("Produto sem estoque suficiente para venda.");
        }
        quantidadeEstoque -= quantidade;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco + " - estoque: " + quantidadeEstoque;
    }
}
