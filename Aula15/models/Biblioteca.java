package models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        if (livro == null) {
            throw new IllegalArgumentException("Livro inválido.");
        }
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) throws OperacaoBibliotecaException {
        Livro livro = buscarLivro(titulo);
        livro.emprestar();
    }

    public void devolverLivro(String titulo) throws OperacaoBibliotecaException {
        Livro livro = buscarLivro(titulo);
        livro.devolver();
    }

    private Livro buscarLivro(String titulo) throws OperacaoBibliotecaException {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new OperacaoBibliotecaException("Título inválido.");
        }

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }

        throw new OperacaoBibliotecaException("Livro não encontrado na biblioteca.");
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
