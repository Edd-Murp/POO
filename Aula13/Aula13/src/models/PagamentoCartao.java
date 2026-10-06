package models;

public class PagamentoCartao extends Pagamento {
    private double valor;
    private double taxa;

    public PagamentoCartao(double valor, double taxa) {
        this.valor = valor;
        this.taxa = taxa;
    }

    @Override
    public double calcularValorFinal() {
        return valor + Math.pow(taxa, 2);
    }
    
}
