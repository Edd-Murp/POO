package models;

public class Servico implements Descontavel {

    private double valorHora;
    private int quantidadeHoras;
    private double percentualDesconto;

    public Servico(double valorHora, int quantidadeHoras, double percentualDesconto) {
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularDesconto() {
        return valorHora * quantidadeHoras * (percentualDesconto / 100);
    }
    
}
