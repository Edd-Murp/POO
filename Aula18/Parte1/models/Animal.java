package Parte1.models;

public class Animal implements Identificavel{

    private int identificacao;
    private String nome;

    public Animal(int identificacao, String nome) {
        this.identificacao = identificacao;
        this.nome = nome;
    }

    @Override
    public String getIdentificacao() {
       return String.valueOf(identificacao);
    }

    public int getIdentificacaoo() {
       return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        Animal outro = (Animal) obj;
        if (identificacao == outro.getIdentificacaoo()) {
            return true;   
        }else{
            return false;
        }
    }
    
    
}
