package Parte2.Utils;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ModificadorDeArquivo {
    
    public void gravarTexto(String caminho, String texto) {
        File arquivo = new File(caminho);
        PrintWriter printWriter = null;
        try {
                if (!arquivo.exists()) {
                    arquivo.createNewFile();
                }
                FileOutputStream outputStream = new FileOutputStream(arquivo, true); // 'true' para adicionar ao final do arquivo
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                printWriter = new PrintWriter(dataOutputStream);
                printWriter.println(texto);
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                if (printWriter != null) {
                    printWriter.close();
                }
            }
    }

    public void lerTexto(String caminho){
        Scanner scanner = null;
        try {
            File arquivo = new File(caminho);
            if (!arquivo.exists()) {
                System.out.println("O arquivo não existe.");
                return;
            }

            scanner = new Scanner(arquivo);
            while (scanner.hasNext()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            scanner.close();
        }
    }

    public void adicionarTexto(String caminho, String texto){
        File file = new File(caminho);
        FileOutputStream fis = null;
        PrintWriter printWriter = null;
        try {
            fis = new FileOutputStream(file, true);
            printWriter = new PrintWriter(fis);
            printWriter.println(texto);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }

    public void gravarProdutoFormatado(String caminho, String nome, double preco, int quantidade){
        File file = new File(caminho);
        FileOutputStream fos = null;
        PrintWriter print = null;
        try {
            fos = new FileOutputStream(file, true);
            print = new PrintWriter(fos);
            print.println(nome+";"+preco+";"+quantidade);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            print.close();
        }
    }

    public void pesquisarTermo(String caminho, String termo){
        File file = new File(caminho);
        boolean encontrado = false;
        try (Scanner scanner = new Scanner(file)) {
            int numeroLinha = 1;
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.contains(termo)) {
                    System.out.println("O termo '" + termo + "' foi encontrado na linha " + numeroLinha);
                    encontrado = true;
                }
                numeroLinha++;
            }
            if (!encontrado) {
                System.out.println("O termo '" + termo + "' não foi encontrado.");
            } 
        } catch (Exception e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}

