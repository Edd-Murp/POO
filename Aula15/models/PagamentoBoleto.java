package models;

public class PagamentoBoleto implements MetodoPagamento {
    private String codigoBarras;

    public PagamentoBoleto(String codigoBarras) {
        if (codigoBarras == null || codigoBarras.replaceAll("\\D", "").length() < 10) {
            throw new IllegalArgumentException("Código de barras do boleto inválido.");
        }
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void pagar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Boleto exige valor maior que zero.");
        }
        if (valor > 3000) {
            throw new IllegalArgumentException("Boleto não aceita pagamentos acima de R$ 3.000,00.");
        }
        System.out.println("Pagamento por boleto realizado: R$ " + valor + " - código: " + codigoBarras);
    }
}
