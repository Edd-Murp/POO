package models;

public class Produto implements Descontavel, Precificavel {

    private String nome;
    private double preco;
    private double desconto;
    private double percentualImposto;

    public Produto(String nome, double preco, double desconto, double percentualImposto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.percentualImposto = percentualImposto;
    }

    @Override
    public double calcularDesconto() {
        return preco * (desconto / 100);
    }
    
    @Override
    public double calcularPrecoFinal() {
        double valorDesconto = calcularDesconto();
        double valorImposto = preco * (percentualImposto / 100);
        return preco - valorDesconto + valorImposto;
    }
}
