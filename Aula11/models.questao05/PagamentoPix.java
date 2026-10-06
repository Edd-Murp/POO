package models.questao05;

public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal() {
        return valor * 0.95;
    }
}

