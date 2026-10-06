package models.questao10;

public class Apartamento extends Imovel {

    public Apartamento(String endereco, double valorBase) {
        super(endereco, valorBase);
    }

    @Override
    public double calcularValorVenda() {
        return valorBase * 1.10;
    }
}
