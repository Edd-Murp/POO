package Parte3.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ArquivoRepositorio {
    
    public void gravarArquivo(String caminho) {
       File arquivo = new File(caminho + "//dados.dat");
       FileOutputStream fos = null;
       int[] valores = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74}; // Valores a serem gravados no arquivo
       if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
                System.out.println("Arquivo criado com sucesso: " + arquivo.getAbsolutePath());
            } catch (Exception e) {
                System.out.println("Erro ao criar o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("O arquivo já existe: " + arquivo.getAbsolutePath());
        }
        
        try {
            fos = new FileOutputStream(arquivo); // 'true' para adicionar ao final do arquivo
            for (int valor : valores) {
                fos.write(valor);
            }

        } catch (Exception e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        }finally{
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
        
    }

    public void lerArquivo(String caminho){
        File arquivo = new File(caminho + "//dados.dat");
        try (FileInputStream fis = new FileInputStream(arquivo)) {
            int dado;
            while ((dado = fis.read()) != -1) {
                System.out.println( dado );
            }
        }catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void copiarArquivo(String caminhoOrigem, String caminhoDestino) {
        File arquivoOrigem = new File(caminhoOrigem + "//dados.dat");
        File arquivoDestino = new File(caminhoDestino + "//dados_copia.dat");
        try (FileInputStream fis = new FileInputStream(arquivoOrigem);
             FileOutputStream fos = new FileOutputStream(arquivoDestino)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Arquivo copiado com sucesso para: " + arquivoDestino.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }

    public void adicionarBytes(String caminho){
        File arquivo = new File(caminho + "//dados.dat");
        try (FileOutputStream fos = new FileOutputStream(arquivo, true)) { // 'true' para adicionar ao final do arquivo
            byte[] bytesParaAdicionar = {70, 71, 72}; // Bytes a serem adicionados
            fos.write(bytesParaAdicionar);
            System.out.println("Bytes adicionados com sucesso ao arquivo: " + arquivo.getAbsolutePath());
            lerArquivo(caminho); // Ler o arquivo após adicionar os bytes
        } catch (Exception e) {
            System.out.println("Erro ao adicionar bytes ao arquivo: " + e.getMessage());
        }
    }

    public void lerEmBlocos(String caminho){
    
        File arquivo = new File(caminho + File.separator + "dados.dat");
        byte[] buffer = new byte[4];
        int bloco = 1;

        try (FileInputStream fis = new FileInputStream(arquivo)) {
            int bytesLidos;

            while ((bytesLidos = fis.read(buffer)) != -1) {
                System.out.print("Bloco lido " + bloco + ": ");
            
                for (int i = 0; i < bytesLidos; i++) {
                    System.out.print(buffer[i] + " ");
                }
                System.out.println();
            
                bloco++;
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo em blocos: " + e.getMessage());
        }
    }

    public void armazenarEFazerBackup(String caminho, byte[] dados){
        File arquivo = new File(caminho + File.separator + "dados.dat");
        File arquivoBackup = new File(caminho + File.separator + "dados_backup.dat");
        long tamanhoDados = 0;
        long tamanhoBackup = 0;

        try (FileOutputStream fos = new FileOutputStream(arquivo)) {
            fos.write(dados);
            System.out.println("Dados armazenados com sucesso no arquivo: " + arquivo.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Erro ao armazenar dados no arquivo: " + e.getMessage());
        }

        try (FileOutputStream fosBackup = new FileOutputStream(arquivoBackup)) {
            try(FileInputStream fis = new FileInputStream(arquivo)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    fosBackup.write(buffer, 0, bytesRead);
                    tamanhoBackup += bytesRead;
                }
            }
            System.out.println("Backup criado com sucesso no arquivo: " + arquivoBackup.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Erro ao criar backup do arquivo: " + e.getMessage());
        }
        tamanhoDados = arquivo.length();
        tamanhoBackup = arquivoBackup.length();
        System.out.println("Tamanho do arquivo original: " + tamanhoDados + " bytes");
        System.out.println("Tamanho do arquivo de backup: " + tamanhoBackup + " bytes");
        if (tamanhoDados == tamanhoBackup) {
            System.out.println("O backup foi realizado com sucesso. Os tamanhos são iguais.");
        } else {
            System.out.println("O backup não foi realizado corretamente. Os tamanhos são diferentes.");
        }

    }
}
