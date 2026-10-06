package models.questao26;

public class Vendedor extends Funcionario {
    private final double vendas;
    private final double percentualComissao;

    public Vendedor(String nome, double salarioBase, double vendas, double percentualComissao) {
        super(nome, salarioBase);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + vendas * percentualComissao / 100.0;
    }
}

