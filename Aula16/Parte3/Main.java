package Parte3;

import Parte3.Utils.ArquivoRepositorio;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = new byte[] { 10, 20, 30 };
        ArquivoRepositorio arquivoRepositorio = new ArquivoRepositorio();
        String caminho = "Parte3";
        arquivoRepositorio.gravarArquivo(caminho);
        arquivoRepositorio.lerArquivo(caminho);
        arquivoRepositorio.copiarArquivo(caminho, caminho);
        arquivoRepositorio.adicionarBytes(caminho);
        arquivoRepositorio.lerEmBlocos(caminho);
        arquivoRepositorio.armazenarEFazerBackup(caminho, bytes);
    }
}
