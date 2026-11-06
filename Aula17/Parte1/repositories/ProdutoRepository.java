package Parte1.repositories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Parte1.models.Produto;

public class ProdutoRepository {

    public void cadastrarProduto(String caminho, Produto produto) {
        File arquivo = new File(caminho + "Parte1/produtos.bin");
        try (FileOutputStream fos = new FileOutputStream(arquivo);
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(produto);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }
    }

    public void listarProdutos(String caminho) {
        File arquivo = new File(caminho + "Parte1/produtos.bin");
        if (!arquivo.exists()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(arquivo);
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            Produto produto = (Produto) ois.readObject();
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
            System.out.println("------------------------");

        } catch (Exception e) {
            System.out.println("Erro ao listar produtos: " + e.getMessage());
        }
    }

    public void pesquisarProdutoPorCodigo(String caminho, int codigo) {
        File arquivo = new File(caminho + "Parte1/produtos.bin");
        if (!arquivo.exists()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(arquivo);
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            Produto produto = (Produto) ois.readObject();
            if (produto.getCodigo() == codigo) {
                System.out.println("Código: " + produto.getCodigo());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
            } else {
                System.out.println("Produto não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar produto: " + e.getMessage());
        }
    }

    public void atualizarProduto(String caminho, Produto produtoAtualizado) {
        File arquivo = new File(caminho + "Parte1/produtos.bin");
        if (!arquivo.exists()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(arquivo);
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            Produto produto = (Produto) ois.readObject();
            if (produto.getCodigo() == produtoAtualizado.getCodigo()) {
                produto.setNome(produtoAtualizado.getNome());
                produto.setDescricao(produtoAtualizado.getDescricao());
                produto.setPreco(produtoAtualizado.getPreco());
                produto.setQuantidadeEmEstoque(produtoAtualizado.getQuantidadeEmEstoque());
                cadastrarProduto(caminho, produto);
                System.out.println("Produto atualizado com sucesso.");
            } else {
                System.out.println("Produto não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    public void atualizarProdutoEstoque(String caminho, int codigo, int novaQuantidade) {
        File arquivo = new File(caminho + "Parte1/produtos.bin");
        if (!arquivo.exists()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(arquivo);
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            Produto produto = (Produto) ois.readObject();
            if (produto.getCodigo() == codigo) {
                produto.setQuantidadeEmEstoque(novaQuantidade);
                cadastrarProduto(caminho, produto);
                System.out.println("Produto atualizado com sucesso.");
            } else {
                System.out.println("Produto não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    public void consultarProdutoAbaixo5Unidades(String caminho) {
        File arquivo = new File(caminho + "Parte1/produtos.bin");
        if (!arquivo.exists()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(arquivo);
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            Produto produto = (Produto) ois.readObject();
            if (produto.getQuantidadeEmEstoque() < 5) {
                System.out.println("Código: " + produto.getCodigo());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
                System.out.println("------------------------");
            } else {
                System.out.println("Nenhum produto com menos de 5 unidades em estoque.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produtos: " + e.getMessage());
        }
    }
}
