package models;

public class Pessoa {
    
    private String nome;
    private int idade;
    private double altura;
    private boolean maiorDeIdade;
    
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
        return maiorDeIdade;
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
    
    
    //Metódos Customizados
    public String msg(String nome, int idade) {
        String msg = nome + " possui " + idade + " anos.";
        return msg;
    }

    public void aumentarIdade(){
        idade++;
    }
    
    
}
