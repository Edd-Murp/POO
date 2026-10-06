package models;

public abstract class ContaBancaria {
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public void transferir(ContaBancaria destino, double valor) {
        if (destino == null) {
            System.out.println("Conta destino inválida.");
            return;
        }

        if (valor <= 0) {
            System.out.println("Valor de transferência inválido.");
            return;
        }

        this.sacar(valor);
        if (this.getSaldo() >= 0 || this instanceof ContaCorrente || this instanceof ContaCorrenteEspecial) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada da conta " + this.getNumero() + " para a conta " + destino.getNumero() + ".");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
}
