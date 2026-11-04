package exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public final class Questao28 {
    private Questao28() {}

    public static class Aluno {
        private final String nome;
        private final int idade;
        public Aluno(String nome, int idade) {
            if (nome == null || nome.trim().isEmpty() || idade <= 0) {
                throw new IllegalArgumentException("Nome ou idade inválidos.");
            }
            this.nome = nome;
            this.idade = idade;
        }
        @Override public String toString() { return nome + " (" + idade + ")"; }
    }

    public static class RelatorioImportacao {
        private final List<Aluno> alunos = new ArrayList<>();
        private final List<String> erros = new ArrayList<>();
        public void adicionar(Aluno aluno) { alunos.add(aluno); }
        public void adicionarErro(String erro) { erros.add(erro); }
        public int getImportados() { return alunos.size(); }
        public int getFalhas() { return erros.size(); }
        public List<Aluno> getAlunos() { return new ArrayList<>(alunos); }
        public List<String> getErros() { return new ArrayList<>(erros); }
    }

    public interface FormatoImportacao {
        Aluno converter(String linha);
    }

    public static class FormatoCsv implements FormatoImportacao {
        @Override public Aluno converter(String linha) {
            String[] campos = linha.split(",", -1);
            if (campos.length != 2) throw new IllegalArgumentException("Esperado nome,idade.");
            return new Aluno(campos[0].trim(), Integer.parseInt(campos[1].trim()));
        }
    }

    public static class Importador {
        public RelatorioImportacao importar(File arquivo, FormatoImportacao formato) {
            RelatorioImportacao relatorio = new RelatorioImportacao();
            if (formato == null) {
                relatorio.adicionarErro("Formato de importação não informado.");
                return relatorio;
            }
            if (arquivo == null) {
                relatorio.adicionarErro("Arquivo não informado.");
                return relatorio;
            }
            try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                int numero = 0;
                while ((linha = leitor.readLine()) != null) {
                    numero++;
                    try {
                        relatorio.adicionar(formato.converter(linha));
                    } catch (NumberFormatException e) {
                        relatorio.adicionarErro("Linha " + numero + ": idade inválida.");
                    } catch (IllegalArgumentException e) {
                        relatorio.adicionarErro("Linha " + numero + ": " + e.getMessage());
                    }
                }
            } catch (FileNotFoundException e) {
                relatorio.adicionarErro("Arquivo não encontrado: " + arquivo);
            } catch (IOException e) {
                relatorio.adicionarErro("Erro de leitura: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                relatorio.adicionarErro("Caminho de arquivo inválido: " + e.getMessage());
            }
            return relatorio;
        }
    }

    public static void executar() {
        System.out.println("\n=== Questão 28 - Importação com relatório de erros ===");
        File arquivo = null;
        try {
            arquivo = java.nio.file.Files.createTempFile("importacao-aula15-", ".csv").toFile();
            java.nio.file.Files.write(arquivo.toPath(),
                    java.util.Arrays.asList("Nina,19", "Leo,abc", ",20"),
                    StandardCharsets.UTF_8);
            RelatorioImportacao relatorio = new Importador().importar(arquivo, new FormatoCsv());
            relatorio.getErros().forEach(System.out::println);
            System.out.println("Importados: " + relatorio.getImportados() + "; falhas: " + relatorio.getFalhas());
        } catch (IOException e) {
            System.out.println("Falha na demonstração: " + e.getMessage());
        } finally {
            if (arquivo != null && arquivo.exists() && !arquivo.delete()) {
                System.out.println("Não foi possível remover o arquivo temporário: " + arquivo);
            }
        }
    }
}
