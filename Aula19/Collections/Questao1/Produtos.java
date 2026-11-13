package Collections.Questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {
    
    private ArrayList<String> produtos;

    public Produtos(){
        produtos = new ArrayList<>();
    }

    public void rodar(){
        String produto = "";
        boolean tem = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione uma das opções: \n1.Adicionar 5 itens. \n2.Remover produto. \n3.Verificar produto. \n4.Exibir quantidade da lista. \n5.Apresentar produtos");
        String opcao = scan.nextLine();
        switch (opcao) {
            case "1":
                int cont = 1;
                System.out.println("");
                while (cont <= 5) {
                    System.out.println("Adicione o item n° " + cont + ":");
                    String item = scan.nextLine();
                    produtos.add(item);
                    cont++;
                }
                break;
                
            case "2":
                System.out.println("\nDigite o nome do produto: ");
                produto = scan.nextLine();
                tem = produtos.contains(produto);
                if (tem == true){
                    produtos.remove(produto);
                } else {
                    System.out.println("O produto não existe na lista.");
                }
                break;
            case "3":
                System.out.println("\nDigite o nome do produto: ");
                produto = scan.nextLine();
                tem = produtos.contains(produto);
                if (tem == true){
                    System.out.println("O produto existe na lista.");
                } else {
                    System.out.println("O produto não existe na lista.");
                }
                break;
            case "4":
                System.out.println("\nQuantidade de produtos na lista = " + produtos.size());
                break;
            case "5":
                System.out.println("\nProdutos na lista:");
                for (String p : produtos) {
                    System.out.println(p);
                }
                break;
            default:
                System.out.println("Escreva uma opção válida");
                scan.close();
                return;
        }
        scan.close();
    }
}
