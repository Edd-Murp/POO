package Parte1.repositories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Parte1.models.ContaBancaria;

public class ContaBancariaRepository {
    private ArrayList<ContaBancaria> contas;

    public ContaBancariaRepository() {
        this.contas = new ArrayList<>();
    }

    private void salvarContas() {
        File file = new File("Parte1/contas.bin");
        try (FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(contas);
        } catch (Exception e) {
            System.out.println("Erro ao salvar contas: " + e.getMessage());
        }
    }

    public void cadastrarConta(String caminho, ContaBancaria conta) {
        File file = new File(caminho + "Parte1/contas.bin");
        obterListaContaBancaria();
        if (contas == null) {
            contas = new ArrayList<>();
        }
        contas.add(conta);
        try (FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(contas);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar conta: " + e.getMessage());
        }
    }

    public void obterListaContaBancaria() {
        File file = new File("Parte1/contas.bin");
        if (!file.exists()) {
            contas = new ArrayList<>();
            return;
        }

        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            contas = (ArrayList<ContaBancaria>) ois.readObject();
            if (contas == null) {
                contas = new ArrayList<>();
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar contas: " + e.getMessage());
            contas = new ArrayList<>();
        }
    }

    public void listarContas() {
        obterListaContaBancaria();
        for (ContaBancaria conta : contas) {
            System.out.println("Número Conta: " + conta.getNumeroConta());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("");
        }
    }

    public void consultarContaPorNumero(int numeroConta) {
        obterListaContaBancaria();
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                System.out.println("\nConta Encontrada:");
                System.out.println("Número Conta: " + conta.getNumeroConta());
                System.out.println("Agência: " + conta.getAgencia());
                System.out.println("Titular: " + conta.getTitular());
                System.out.println("Saldo: " + conta.getSaldo());
                System.out.println("");
                return;
            }
        }
        System.out.println("\nNenhuma conta encontrada.");
    }

    public void depositar(int numeroConta, double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        obterListaContaBancaria();
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                conta.setSaldo(conta.getSaldo() + valor);
                salvarContas();
                return;
            }
        }

        System.out.println("Conta não encontrada para depósito.");
    }

    public void saque(int numeroConta, double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        obterListaContaBancaria();
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                if (conta.getSaldo() < valor) {
                    System.out.println("Valor grande demais para sacar.\nValor máximo: " + conta.getSaldo());
                    return;
                }
                conta.setSaldo(conta.getSaldo() - valor);
                salvarContas();
                return;
            }
        }

        System.out.println("Conta não encontrada para saque.");
    }

    public void consultarSaldo(int numeroConta, double valor) {
        obterListaContaBancaria();
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                System.out.println("Valor do saldo da conta: " + conta.getSaldo());
                return;
            }
        }
        System.out.println("Conta não encontrada para consultar saldo.");
    }
}
