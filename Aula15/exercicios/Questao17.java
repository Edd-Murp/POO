package exercicios;

import java.util.HashMap;
import java.util.Map;

public final class Questao17 {
    private Questao17() {}

    public static class Produto {
        private final String nome;

        public Produto(String nome) {
            if (nome == null || nome.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome do produto obrigatório.");
            }
            this.nome = nome;
        }

        public String getNome() { return nome; }
    }

    public static class Estoque {
        private final Map<Produto, Integer> quantidades = new HashMap<>();

        public void adicionar(Produto produto, int quantidade) {
            if (produto == null || quantidade <= 0) {
                throw new IllegalArgumentException("Produto e quantidade positiva são obrigatórios.");
            }
            quantidades.merge(produto, quantidade, Integer::sum);
        }

        public int quantidadeDisponivel(Produto produto) {
            return quantidades.getOrDefault(produto, 0);
        }

        private void retirar(Produto produto, int quantidade) throws EstoqueInsuficienteException {
            int disponivel = quantidadeDisponivel(produto);
            if (quantidade > disponivel) {
                throw new EstoqueInsuficienteException(
                        "Estoque insuficiente de " + produto.getNome() + " (disponível: " + disponivel + ").");
            }
            quantidades.put(produto, disponivel - quantidade);
        }
    }

    public static class EstoqueInsuficienteException extends Exception {
        public EstoqueInsuficienteException(String message) { super(message); }
    }

    public static class Venda {
        public void vender(Estoque estoque, Produto produto, int quantidade)
                throws EstoqueInsuficienteException {
            if (estoque == null || produto == null || quantidade <= 0) {
                throw new IllegalArgumentException("Estoque, produto e quantidade positiva são obrigatórios.");
            }
            estoque.retirar(produto, quantidade);
            System.out.println("Venda realizada: " + quantidade + " unidade(s) de " + produto.getNome());
        }
    }

    public static void executar() {
        System.out.println("\n=== Questão 17 - Controle de estoque e vendas ===");
        Estoque estoque = new Estoque();
        Produto produto = new Produto("Caderno");
        estoque.adicionar(produto, 3);
        Venda venda = new Venda();
        try {
            venda.vender(estoque, produto, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido: " + e.getMessage());
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Venda não realizada: " + e.getMessage());
        }
        try {
            venda.vender(estoque, produto, 2);
            venda.vender(estoque, produto, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido: " + e.getMessage());
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Venda não realizada: " + e.getMessage());
        }
        System.out.println("Estoque restante: " + estoque.quantidadeDisponivel(produto));
    }
}
