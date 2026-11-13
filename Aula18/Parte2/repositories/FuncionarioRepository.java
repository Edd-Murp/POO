package Parte2.repositories;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import Parte2.models.Funcionario;

public class FuncionarioRepository {

    public ArrayList<Funcionario> getFuncionarios() {
        File file = new File("Parte2/data/funcionarios.csv");
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

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
                Funcionario f = new Funcionario();
                f.setMatricula(Integer.parseInt(parts[0]));
                f.setNome(parts[1]);
                f.setDepartamento(parts[2]);
                f.setSalario(Double.parseDouble(parts[3].replace(";", "")));
                funcionarios.add(f);
            }
            scan.close();
            return funcionarios;
        } catch (Exception e) {
            System.out.println("Erro ao ler funcionarios.csv: " + e.getMessage());
            return new ArrayList<>();
        }

    }
}
