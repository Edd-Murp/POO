package models;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public double calcularPrecoComDesconto(double desconto) {
        return preco - (preco * (desconto/100));
    }
}
