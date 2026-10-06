package models.questao05;

public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal() {
        return valor * 1.03;
    }
}
