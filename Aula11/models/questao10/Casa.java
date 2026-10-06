package models.questao10;

public class Casa extends Imovel {

    public Casa(String endereco, double valorBase) {
        super(endereco, valorBase);
    }

    @Override
    public double calcularValorVenda() {
        return valorBase + 30000.0;
    }
}
