package exercicios;

public final class Questao24 {
    private Questao24() {}

    public static class FalhaPersistenciaException extends Exception {
        public FalhaPersistenciaException(String message) { super(message); }
    }

    public static class PedidoInvalidoException extends Exception {
        public PedidoInvalidoException(String message) { super(message); }
    }

    public static class PedidoRepository {
        public void salvar(String pedido) throws FalhaPersistenciaException {
            throw new FalhaPersistenciaException("Banco de dados indisponível.");
        }
    }

    public static class PedidoService {
        private final PedidoRepository repository;

        public PedidoService(PedidoRepository repository) { this.repository = repository; }

        public void criarPedido(String pedido)
                throws PedidoInvalidoException, FalhaPersistenciaException {
            if (pedido == null || pedido.trim().isEmpty()) {
                throw new PedidoInvalidoException("O pedido não pode ser vazio.");
            }
            repository.salvar(pedido);
        }
    }

    public static class Aplicacao {
        public void executar() {
            PedidoService service = new PedidoService(new PedidoRepository());
            for (String pedido : new String[] {"", "Pedido #123"}) {
                try {
                    service.criarPedido(pedido);
                } catch (PedidoInvalidoException e) {
                    System.out.println("Pedido inválido: " + e.getMessage());
                } catch (FalhaPersistenciaException e) {
                    System.out.println("Falha ao persistir: " + e.getMessage());
                }
            }
        }
    }

    public static void executar() {
        System.out.println("\n=== Questão 24 - Propagação entre camadas ===");
        new Aplicacao().executar();
    }
}
