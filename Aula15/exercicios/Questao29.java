package exercicios;

import java.util.List;

public final class Questao29 {
    private Questao29() {}

    public static class BancoException extends Exception {
        public BancoException(String message) { super(message); }
    }

    public static class SaldoInsuficienteException extends BancoException {
        public SaldoInsuficienteException(String message) { super(message); }
    }

    public static class ContaBloqueadaException extends BancoException {
        public ContaBloqueadaException(String message) { super(message); }
    }

    public static class OperacaoInvalidaException extends BancoException {
        public OperacaoInvalidaException(String message) { super(message); }
    }

    public abstract static class Conta {
        private final String numero;
        private double saldo;
        private boolean bloqueada;

        protected Conta(String numero, double saldo) {
            if (numero == null || numero.trim().isEmpty() || !Double.isFinite(saldo) || saldo < 0) {
                throw new IllegalArgumentException("Dados de conta inválidos.");
            }
            this.numero = numero;
            this.saldo = saldo;
        }
        public String getNumero() { return numero; }
        public synchronized double getSaldo() { return saldo; }
        public void bloquear() { bloqueada = true; }
        protected void verificarAtiva() throws ContaBloqueadaException {
            if (bloqueada) throw new ContaBloqueadaException("Conta " + numero + " bloqueada.");
        }
        protected abstract double calcularSaque(double valor) throws BancoException;
        private synchronized void definirSaldo(double valor) { saldo = valor; }
    }

    public static class ContaCorrente extends Conta {
        public ContaCorrente(String numero, double saldo) { super(numero, saldo); }
        @Override protected double calcularSaque(double valor) throws BancoException {
            verificarAtiva();
            if (valor <= 0 || !Double.isFinite(valor)) throw new OperacaoInvalidaException("Valor de saque inválido.");
            if (valor > getSaldo()) throw new SaldoInsuficienteException("Saldo insuficiente.");
            return getSaldo() - valor;
        }
    }

    public static class ContaPoupanca extends Conta {
        public ContaPoupanca(String numero, double saldo) { super(numero, saldo); }
        @Override protected double calcularSaque(double valor) throws BancoException {
            verificarAtiva();
            if (valor <= 0 || !Double.isFinite(valor)) throw new OperacaoInvalidaException("Valor de saque inválido.");
            if (valor > getSaldo()) throw new SaldoInsuficienteException("Saldo insuficiente.");
            if (valor < 10) throw new OperacaoInvalidaException("Saque mínimo da poupança: R$ 10.");
            return getSaldo() - valor;
        }
    }

    public interface OperacaoBancaria {
        void executar() throws BancoException;
    }

    public static class Deposito implements OperacaoBancaria {
        private final Conta conta;
        private final double valor;
        public Deposito(Conta conta, double valor) { this.conta = conta; this.valor = valor; }
        @Override public void executar() throws BancoException {
            conta.verificarAtiva();
            if (!Double.isFinite(valor) || valor <= 0) throw new OperacaoInvalidaException("Depósito inválido.");
            double novoSaldo = conta.getSaldo() + valor;
            if (!Double.isFinite(novoSaldo)) throw new OperacaoInvalidaException("Saldo excederia o limite permitido.");
            conta.definirSaldo(novoSaldo);
        }
    }

    public static class Saque implements OperacaoBancaria {
        private final Conta conta;
        private final double valor;
        public Saque(Conta conta, double valor) { this.conta = conta; this.valor = valor; }
        @Override public void executar() throws BancoException { conta.definirSaldo(conta.calcularSaque(valor)); }
    }

    public static class Transferencia implements OperacaoBancaria {
        private final Conta origem;
        private final Conta destino;
        private final double valor;
        public Transferencia(Conta origem, Conta destino, double valor) {
            this.origem = origem; this.destino = destino; this.valor = valor;
        }
        @Override public void executar() throws BancoException {
            origem.verificarAtiva();
            destino.verificarAtiva();
            if (origem == destino || !Double.isFinite(valor) || valor <= 0) {
                throw new OperacaoInvalidaException("Transferência inválida.");
            }
            double novoSaldoOrigem = origem.calcularSaque(valor);
            double novoSaldoDestino = destino.getSaldo() + valor;
            if (!Double.isFinite(novoSaldoDestino)) {
                throw new OperacaoInvalidaException("Saldo de destino excederia o limite permitido.");
            }
            origem.definirSaldo(novoSaldoOrigem);
            destino.definirSaldo(novoSaldoDestino);
        }
    }

    public static class Banco {
        public void processar(List<OperacaoBancaria> operacoes) {
            for (OperacaoBancaria operacao : operacoes) {
                try {
                    operacao.executar();
                    System.out.println("Operação bancária concluída.");
                } catch (SaldoInsuficienteException e) {
                    System.out.println("Saldo insuficiente: " + e.getMessage());
                } catch (ContaBloqueadaException e) {
                    System.out.println("Conta bloqueada: " + e.getMessage());
                } catch (OperacaoInvalidaException e) {
                    System.out.println("Operação inválida: " + e.getMessage());
                } catch (BancoException e) {
                    System.out.println("Falha bancária: " + e.getMessage());
                }
            }
        }
    }

    public static void executar() {
        System.out.println("\n=== Questão 29 - Sistema bancário polimórfico ===");
        ContaCorrente corrente = new ContaCorrente("CC-1", 100);
        ContaPoupanca poupanca = new ContaPoupanca("CP-1", 20);
        new Banco().processar(java.util.Arrays.asList(
                new Deposito(corrente, 10),
                new Saque(poupanca, 5),
                new Transferencia(corrente, poupanca, 30),
                new Saque(corrente, 500)));
        poupanca.bloquear();
        new Banco().processar(java.util.Collections.singletonList(new Saque(poupanca, 10)));
        System.out.println("Saldos: " + corrente.getSaldo() + " / " + poupanca.getSaldo());
    }
}
