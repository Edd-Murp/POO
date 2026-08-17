package models;

public class Livro {

    public String titulo;
    public Pessoa autor;
    public int numPag;
    public int anoPubli;
    
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
    
    public String getDesciption(Livro livro){
        String msg = "Título: " + livro.titulo + " | numPag: " + livro.numPag + " | ano: " + livro.anoPubli;
        return msg;
    }
    
}