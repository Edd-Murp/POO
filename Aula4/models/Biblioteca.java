package models;
public class Biblioteca {
    
    public Pessoa autor;
    public Livro livro;
    public Emprestimo emprestimo;
    
    
    public Pessoa getAutor() {
        return autor;
    }
    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    
}
