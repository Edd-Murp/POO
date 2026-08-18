package models;

public class Pessoa {
    
    public String nome;
    public int idade;
    public double altura;
    public boolean maiorDeIdade;
    
    //Getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public boolean isMaiorDeIdade() {
        if(idade >= 18){return true;} else {return false;}
    }
    
    //Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setMaiorDeIdade(boolean maiorDeIdade) {
        this.maiorDeIdade = maiorDeIdade;
    }
    
    
    
    public String msg(String nome, int idade) {
        String msg = nome + " possui " + idade + " anos.";
        return msg;
    }

    public void aumentarIdade(){
        idade++;
    }
    
    
}
