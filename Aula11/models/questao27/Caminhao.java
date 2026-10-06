package models.questao27;

public class Caminhao extends VeiculoEstacionamento {
    public Caminhao(String placa, double horasEstacionado) {
        super(placa, horasEstacionado);
    }

    @Override
    public double calcularValor() {
        return horasEstacionado * 10.0;
    }
}

