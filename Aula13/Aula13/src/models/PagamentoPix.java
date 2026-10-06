package models;

public class PagamentoPix extends Pagamento {
    private double valor;
    private double taxa;

    public PagamentoPix(double valor, double taxa) {
        this.valor = valor;
        this.taxa = taxa;
    }

    @Override
    public double calcularValorFinal() {
        return valor + (valor * taxa);
    }

    
    
}
