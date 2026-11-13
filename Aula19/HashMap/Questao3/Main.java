package HashMap.Questao3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> estoque = new HashMap<>();
        estoque.put(201, 12);
        estoque.put(202, 30);
        estoque.put(203, 8);
        estoque.put(204, 15);
        estoque.put(205, 24);
        estoque.put(206, 6);

        int codigoConsulta = 203;
        System.out.println("Quantidade do produto " + codigoConsulta + ": "
                + estoque.get(codigoConsulta));

        estoque.put(203, 10);
        estoque.remove(206);
        System.out.println("Produto 206 cadastrado? " + estoque.containsKey(206));

        System.out.println("Estoque atualizado:");
        for (Map.Entry<Integer, Integer> item : estoque.entrySet()) {
            System.out.println("Código: " + item.getKey() + ", quantidade: " + item.getValue());
        }
    }
}
