package HashMap.Questao2;

import java.util.HashMap;
import java.util.Map;

import HashMap.Questao2.models.Aluno;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Aluno> alunos = new HashMap<>();
        alunos.put(2024001, new Aluno(2024001, "Ana"));
        alunos.put(2024002, new Aluno(2024002, "Bruno"));
        alunos.put(2024003, new Aluno(2024003, "Carla"));
        alunos.put(2024004, new Aluno(2024004, "Daniel"));
        alunos.put(2024005, new Aluno(2024005, "Elisa"));

        int matriculaConsulta = 2024003;
        Aluno aluno = alunos.get(matriculaConsulta);
        if (alunos.containsKey(matriculaConsulta)) {
            System.out.println("Aluno encontrado: " + aluno);
        } else {
            System.out.println("Aluno não encontrado para a matrícula " + matriculaConsulta);
        }

        int matriculaInexistente = 2024999;
        if (alunos.get(matriculaInexistente) == null) {
            System.out.println("Aluno não encontrado para a matrícula " + matriculaInexistente);
        }

        System.out.println("Alunos cadastrados:");
        for (Aluno cadastrado : alunos.values()) {
            System.out.println(cadastrado);
        }
    }
}
