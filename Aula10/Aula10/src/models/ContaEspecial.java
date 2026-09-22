package models;

public class ContaEspecial extends ContaBancaria {
    private double limiteCredito;

    public ContaEspecial(String titular, String numeroConta, double saldo, double limiteCredito) {
        super(numeroConta, saldo);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void sacar(double valor) {
        super.sacar(valor);
    }
    public void depositar(double valor) {
        super.depositar(valor);
    }
    
}
