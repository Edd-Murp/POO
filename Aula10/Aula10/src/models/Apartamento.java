package models;

public class Apartamento extends Imovel {
    private int andar;
    private double valorCondominio;

    public Apartamento(String endereco, double valor, int andar, double valorCondominio) {
        super(endereco, valor);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    public int getAndar() {
        return andar;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public double calcularCustoMensal() {
        return getValor() + valorCondominio;
    }
    
}
