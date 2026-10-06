package models;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + 2.0;
        if (valor > 0 && valorTotal <= getSaldo()) {
            atualizarSaldo(getSaldo() - valorTotal);
        }
    }
}
