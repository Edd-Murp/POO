package models;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }

        double saldoDisponivel = getSaldo() + limite;
        if (valor <= saldoDisponivel) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado na conta corrente.");
        } else {
            System.out.println("Saldo insuficiente na conta corrente.");
        }
    }
}
