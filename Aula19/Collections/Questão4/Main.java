package Collections.Questão4;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("São Paulo");
        lista.add("Rio de Janeiro");
        lista.add("Belo Horizonte");
        lista.add("Curitiba");
        lista.add("Porto Alegre");
        lista.add("Recife");
        lista.add("Salvador");
        lista.add("Fortaleza");

        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String cidade = iterator.next();
            if (cidade.startsWith("S")) {
                iterator.remove();
            }
        }

        System.out.println("Cidades após as remoções: " + lista);
        System.out.println("A coleção está vazia? " + lista.isEmpty());
    }
}
