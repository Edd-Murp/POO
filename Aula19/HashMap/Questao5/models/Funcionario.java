package HashMap.Questao5.models;

import java.util.Objects;

public class Funcionario {
    private final Integer matricula;
    private final String nome;

    public Funcionario(Integer matricula, String nome) {
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
    // Compara funcionários pela matrícula, não pela referência do objeto.
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }
        Funcionario outro = (Funcionario) objeto;
        return Objects.equals(matricula, outro.matricula);
    }

    @Override
    // Mantém o hash consistente com equals para buscas corretas no HashMap.
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
