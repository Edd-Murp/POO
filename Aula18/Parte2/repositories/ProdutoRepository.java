package Parte2.repositories;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import Parte2.models.Produto;

public class ProdutoRepository {
    
    public ArrayList<Produto> getProdutos(){
        File file = new File("Parte2/data/produtos.csv");
        ArrayList<Produto> produtos = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);
            boolean primeiraLinha = false;
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (!primeiraLinha) {
                    primeiraLinha = true;
                    continue;
                }
                String[] parts = line.split(",");
                Produto produto = new Produto();
                produto.setCodigo(Integer.parseInt(parts[0]));
                produto.setDescricao(parts[1]);
                produto.setPreco(Double.parseDouble(parts[2]));
                produto.setQuantidade(Integer.parseInt(parts[3].replace(";", "")));
                produtos.add(produto);
            }
            scan.close();
            return produtos;
        } catch (Exception e) {
            System.out.println("Erro ao ler os Produtos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
