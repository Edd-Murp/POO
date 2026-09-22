package models;

public class MotoLocacao extends VeiculoLocacao {
    private int cilindradas;

    public MotoLocacao(String placa, String modelo, double valorDiaria, int cilindradas) {
        super(placa, modelo, valorDiaria);
        this.cilindradas = cilindradas;
    }

    public MotoLocacao() {
        super();
        this.cilindradas = 0;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularValorLocacao(int dias) {
        double valor = super.calcularValorLocacao(dias);
        if (cilindradas > 600) {
            valor *= 1.15;
        }
        return valor;
    }
}
