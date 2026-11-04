package exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public final class Questao25 {
    private Questao25() {}

    public static class Processador {
        public void processar() throws Exception {
            System.out.println("Processando conteúdo.");
        }
    }

    public static class ProcessadorArquivo extends Processador {
        private final Path caminho;

        public ProcessadorArquivo(Path caminho) { this.caminho = caminho; }

        @Override
        public void processar() throws IOException {
            System.out.println("Arquivo processado: "
                    + new String(Files.readAllBytes(caminho), StandardCharsets.UTF_8));
        }
    }

    public static class ProcessadorTexto extends Processador {
        @Override
        public void processar() {
            System.out.println("Texto processado sem exceção verificada.");
        }
    }

    public static void executar() {
        System.out.println("\n=== Questão 25 - Exceções e sobrescrita ===");
        Processador[] processadores = {
                new ProcessadorArquivo(Paths.get("arquivo-processamento.txt")),
                new ProcessadorTexto()
        };
        for (Processador processador : processadores) {
            try {
                processador.processar();
            } catch (IOException e) {
                System.out.println("Falha ao processar arquivo: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Falha no processamento: " + e.getMessage());
            }
        }
        System.out.println("Uma sobrescrita pode restringir, mas não ampliar, exceções verificadas.");
    }
}
