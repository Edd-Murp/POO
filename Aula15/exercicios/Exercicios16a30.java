package exercicios;

import java.io.IOException;

public final class Exercicios16a30 {
    private Exercicios16a30() {}

    public static void executarAntes21() {
        Questao16.executar();
        Questao17.executar();
        Questao18.executar();
        Questao19.executar();
        Questao20.executar();
    }

    public static void executarDepois21() {
        Questao22.executar();
        Questao23.executar();
        Questao24.executar();
        Questao25.executar();
        Questao26.executar();
        Questao27.executar();
        Questao28.executar();
        Questao29.executar();
        Questao30.executar();
    }

    public static void main(String[] args) {
        executarAntes21();
        try {
            Questao21.executar();
        } catch (IOException e) {
            System.out.println("Falha tratada no método main: " + e.getMessage());
        }
        executarDepois21();
    }
}
