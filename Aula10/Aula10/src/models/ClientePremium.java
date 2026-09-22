package models;

public class ClientePremium extends Cliente {

    public ClientePremium(String nome, double valorCompra) {
        super(nome, valorCompra);
    }

    @Override
    public double calcularDesconto() {
        return super.getValorCompra() - super.getValorCompra() * 0.10; // 10% de desconto
    }
    
}
