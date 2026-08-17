package models;

public class Pessoa {
    
    public String nome;
    public int idade;
    public double altura;
    public boolean maiorDeIdade;
    
    
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
    
    public String msg(String nome, int idade) {
        String msg = nome + " possui " + idade + " anos.";
        return msg;
    }

    public void aumentarIdade(){
        idade++;
    }
    
    
}
