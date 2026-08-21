package models;

public class Aluno{

    public Pessoa aluno;
    public int matricula;
    public double nota;
    public boolean aprovado;
    
    //Getter
    public Pessoa getAluno() {
        return aluno;
    }
    public int getMatricula() {
        return matricula;
    }
    public double getNota() {
        return nota;
    }
    public boolean isAprovado() {
        if (nota >= 7) {
            aprovado = true;
            return true;
        }else{
            aprovado = false;
            return false;
        }
    }

    //Setter
    public void setAluno(Pessoa aluno) {
        this.aluno = aluno;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
    //Custom
    public void aprovado(){
        aprovado = true;
    }
    public void desaprovado(){
        aprovado = false;
    }
    public String passou(){
        if (nota >= 7) {
            return  "aluno aprovado";
        }else{
            return  "aluno aprovado";
        }
    }
}