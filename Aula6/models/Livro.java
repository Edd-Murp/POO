package models;

public class Livro {

    private String titulo;
    private Pessoa autor;
    private int numPag;
    private int anoPubli;
    private String status;
    private Pessoa pessoa;


    public Livro(String titulo, Pessoa autor, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, Pessoa autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }
    public Pessoa getAutor() {
        return autor;
    }
    public int getNumPag() {
        return numPag;
    }
    public int getAnoPubli() {
        return anoPubli;
    }
    
    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }
    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }
    public String getDesciption(Livro livro){
        String msg = "Título: " + livro.titulo + " | numPag: " + livro.numPag + " | ano: " + livro.anoPubli;
        return msg;
    }
    
    public void emprestar() {
        this.status = "Emprestado";
    }
    public void emprestar(Pessoa pessoa) {
        this.status = "Emprestado";
        this.pessoa = pessoa;
    }

}