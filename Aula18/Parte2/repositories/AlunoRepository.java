package Parte2.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Parte2.models.Aluno;

public class AlunoRepository {

    public ArrayList<Aluno> getAlunos() {
        File file = new File("Parte2/data/alunos.csv");
        ArrayList<Aluno> alunos = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);

            boolean primeiraLinha = false;
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (!primeiraLinha) {
                    primeiraLinha = true;
                    continue;
                }
                String[] parts = line.split(",");
                Aluno aluno = new Aluno();
                aluno.setMatricula(Integer.parseInt(parts[0]));
                aluno.setNome(parts[1]);
                aluno.setCurso(parts[2]);
                aluno.setIdade(Integer.parseInt(parts[3].replace(";", "")));
                alunos.add(aluno);
            }
            scan.close();
            return alunos;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("Erro ao ler CSV: " + e.getMessage());
        }
        return new ArrayList<>();
    }
}
