package exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public final class Questao19 {
    private Questao19() {}

    public static class Aluno {
        private final String nome;
        private final int idade;

        public Aluno(String nome, int idade) {
            if (nome == null || nome.trim().isEmpty() || idade <= 0) {
                throw new IllegalArgumentException("Nome e idade positiva são obrigatórios.");
            }
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public String toString() { return nome + " (" + idade + " anos)"; }
    }

    public static class ImportadorAlunos {
        public List<Aluno> importar(File arquivo) {
            List<Aluno> alunos = new ArrayList<>();
            try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                int numeroLinha = 0;
                while ((linha = leitor.readLine()) != null) {
                    numeroLinha++;
                    String[] campos = linha.split(",", -1);
                    try {
                        if (campos.length != 2) {
                            throw new IllegalArgumentException("Use o formato nome,idade.");
                        }
                        alunos.add(new Aluno(campos[0].trim(), Integer.parseInt(campos[1].trim())));
                    } catch (NumberFormatException e) {
                        System.out.println("Linha " + numeroLinha + " ignorada: idade inválida.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Linha " + numeroLinha + " ignorada: " + e.getMessage());
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não encontrado: " + arquivo);
            } catch (IOException e) {
                System.out.println("Erro ao ler arquivo: " + e.getMessage());
            }
            return alunos;
        }
    }

    public static void executar() {
        System.out.println("\n=== Questão 19 - Leitura de arquivos ===");
        File arquivo = null;
        try {
            arquivo = Files.createTempFile("alunos-aula15-", ".csv").toFile();
            Files.write(arquivo.toPath(),
                    java.util.Arrays.asList("Maria,20", "João,idade-inválida", ",18"),
                    StandardCharsets.UTF_8);
            System.out.println("Alunos importados: " + new ImportadorAlunos().importar(arquivo));
        } catch (IOException e) {
            System.out.println("Não foi possível preparar o arquivo de demonstração: " + e.getMessage());
        } finally {
            if (arquivo != null && arquivo.exists() && !arquivo.delete()) {
                System.out.println("Não foi possível remover o arquivo temporário: " + arquivo);
            }
        }
        System.out.println("try-with-resources fecha o leitor automaticamente, inclusive em caso de exceção.");
    }
}
