package models;

public class PagamentoBoleto extends Pagamento {
    private double valor;
    private double taxa;

    public PagamentoBoleto(double valor, double taxa) {
        this.valor = valor;
        this.taxa = taxa;
    }

    @Override
    public double calcularValorFinal() {
        return valor + (valor + taxa);
    }
    
}
