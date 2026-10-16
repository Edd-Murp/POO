package models;

public class Livro implements Emprestavel {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro '" + titulo + "' emprestado com sucesso.");
        } else {
            System.out.println("Livro '" + titulo + "' já está emprestado.");
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro '" + titulo + "' devolvido com sucesso.");
        } else {
            System.out.println("Livro '" + titulo + "' não estava emprestado.");
        }
    }

    @Override
    public boolean estaEmprestado() {
        return emprestado;
    }
    
}
