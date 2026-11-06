package Parte1.repositories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Parte1.models.Cliente;

public class ClienteRepository {

    public void cadastrarCliente(String caminho, Cliente cliente) {
        File file = new File(caminho + "clientes.bin");
        File pasta = file.getParentFile();
        if (pasta != null && !pasta.exists()) {
            pasta.mkdirs();
        }

        ArrayList<Cliente> clientes = file.exists() ? lerClientes(caminho) : new ArrayList<>();
        clientes.add(cliente);

        try (FileOutputStream fos = new FileOutputStream(file, false);
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(clientes);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }

    public ArrayList<Cliente> lerClientes(String caminho) {
        File file = new File(caminho + "clientes.bin");

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            Object obj = ois.readObject();
            if (obj instanceof ArrayList<?>) {
                return (ArrayList<Cliente>) obj;
            }
            return new ArrayList<>();
        } catch (Exception e) {
            System.out.println("Erro ao ler clientes: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void listarClientes(String caminho) {
        ArrayList<Cliente> clientes = lerClientes(caminho);
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Código: " + cliente.getCodigo());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("------------------------");
        }
    }

    public void buscarClientePorCodigo(String caminho, int codigo) {
        ArrayList<Cliente> clientes = lerClientes(caminho);
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Código: " + cliente.getCodigo());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("------------------------");
                return;
            }
        }
        System.out.println("Cliente com código " + codigo + " não encontrado.");
    }

    public void verificarClientePorCPF(String caminho, String cpf) {
        ArrayList<Cliente> clientes = lerClientes(caminho);
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente com CPF " + cpf + " encontrado:");
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("Código: " + cliente.getCodigo());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("------------------------");
                return;
            }
        }
        System.out.println("Cliente com CPF " + cpf + " não encontrado.");
    }

    public void exibirQuantidadeClientes(String caminho) {
        ArrayList<Cliente> clientes = lerClientes(caminho);
        System.out.println("Quantidade de clientes cadastrados: " + clientes.size());
    }
}
