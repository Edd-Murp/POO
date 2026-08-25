package models;
public class Biblioteca {
    
    private Pessoa autor;
    private Livro livro;
    private Emprestimo emprestimo;
    private int totalLivrosEmprestados = 0;
    
    
    public Biblioteca() {
    }

    public Biblioteca(Pessoa autor, Livro livro, Emprestimo emprestimo, int totalLivrosEmprestados) {
        this.autor = autor;
        this.livro = livro;
        this.emprestimo = emprestimo;
        this.totalLivrosEmprestados = totalLivrosEmprestados;
        totalLivrosEmprestados++;
    }
    //Getter and Setter
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
    public int getTotalLivrosEmprestados() {
        return totalLivrosEmprestados;
    }
    public void setTotalLivrosEmprestados(int totalLivrosEmprestados) {
        this.totalLivrosEmprestados = totalLivrosEmprestados;
    }
    
    
}
