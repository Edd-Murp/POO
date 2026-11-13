package Collections.Questão2.models;

import java.util.Objects;

public class Aluno {
    
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    //Sobrecarga do EQUALS sem isso o indexOf da List pega -1 e não A POSIÇÃO CORRETA
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno pessoa = (Aluno) o;
        return Objects.equals(nome, pessoa.nome);
    }
}
