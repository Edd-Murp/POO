package models;

public class RelatorioCSV implements GeradorRelatorio{

    @Override
    public void gerar() throws FalhaGeracaoRelatorioException {
       System.out.println("Relatório CSV:\nTítulo,Informação\nVendas,Relatório gerado");
    }
    
}
