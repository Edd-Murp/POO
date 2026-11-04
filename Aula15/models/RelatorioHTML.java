package models;

public class RelatorioHTML implements GeradorRelatorio{

    @Override
    public void gerar() throws FalhaGeracaoRelatorioException {
        System.out.println("Relatório HTML: <h1>Vendas</h1><p>Relatório gerado</p>");
    }
    
}
