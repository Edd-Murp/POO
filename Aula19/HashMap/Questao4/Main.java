package HashMap.Questao4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> notas = new HashMap<>();
        notas.put("Ana", 8.5);
        notas.put("Bruno", 7.0);
        notas.put("Carla", 9.2);
        notas.put("Daniel", 6.8);
        notas.put("Elisa", 8.0);

        Map<String, Double> novasNotas = new HashMap<>();
        novasNotas.put("Felipe", 7.5);
        novasNotas.put("Gabriela", 9.0);
        novasNotas.put("Heitor", 6.5);
        notas.putAll(novasNotas);

        double soma = 0;
        for (Double nota : notas.values()) {
            soma += nota;
        }
        double media = soma / notas.size();
        System.out.println("Média da turma: " + media);

        System.out.println("Alunos e notas:");
        for (Map.Entry<String, Double> entrada : notas.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        String alunoRemovido = "Daniel";
        notas.remove(alunoRemovido);
        System.out.println("Nota removida para " + alunoRemovido + ". Alunos restantes: " + notas);
    }
}
