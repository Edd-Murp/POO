package models;

public class PagamentoCartao implements MetodoPagamento {
    private String numeroCartao;
    private String nomeTitular;

    public PagamentoCartao(String numeroCartao, String nomeTitular) {
        if (numeroCartao == null || numeroCartao.replaceAll("\\D", "").length() != 16) {
            throw new IllegalArgumentException("Número do cartão inválido.");
        }
        if (nomeTitular == null || nomeTitular.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do titular inválido.");
        }
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void pagar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Cartão exige valor maior que zero.");
        }
        if (valor > 10000) {
            throw new IllegalArgumentException("Cartão não aceita pagamentos acima de R$ 10.000,00.");
        }
        System.out.println("Pagamento com cartão realizado: R$ " + valor + " - titular: " + nomeTitular);
    }
}
