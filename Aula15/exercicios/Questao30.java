package exercicios;

import java.util.ArrayList;
import java.util.List;

public final class Questao30 {
    private Questao30() {}

    public static class MatriculaException extends Exception {
        public MatriculaException(String message) { super(message); }
    }

    public static class DisciplinaSemVagasException extends MatriculaException {
        public DisciplinaSemVagasException(String message) { super(message); }
    }

    public static class NotaInvalidaException extends IllegalArgumentException {
        public NotaInvalidaException(String message) { super(message); }
    }

    public interface Avaliavel {
        void lancarNota(double nota);
        double calcularMedia();
    }

    public abstract static class Pessoa {
        private final String nome;
        protected Pessoa(String nome) {
            if (nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Nome obrigatório.");
            this.nome = nome;
        }
        public String getNome() { return nome; }
    }

    public static class Aluno extends Pessoa {
        private final List<Matricula> matriculas = new ArrayList<>();
        public Aluno(String nome) { super(nome); }
        public List<Matricula> getMatriculas() { return new ArrayList<>(matriculas); }
    }

    public static class Professor extends Pessoa {
        public Professor(String nome) { super(nome); }
    }

    public static class Disciplina implements Avaliavel {
        private final String nome;
        private final Professor professor;
        private final int vagas;
        private final List<Matricula> matriculas = new ArrayList<>();
        private final List<Double> notas = new ArrayList<>();

        public Disciplina(String nome, Professor professor, int vagas) {
            if (nome == null || nome.trim().isEmpty() || professor == null || vagas < 0) {
                throw new IllegalArgumentException("Dados da disciplina inválidos.");
            }
            this.nome = nome;
            this.professor = professor;
            this.vagas = vagas;
        }
        public String getNome() { return nome; }
        @Override public void lancarNota(double nota) {
            if (!Double.isFinite(nota) || nota < 0 || nota > 10) {
                throw new NotaInvalidaException("A nota deve estar entre 0 e 10.");
            }
            notas.add(nota);
        }
        @Override public double calcularMedia() {
            return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        }
    }

    public static class Matricula {
        private final Aluno aluno;
        private final Disciplina disciplina;
        private Matricula(Aluno aluno, Disciplina disciplina) {
            this.aluno = aluno; this.disciplina = disciplina;
        }
    }

    public static class Universidade {
        public void matricular(Aluno aluno, Disciplina disciplina) throws MatriculaException {
            if (aluno == null || disciplina == null) throw new MatriculaException("Aluno e disciplina obrigatórios.");
            if (aluno.matriculas.stream().anyMatch(m -> m.disciplina == disciplina)) {
                throw new MatriculaException(aluno.getNome() + " já está matriculado em " + disciplina.nome + ".");
            }
            if (disciplina.matriculas.size() >= disciplina.vagas) {
                throw new DisciplinaSemVagasException("Disciplina sem vagas: " + disciplina.nome);
            }
            Matricula matricula = new Matricula(aluno, disciplina);
            aluno.matriculas.add(matricula);
            disciplina.matriculas.add(matricula);
        }

        public void matricularContinuando(Aluno aluno, List<Disciplina> disciplinas) {
            for (Disciplina disciplina : disciplinas) {
                try {
                    matricular(aluno, disciplina);
                    System.out.println(aluno.getNome() + " matriculado em " + disciplina.getNome());
                } catch (DisciplinaSemVagasException e) {
                    System.out.println("Sem vagas: " + e.getMessage());
                } catch (MatriculaException e) {
                    System.out.println("Matrícula inválida: " + e.getMessage());
                } finally {
                    System.out.println("Tentativa de matrícula finalizada.");
                }
            }
        }
    }

    public static void executar() {
        System.out.println("\n=== Questão 30 - Gestão acadêmica ===");
        Professor professor = new Professor("Marina");
        Disciplina poo = new Disciplina("POO", professor, 1);
        Disciplina semVagas = new Disciplina("Redes", professor, 0);
        Aluno aluno = new Aluno("Ivo");
        Universidade universidade = new Universidade();
        universidade.matricularContinuando(aluno, java.util.Arrays.asList(poo, poo, semVagas));
        try {
            poo.lancarNota(8.5);
            poo.lancarNota(12);
        } catch (NotaInvalidaException e) {
            System.out.println("Nota recusada: " + e.getMessage());
        } finally {
            System.out.println("Média atual de POO: " + poo.calcularMedia());
        }
    }
}
