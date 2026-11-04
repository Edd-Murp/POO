import java.util.Scanner;

import Utils.ArquivoRepositorio;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a ação desejada (criar, listar, renomear, deletar, obter tamanho): ");
        String acao = scanner.nextLine();

        ArquivoRepositorio arquivoRepositorio = new ArquivoRepositorio();
        Boolean continuar = true;
        while (continuar) {
            switch (acao) {
                case "criar":
                    System.out.println("Digite o caminho do diretório a ser criado: ");
                    String caminho = scanner.nextLine();
                    arquivoRepositorio.criarDiretorio(caminho);
                    break;
                case "listar":
                    System.out.println("Digite o caminho do diretório a ser listado: ");
                    caminho = scanner.nextLine();
                    arquivoRepositorio.listarArquivos(caminho);
                    break;
                case "renomear":
                    System.out.println("Digite o caminho do arquivo a ser renomeado: ");
                    caminho = scanner.nextLine();
                    System.out.println("Digite o novo nome para o arquivo: ");
                    String novoNome = scanner.nextLine();
                    arquivoRepositorio.renomearArquivo(caminho, novoNome);
                    break;
                case "deletar":
                    System.out.println("Digite o caminho do arquivo ou diretório a ser deletado: ");
                    caminho = scanner.nextLine();
                    arquivoRepositorio.deletarArquivo(caminho);
                    break;
                case "obter tamanho":
                    System.out.println("Digite o caminho do arquivo: ");
                    caminho = scanner.nextLine();
                    long tamanho = arquivoRepositorio.obterTamanhoArquivo(caminho);
                    System.out.println("Tamanho do arquivo: " + tamanho + " bytes");
                    break;
                default:
                    System.out.println("Ação inválida.");
            }
            System.out.println("Deseja realizar outra ação? (sim/não): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("sim")) {
                continuar = false;
            } else {
                System.out.println("Digite a ação desejada (criar, listar, renomear, deletar, obter tamanho): ");
                acao = scanner.nextLine();
            }
        } 
        scanner.close();  
    }
}
