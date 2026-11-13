package HashMap.Questao2.models;

public class Aluno {
    private final Integer matricula;
    private final String nome;

    public Aluno(Integer matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", nome: " + nome;
    }
}
