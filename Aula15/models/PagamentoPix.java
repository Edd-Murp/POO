package models;

public class PagamentoPix implements MetodoPagamento {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        if (chavePix == null || chavePix.trim().isEmpty()) {
            throw new IllegalArgumentException("Chave PIX inválida.");
        }
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("PIX exige valor maior que zero.");
        }
        if (valor > 5000) {
            throw new IllegalArgumentException("PIX não aceita pagamentos acima de R$ 5.000,00.");
        }
        System.out.println("Pagamento PIX realizado: R$ " + valor + " - chave: " + chavePix);
    }
}
