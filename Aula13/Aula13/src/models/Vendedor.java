package models;

public class Vendedor extends Funcionario {
    private double comissao;
    private int vendas;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (comissao * vendas);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.1;
    }

    public void registrarVenda() {
        vendas++;
    }
    
}
