package exercicios;

import java.util.ArrayList;
import java.util.List;

public final class Questao18 {
    private Questao18() {}

    public static class Aluno {
        private final String nome;
        private final List<Matricula> matriculas = new ArrayList<>();

        public Aluno(String nome) {
            if (nome == null || nome.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome do aluno obrigatório.");
            }
            this.nome = nome;
        }

        public String getNome() { return nome; }
        public List<Matricula> getMatriculas() { return new ArrayList<>(matriculas); }
    }

    public static class Disciplina {
        private final String nome;
        private final int vagas;
        private final List<Matricula> matriculas = new ArrayList<>();

        public Disciplina(String nome, int vagas) {
            if (nome == null || nome.trim().isEmpty() || vagas < 0) {
                throw new IllegalArgumentException("Nome obrigatório e vagas não negativas.");
            }
            this.nome = nome;
            this.vagas = vagas;
        }

        public String getNome() { return nome; }
        public int getVagas() { return vagas; }
        public List<Matricula> getMatriculas() { return new ArrayList<>(matriculas); }
    }

    public static class Matricula {
        private final Aluno aluno;
        private final Disciplina disciplina;

        private Matricula(Aluno aluno, Disciplina disciplina) {
            this.aluno = aluno;
            this.disciplina = disciplina;
        }

        public static Matricula criar(Aluno aluno, Disciplina disciplina) throws MatriculaException {
            if (aluno == null || disciplina == null) {
                throw new MatriculaException("Aluno e disciplina são obrigatórios.");
            }
            if (aluno.matriculas.stream().anyMatch(m -> m.disciplina == disciplina)) {
                throw new MatriculaException("Aluno já matriculado em " + disciplina.getNome() + ".");
            }
            if (disciplina.matriculas.size() >= disciplina.vagas) {
                throw new MatriculaException("Não há vagas em " + disciplina.getNome() + ".");
            }
            Matricula matricula = new Matricula(aluno, disciplina);
            aluno.matriculas.add(matricula);
            disciplina.matriculas.add(matricula);
            return matricula;
        }

        public Aluno getAluno() { return aluno; }
        public Disciplina getDisciplina() { return disciplina; }
    }

    public static class MatriculaException extends Exception {
        public MatriculaException(String message) { super(message); }
    }

    public static void executar() {
        System.out.println("\n=== Questão 18 - Matrícula acadêmica ===");
        Aluno aluno = new Aluno("Lucas");
        Disciplina vagas = new Disciplina("POO", 1);
        Disciplina lotada = new Disciplina("Banco de dados", 0);
        List<Disciplina> tentativas = java.util.Arrays.asList(vagas, vagas, lotada);
        for (Disciplina disciplina : tentativas) {
            try {
                Matricula.criar(aluno, disciplina);
                System.out.println(aluno.getNome() + " matriculado em " + disciplina.getNome());
            } catch (MatriculaException e) {
                System.out.println("Matrícula recusada: " + e.getMessage());
            }
        }
    }
}
