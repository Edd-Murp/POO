package Parte1.models;

public class Alunos {
    private int matricula;
    private String nome;
    private String curso;
    
    public Alunos(int matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean equals(Alunos obj) {
        if (obj.getMatricula() == this.matricula) {
            return true;
        }else{
            return false;
        }
    }

    
}
