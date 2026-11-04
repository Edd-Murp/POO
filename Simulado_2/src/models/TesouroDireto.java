//Edu Dagnoni Mazureck
package models;

public class TesouroDireto implements Ativo{

    private double valor;
    private double rentabilidade;

    public TesouroDireto(double valor, double rentabilidade) {
        this.valor = valor;
        this.rentabilidade = rentabilidade;
    }

    @Override
    public double calcularRendimento() {
         return rentabilidade; 
    }

    @Override
    public double calcularValorInvestido() {
        return valor += valor*rentabilidade; 
    }



    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
 
    
    
}
