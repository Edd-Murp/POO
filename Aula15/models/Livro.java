package models;

public class Livro {
    protected String titulo;
    protected boolean emprestado;

    public Livro(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título do livro inválido.");
        }
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() throws OperacaoBibliotecaException {
        if (emprestado) {
            throw new OperacaoBibliotecaException("Não é possível emprestar: o livro já está emprestado.");
        }
        emprestado = true;
    }

    public void devolver() throws OperacaoBibliotecaException {
        if (!emprestado) {
            throw new OperacaoBibliotecaException("Não é possível devolver: o livro não está emprestado.");
        }
        emprestado = false;
    }

    @Override
    public String toString() {
        return titulo + (emprestado ? " [emprestado]" : " [disponível]");
    }
}
