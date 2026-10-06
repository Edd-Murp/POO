package models.questao20;

public class PlanoBasico extends PlanoAcademia {
    public PlanoBasico(String nomeCliente, double valorBase) {
        super(nomeCliente, valorBase);
    }

    @Override
    public double calcularMensalidade() {
        return valorBase;
    }
}

