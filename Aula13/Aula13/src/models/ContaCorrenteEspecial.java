package models;

public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(int numero, double saldo, double limite) {
        super(numero, saldo, limite);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }

        double saldoDisponivel = getSaldo() + getLimite() + 500.0;
        if (valor <= saldoDisponivel) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado na conta corrente especial.");
        } else {
            System.out.println("Saldo insuficiente na conta corrente especial.");
        }
    }
}
