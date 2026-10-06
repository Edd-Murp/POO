package models.questao20;

public class PlanoPremium extends PlanoAcademia {
    public PlanoPremium(String nomeCliente, double valorBase) {
        super(nomeCliente, valorBase);
    }

    @Override
    public double calcularMensalidade() {
        return valorBase + 50.0;
    }
}

