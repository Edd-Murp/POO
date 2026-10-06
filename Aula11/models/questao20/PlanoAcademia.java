package models.questao20;

public abstract class PlanoAcademia {
    protected final String nomeCliente;
    protected final double valorBase;

    public PlanoAcademia(String nomeCliente, double valorBase) {
        this.nomeCliente = nomeCliente;
        this.valorBase = valorBase;
    }

    public abstract double calcularMensalidade();
}

