package Collections.Questão5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> livros = new ArrayList<>();
        livros.add("Dom Casmurro");
        livros.add("O Cortiço");
        livros.add("Memórias Póstumas de Brás Cubas");
        livros.add("A Hora da Estrela");
        livros.add("O Guarani");
        livros.add("Iracema");
        livros.add("Capitães da Areia");
        livros.add("Vidas Secas");
        livros.add("O Hobbit");
        livros.add("1984");

        ArrayList<String> livrosSelecionados = new ArrayList<>();
        livrosSelecionados.add("Dom Casmurro");
        livrosSelecionados.add("O Hobbit");
        livrosSelecionados.add("1984");

        System.out.println("Todos os livros selecionados estão cadastrados? "
                + livros.containsAll(livrosSelecionados));

        ArrayList<String> novosLivros = new ArrayList<>();
        novosLivros.add("Ensaio sobre a Cegueira");
        novosLivros.add("A Revolução dos Bichos");
        livros.addAll(novosLivros);
        System.out.println("Livros após novos cadastros: " + livros);

        livros.retainAll(livrosSelecionados);
        System.out.println("Livros mantidos após retainAll: " + livros);
    }
}
