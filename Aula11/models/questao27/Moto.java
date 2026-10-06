package models.questao27;

public class Moto extends VeiculoEstacionamento {
    public Moto(String placa, double horasEstacionado) {
        super(placa, horasEstacionado);
    }

    @Override
    public double calcularValor() {
        return horasEstacionado * 3.0;
    }
}

