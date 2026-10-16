package models;

public class Aluno implements Identificavel {

    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String obterIdentificacao() {
        return matricula + " - " + nome;
    }
    
}
