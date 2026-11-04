package Utils;

import java.io.File;

public class ArquivoRepositorio {
    
    public File criarDiretorio(String caminho) {
        File diretorio = new File(caminho);
        if(!diretorio.exists()){
            System.out.println("Diretório não existe. Criando diretório: " + caminho);
            diretorio.mkdirs();
        }else{
            System.out.println("Diretório já existe. Prosseguindo com caminho: " + caminho);
            if(!diretorio.isDirectory()){
                throw new IllegalArgumentException("O caminho fornecido não é um diretório válido: " + caminho);
            }

        }
        return diretorio;
    }


    public void listarArquivos(String caminho) {
        File diretorio = new File(caminho);
        File[] arquivos = diretorio.listFiles();
        if (arquivos == null || diretorio.isFile()) {
            throw new IllegalArgumentException("O caminho fornecido não é um diretório válido ou está vazio: " + caminho);
        }
        for (File file : arquivos) {
            if (file.isFile()) {
                System.out.println("\nArquivo encontrado: " 
                + file.getName() + "\nÉ arquivo? " + file.isFile() 
                + "\nTamanho:" + file.length() + " bytes\n");
            }if (file.isDirectory()) {
                System.out.println("\nDiretório encontrado: " 
                + file.getName() + "\nÉ diretorio? " + file.isDirectory());
            }
            
        } 
    }

    public void criarDiretoriosComEstruturaDefinida(String caminho){
        String[] subDiretorios = {"Alunos", "Disciplinas", "Documentos"};
        File diretorioPrincipal = criarDiretorio(caminho);
        
        for (String subDir : subDiretorios) {
            String caminhoCompleto = diretorioPrincipal.getPath() + File.separator + subDir;
            File subDiretorio = new File(caminhoCompleto);
            subDiretorio.mkdirs();
            System.out.println("Subdiretório criado: " + subDiretorio.getPath());
        }
    }

    public void renomearArquivo(String caminho, String novoNome){
        File arquivo = new File(caminho);
        if(arquivo.exists() && arquivo.isFile()){
            String novoCaminho = arquivo.getParentFile().getPath() + File.separator + novoNome;
            File novoArquivo = new File(novoCaminho);
            boolean renomeado = arquivo.renameTo(novoArquivo);
            if(renomeado){
                System.out.println("Arquivo renomeado com sucesso para: " + novoArquivo.getPath());
            }else{
                System.out.println("Falha ao renomear o arquivo: " + arquivo.getPath());
            }
        }
    }


    public void deletarArquivo(String caminho){
        File arquivo = new File(caminho);
        if(arquivo.exists() && arquivo.isFile()){
            boolean deletado = arquivo.delete();
            if(deletado){
                System.out.println("Arquivo deletado com sucesso: " + arquivo.getPath());
            }else{
                System.out.println("Falha ao deletar o arquivo: " + arquivo.getPath());
            }
        }
    }

    public void deletarDiretorio(String caminho){
        File diretorio = new File(caminho);
        if(diretorio.exists() && diretorio.isDirectory() && diretorio.listFiles().length == 0){
            boolean deletado = diretorio.delete();
            if(deletado){
                System.out.println("Diretório deletado com sucesso: " + diretorio.getPath());
            }else{
                System.out.println("Falha ao deletar o diretório: " + diretorio.getPath());
            }
        }else{
            System.out.println("Falha ao deletar o diretório: " + diretorio.getPath() + ". O diretório não existe, não é um diretório válido ou não está vazio.");
        }
    }

    public long obterTamanhoArquivo(String caminho){
        File arquivo = new File(caminho);
        if(arquivo.exists() && arquivo.isFile()){
            return arquivo.length();
        }else{
            throw new IllegalArgumentException("O caminho fornecido não é um arquivo válido: " + caminho);
        }
    }
}
