package exercicios;

import java.util.ArrayList;
import java.util.List;

public final class Questao26 {
    private Questao26() {}

    public static class PedidoException extends Exception {
        public PedidoException(String message) { super(message); }
    }

    public static class EstoqueInsuficienteException extends PedidoException {
        public EstoqueInsuficienteException(String message) { super(message); }
    }

    public static class PagamentoRecusadoException extends PedidoException {
        public PagamentoRecusadoException(String message) { super(message); }
    }

    public static class PedidoInvalidoException extends PedidoException {
        public PedidoInvalidoException(String message) { super(message); }
    }

    public abstract static class Produto {
        private final String nome;
        private final double preco;
        private int estoque;

        protected Produto(String nome, double preco, int estoque) {
            if (nome == null || nome.trim().isEmpty() || !Double.isFinite(preco) || preco < 0 || estoque < 0) {
                throw new IllegalArgumentException("Dados do produto inválidos.");
            }
            this.nome = nome;
            this.preco = preco;
            this.estoque = estoque;
        }

        public String getNome() { return nome; }
        public double getPreco() { return preco; }
        public int getEstoque() { return estoque; }
        public abstract String getTipo();
        private void reduzirEstoque(int quantidade) { estoque -= quantidade; }
    }

    public static class ProdutoFisico extends Produto {
        public ProdutoFisico(String nome, double preco, int estoque) { super(nome, preco, estoque); }
        @Override public String getTipo() { return "físico"; }
    }

    public static class ProdutoDigital extends Produto {
        public ProdutoDigital(String nome, double preco) { super(nome, preco, Integer.MAX_VALUE); }
        @Override public String getTipo() { return "digital"; }
    }

    public static class Cliente {
        private final String nome;
        public Cliente(String nome) {
            if (nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Nome obrigatório.");
            this.nome = nome;
        }
        public String getNome() { return nome; }
    }

    public static class ItemPedido {
        private final Produto produto;
        private final int quantidade;
        public ItemPedido(Produto produto, int quantidade) {
            if (produto == null || quantidade <= 0) throw new IllegalArgumentException("Item inválido.");
            this.produto = produto;
            this.quantidade = quantidade;
        }
        public Produto getProduto() { return produto; }
        public int getQuantidade() { return quantidade; }
        public double getSubtotal() { return produto.getPreco() * quantidade; }
    }

    public interface Pagamento {
        void pagar(double valor) throws PagamentoRecusadoException;
    }

    public static class PagamentoPix implements Pagamento {
        @Override public void pagar(double valor) {
            System.out.println("PIX aprovado: R$ " + valor);
        }
    }

    public static class PagamentoCartao implements Pagamento {
        private final boolean aprovado;
        public PagamentoCartao(boolean aprovado) { this.aprovado = aprovado; }
        @Override public void pagar(double valor) throws PagamentoRecusadoException {
            if (!aprovado) throw new PagamentoRecusadoException("Cartão recusado.");
            System.out.println("Cartão aprovado: R$ " + valor);
        }
    }

    public static class Pedido {
        private final Cliente cliente;
        private final List<ItemPedido> itens = new ArrayList<>();

        public Pedido(Cliente cliente) {
            if (cliente == null) throw new IllegalArgumentException("Cliente obrigatório.");
            this.cliente = cliente;
        }

        public void adicionar(ItemPedido item) { itens.add(item); }

        public void processar(Pagamento pagamento)
                throws PedidoInvalidoException, EstoqueInsuficienteException, PagamentoRecusadoException {
            if (itens.isEmpty() || pagamento == null) {
                throw new PedidoInvalidoException("Pedido sem itens ou forma de pagamento.");
            }
            for (ItemPedido item : itens) {
                if (item.getQuantidade() > item.getProduto().getEstoque()) {
                    throw new EstoqueInsuficienteException("Estoque insuficiente: " + item.getProduto().getNome());
                }
            }
            double total = itens.stream().mapToDouble(ItemPedido::getSubtotal).sum();
            pagamento.pagar(total);
            for (ItemPedido item : itens) item.getProduto().reduzirEstoque(item.getQuantidade());
            System.out.println("Pedido de " + cliente.getNome() + " concluído.");
        }
    }

    public static void executar() {
        System.out.println("\n=== Questão 26 - E-commerce completo ===");
        ProdutoFisico livro = new ProdutoFisico("Livro", 50, 1);
        ProdutoDigital curso = new ProdutoDigital("Curso", 80);
        Pedido[] pedidos = new Pedido[4];
        pedidos[0] = new Pedido(new Cliente("Bia"));
        pedidos[0].adicionar(new ItemPedido(livro, 1));
        pedidos[1] = new Pedido(new Cliente("Caio"));
        pedidos[1].adicionar(new ItemPedido(livro, 1));
        pedidos[2] = new Pedido(new Cliente("Duda"));
        pedidos[2].adicionar(new ItemPedido(curso, 1));
        pedidos[3] = new Pedido(new Cliente("Eva"));
        Pagamento[] pagamentos = {
                new PagamentoPix(), new PagamentoPix(), new PagamentoCartao(false), new PagamentoPix()
        };
        for (int i = 0; i < pedidos.length; i++) {
            try {
                pedidos[i].processar(pagamentos[i]);
            } catch (EstoqueInsuficienteException e) {
                System.out.println("Estoque insuficiente: " + e.getMessage());
            } catch (PagamentoRecusadoException e) {
                System.out.println("Pagamento recusado: " + e.getMessage());
            } catch (PedidoInvalidoException e) {
                System.out.println("Pedido inválido: " + e.getMessage());
            }
        }
    }
}
