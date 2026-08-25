package models;

public class Fabricante {
    
    private String nome;
    private String pais;


    public Fabricante(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }
    
    //Getter and Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
