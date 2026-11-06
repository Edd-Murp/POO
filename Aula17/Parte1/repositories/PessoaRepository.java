package Parte1.repositories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Parte1.models.Pessoa;

public class PessoaRepository {

    public void cadastrarPessoa(String caminho, ArrayList<Pessoa> pessoas) {
        File file = new File(caminho + "pessoas.bin");
        try (FileOutputStream fos = new java.io.FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Pessoa pessoa : pessoas) {
                oos.writeObject(pessoa);
            }
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar pessoa: " + e.getMessage());
        }
    }

    public void lerPessoas(String caminho) {
        File file = new File(caminho + "pessoas.bin");
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    Pessoa pessoa = (Pessoa) ois.readObject();
                    System.out.println("Nome: " + pessoa.getNome());
                    System.out.println("Idade: " + pessoa.getIdade());
                    System.out.println("CPF: " + pessoa.getCPF());
                    System.out.println("Código: " + pessoa.getCodigo());
                    System.out.println("------------------------");
                } catch (Exception e) {
                    System.out.println("Acabou a leitura do arquivo.");
                    break;
                }
            }
            }catch (Exception e) {
            System.out.println("Erro ao ler pessoas: " + e.getMessage());
        }

    }

    public void buscarPessoaPorCodigo(String caminho, int codigo) {
        File file = new File(caminho + "pessoas.bin");
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    Pessoa pessoa = (Pessoa) ois.readObject();
                    if (pessoa.getCodigo() == codigo) {
                        System.out.println("Nome: " + pessoa.getNome());
                        System.out.println("Idade: " + pessoa.getIdade());
                        System.out.println("CPF: " + pessoa.getCPF());
                        System.out.println("Código: " + pessoa.getCodigo());
                        System.out.println("------------------------");
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("Acabou a leitura do arquivo.");
                    break;
                }
            }
            System.out.println("Pessoa com código " + codigo + " não encontrada.");
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void buscarPessoaPorCPF(String caminho, String CPF) {
        File file = new File(caminho + "pessoas.bin");
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    Pessoa pessoa = (Pessoa) ois.readObject();
                    if (pessoa.getCPF().equals(CPF)) {
                        System.out.println("Nome: " + pessoa.getNome());
                        System.out.println("Idade: " + pessoa.getIdade());
                        System.out.println("CPF: " + pessoa.getCPF());
                        System.out.println("Código: " + pessoa.getCodigo());
                        System.out.println("------------------------");
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("Acabou a leitura do arquivo.");
                    break;
                }
            }
            System.out.println("Pessoa com CPF " + CPF + " não encontrada.");
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
