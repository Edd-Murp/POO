package Parte2;

import java.util.ArrayList;

import Parte2.models.Aluno;
import Parte2.repositories.AlunoRepository;

public class Main {
    public static void main(String[] args) {
        AlunoRepository a = new AlunoRepository();
        ArrayList<Aluno> alunos = a.getAlunos();
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
