package Parte1.models;

public class Vendedor extends Funcionarios{

    private double comissao;

    public Vendedor(int matricula, String nome, double salario, double comissao) {
        super(matricula, nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Vendedor [comissao=" + comissao + ", getComissao()=" + getComissao() + ", getMatricula()="
                + getMatricula() + ", getNome()=" + getNome() + ", getSalario()=" + getSalario() + "]";
    }
    
    
}
