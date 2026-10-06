package models.questao27;

public abstract class VeiculoEstacionamento {
    protected final String placa;
    protected final double horasEstacionado;

    public VeiculoEstacionamento(String placa, double horasEstacionado) {
        this.placa = placa;
        this.horasEstacionado = horasEstacionado;
    }

    public abstract double calcularValor();
}

