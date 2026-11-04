package exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public final class Questao21 {
    private Questao21() {}

    public static class ArquivoConfiguracao {
        private final Path caminho;

        public ArquivoConfiguracao(Path caminho) { this.caminho = caminho; }

        public String carregar() throws IOException {
            return new String(Files.readAllBytes(caminho), StandardCharsets.UTF_8);
        }

        public String carregarConfiguracoes() throws IOException {
            return carregar();
        }
    }

    public static void executar() throws IOException {
        System.out.println("\n=== Questão 21 - Exceções verificadas ===");
        String configuracao = new ArquivoConfiguracao(Paths.get("configuracao.properties"))
                .carregarConfiguracoes();
        System.out.println(configuracao);
    }
}
