package HashMap.Questao1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> produtos = new HashMap<>();
        produtos.put(101, "Caderno");
        produtos.put(102, "Caneta");
        produtos.put(103, "Mochila");
        produtos.put(104, "Estojo");
        produtos.put(105, "Régua");

        System.out.println("Produto 103: " + produtos.get(103));
        System.out.println("Código 102 cadastrado? " + produtos.containsKey(102));

        produtos.put(103, "Mochila escolar");
        produtos.remove(104);

        System.out.println("Produtos cadastrados:");
        for (Integer codigo : produtos.keySet()) {
            System.out.println(codigo + ": " + produtos.get(codigo));
        }
    }
}
