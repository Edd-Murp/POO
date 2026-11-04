package Parte2;

import Parte2.Utils.ModificadorDeArquivo;

public class Main {
    public static void main(String[] args) {
        ModificadorDeArquivo modificador = new ModificadorDeArquivo();
        modificador.gravarTexto("Parte2\\arquivo.txt", "Olá, mundo!");
        modificador.gravarProdutoFormatado("Parte2\\arquivo.txt", "Teclado", 2000, 1);
        modificador.gravarProdutoFormatado("Parte2\\arquivo.txt", "Mouse", 79.90, 1);
        modificador.gravarProdutoFormatado("Parte2\\arquivo.txt", "Monitor", 899.90, 1);
        modificador.lerTexto("Parte2\\arquivo.txt");
        modificador.pesquisarTermo("Parte2\\arquivo.txt", "Monitor");
    }
}
