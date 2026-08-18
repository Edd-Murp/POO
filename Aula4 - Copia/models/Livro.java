package models;

public class Livro {

    public String titulo;
    public Pessoa autor;
    public int numPag;
    public int anoPubli;
    
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
    
}