package models;

public class Cliente {
    private String nome;
    private double valorCompra;

    public Cliente(String nome, double valorCompra) {
        this.nome = nome;
        this.valorCompra = valorCompra;
    }

    public double calcularDesconto() {
            return valorCompra - valorCompra * 0.05; // 5% de desconto
    }

    public String getNome() {
        return nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    
}
