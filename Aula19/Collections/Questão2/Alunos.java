package Collections.Questão2;

import java.util.ArrayList;
import java.util.List;

import Collections.Questão2.models.Aluno;

public class Alunos {
    public static void main(String[] args) {
        
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Cleber"));
        alunos.add(new Aluno("Gerson"));
        alunos.add(new Aluno("Talita"));
        alunos.add(new Aluno("João"));
        alunos.add(new Aluno("Jones"));
        alunos.add(new Aluno("Marcelo"));

        System.out.println("Aluno na 3ª posição: " + alunos.get(2).getNome());

        System.out.println("\nAluno antes da alteração: " + alunos.get(0).getNome());
        alunos.set(0, new Aluno("Cleberson"));
        System.out.println("Aluno depois da alteração: " + alunos.get(0).getNome());
    
        int posicao = alunos.indexOf(new Aluno("Talita"));
        System.out.println("\nTalita está na posição " + posicao + ".");
    
        System.out.println("Removendo Jones da lista");
        alunos.remove(4);
        System.out.println("");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

}
