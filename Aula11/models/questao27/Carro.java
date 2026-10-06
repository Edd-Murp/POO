package models.questao27;

public class Carro extends VeiculoEstacionamento {
    public Carro(String placa, double horasEstacionado) {
        super(placa, horasEstacionado);
    }

    @Override
    public double calcularValor() {
        return horasEstacionado * 5.0;
    }
}

