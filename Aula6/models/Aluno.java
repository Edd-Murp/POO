package models;

public class Aluno{

    private Pessoa aluno;
    private int matricula;
    private double nota;
    private boolean aprovado;
    private String curso;
    

    public Aluno(Pessoa aluno, int matricula, String curso) {
        this.aluno = aluno;
        this.matricula = matricula;
        this.curso = curso;
    }
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
        return aprovado;
    }
    public String getCurso() {
        return curso;
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
    public void setCurso(String curso) {
        this.curso = curso;
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