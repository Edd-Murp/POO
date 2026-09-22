package models;

public class Vendedor extends Empregado {
    private double percentualComissao;
    private int totalVendas;

    public Vendedor(String nome, double salarioBase, double percentualComissao, int totalVendas) {
        super(nome, salarioBase);
        this.percentualComissao = percentualComissao;
        this.totalVendas = totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double calcularSalario() {
        double comissao = (percentualComissao / 100) * totalVendas;
        return getSalarioBase() + comissao;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }
}
