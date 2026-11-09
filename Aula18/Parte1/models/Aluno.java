package Parte1.models;

public class Aluno extends Pessoa{

    private int matricula;

    public Aluno(String cpf, String nome, int matricula) {
        super(cpf, nome);
        this.matricula = matricula; 
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    
    
}
