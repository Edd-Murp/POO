package models;

public class Aluguel {
    private int qtdDias;
    private Veiculo veiculo;
    private int qtdPassageiros;
    

    
    public int getQtdDias() {
        return qtdDias;
    }
    public void setQtdDias(int qtdDias) {
        if(qtdDias < 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero.");
        }
        this.qtdDias = qtdDias;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
    public void setQtdPassageiros(int qtdPassageiros) {
        if(qtdPassageiros < 0) {
            throw new IllegalArgumentException("A quantidade de passageiros deve ser maior que zero.");
        }
        this.qtdPassageiros = qtdPassageiros;
    }


    //métodos
    public double calcularValorAluguel(Aluguel aluguel) {
        double valorTotal = 0;
        if(aluguel.getQtdPassageiros() > 4) {
            valorTotal = (aluguel.veiculo.getValorDiaria() * aluguel.getQtdDias()) + ((aluguel.getQtdPassageiros() - 4) * 20);
            return valorTotal;
        }else{
        valorTotal = aluguel.getQtdDias() * aluguel.getVeiculo().getValorDiaria();
        return valorTotal;
        }
    }
}
