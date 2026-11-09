package Parte1.models;

public class Professor extends Pessoa{
    
    private String disciplina;
    
    public Professor(String cpf, String nome, String disciplina) {
        super(cpf, nome);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
}
