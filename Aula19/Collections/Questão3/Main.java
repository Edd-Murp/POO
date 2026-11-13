package Collections.Questão3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //LinkedList
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Gerson");
        lista.add("Cleber");
        lista.add("Talita");
        lista.add("João");
        lista.add("Jones");

        lista.add(5,"Sergio");

        lista.remove(0);

        for (String c : lista) {
            System.out.println(c);
        }

        //ArrayList
        System.out.println("");
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Gerson");
        lista2.add("Cleber");
        lista2.add("Talita");
        lista2.add("João");
        lista2.add("Jones");

        lista2.add(5,"Sergio");

        lista2.remove(0);

        for (String c : lista) {
            System.out.println(c);
        }
    }
    
/*
 * DIFERENÇAS ENTRE ARRAYLIST E LINKEDLIST:
 *
 * 1. Estrutura Interna:
 *    - ArrayList: Usa um array dinâmico contínuo na memória.
 *    - LinkedList: Usa uma lista duplamente encadeada (nós com ponteiros para o anterior e o próximo).
 *
 * 2. Acesso por Índice (get):
 *    - ArrayList: Muito rápido O(1), acessa o índice diretamente.
 *    - LinkedList: Lento O(n), precisa percorrer os nós desde o início ou fim.
 *
 * 3. Inserção e Remoção (início ou meio):
 *    - ArrayList: Lento O(n), pois precisa deslocar os outros elementos na memória.
 *    - LinkedList: Rápido O(1), apenas altera as referências dos nós vizinhos.
 *
 * 4. Uso de Memória:
 *    - ArrayList: Consome menos memória (guarda apenas o dado).
 *    - LinkedList: Consome mais memória (guarda o dado + 2 ponteiros por item).
 *
 * RESUMO DE USO:
 * - Use ArrayList para leitura frequente e acesso rápido por índice (maioria dos casos).
 * - Use LinkedList para filas/pilhas ou quando houver muitas inserções/remoções nas pontas.
 */
}
