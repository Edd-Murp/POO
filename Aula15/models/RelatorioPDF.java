package models;

public class RelatorioPDF implements GeradorRelatorio{

    private final boolean simularFalha;

    public RelatorioPDF() {
        this(false);
    }

    public RelatorioPDF(boolean simularFalha) {
        this.simularFalha = simularFalha;
    }

    @Override
    public void gerar() throws FalhaGeracaoRelatorioException {
        if (simularFalha) {
            throw new FalhaGeracaoRelatorioException("Não foi possível gerar o relatório PDF.");
        }

        System.out.println("Relatório PDF: [cabeçalho, dados do relatório e rodapé]");
    }
    
}
