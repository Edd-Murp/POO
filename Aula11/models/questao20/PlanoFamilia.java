package models.questao20;

public class PlanoFamilia extends PlanoAcademia {
    private final int quantidadeDependentes;

    public PlanoFamilia(String nomeCliente, double valorBase, int quantidadeDependentes) {
        super(nomeCliente, valorBase);
        this.quantidadeDependentes = quantidadeDependentes;
    }

    @Override
    public double calcularMensalidade() {
        return valorBase + quantidadeDependentes * 30.0;
    }
}

