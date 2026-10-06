package models;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numero, double saldo, double taxaJuros) {
        super(numero, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }

        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado na poupança.");
        } else {
            System.out.println("Saldo insuficiente na poupança.");
        }
    }

    public void renderJuros() {
        double juros = getSaldo() * taxaJuros;
        depositar(juros);
        System.out.println("Rendimento de R$" + juros + " adicionado à poupança.");
    }
}
