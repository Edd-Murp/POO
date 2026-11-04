package exercicios;

import java.util.List;

public final class Questao20 {
    private Questao20() {}

    public static class ContaBancaria {
        private final String numero;
        private double saldo;

        public ContaBancaria(String numero, double saldoInicial) {
            if (numero == null || numero.trim().isEmpty() || !Double.isFinite(saldoInicial) || saldoInicial < 0) {
                throw new IllegalArgumentException("Número da conta e saldo inicial válido são obrigatórios.");
            }
            this.numero = numero;
            this.saldo = saldoInicial;
        }

        public String getNumero() { return numero; }
        public synchronized double getSaldo() { return saldo; }
        private synchronized void definirSaldo(double saldo) { this.saldo = saldo; }
    }

    public static class FalhaTransferenciaException extends Exception {
        public FalhaTransferenciaException(String message) { super(message); }
    }

    public static class Transferencia {
        private static final Object LOCK = new Object();

        public void executar(ContaBancaria origem, ContaBancaria destino, double valor)
                throws FalhaTransferenciaException {
            if (origem == null || destino == null || !Double.isFinite(valor) || valor <= 0) {
                throw new IllegalArgumentException("Contas e valor positivo válido são obrigatórios.");
            }
            if (origem == destino) {
                throw new FalhaTransferenciaException("A conta de origem e destino devem ser diferentes.");
            }
            synchronized (LOCK) {
                double saldoOrigem = origem.getSaldo();
                if (saldoOrigem < valor) {
                    throw new FalhaTransferenciaException("Saldo insuficiente.");
                }
                double novoSaldoDestino = destino.getSaldo() + valor;
                if (!Double.isFinite(novoSaldoDestino)) {
                    throw new FalhaTransferenciaException("O saldo de destino excederia o limite permitido.");
                }
                origem.definirSaldo(saldoOrigem - valor);
                destino.definirSaldo(novoSaldoDestino);
            }
        }
    }

    public static class Banco {
        private final Transferencia transferencia = new Transferencia();

        public void processar(List<TransferenciaSolicitada> solicitacoes) {
            for (TransferenciaSolicitada solicitacao : solicitacoes) {
                try {
                    transferencia.executar(solicitacao.origem(), solicitacao.destino(), solicitacao.valor());
                    System.out.println("Transferência realizada: " + solicitacao.valor());
                } catch (IllegalArgumentException e) {
                    System.out.println("Transferência inválida: " + e.getMessage());
                } catch (FalhaTransferenciaException e) {
                    System.out.println("Transferência recusada: " + e.getMessage());
                }
            }
        }
    }

    public static class TransferenciaSolicitada {
        private final ContaBancaria origem;
        private final ContaBancaria destino;
        private final double valor;

        public TransferenciaSolicitada(ContaBancaria origem, ContaBancaria destino, double valor) {
            this.origem = origem;
            this.destino = destino;
            this.valor = valor;
        }

        public ContaBancaria origem() { return origem; }
        public ContaBancaria destino() { return destino; }
        public double valor() { return valor; }
    }

    public static void executar() {
        System.out.println("\n=== Questão 20 - Processamento de transações ===");
        ContaBancaria origem = new ContaBancaria("001", 100);
        ContaBancaria destino = new ContaBancaria("002", 0);
        new Banco().processar(java.util.Arrays.asList(
                new TransferenciaSolicitada(origem, destino, 40),
                new TransferenciaSolicitada(origem, destino, -1),
                new TransferenciaSolicitada(origem, destino, 100),
                new TransferenciaSolicitada(origem, origem, 1)));
        System.out.println("Saldos: " + origem.getSaldo() + " / " + destino.getSaldo());
    }
}
