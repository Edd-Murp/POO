package Parte1;

import java.io.File;
import java.util.ArrayList;

import Parte1.models.*;
import Parte1.repositories.*;

public class Main {
    public static void main(String[] args) {
        // Exercicio 1
        // PessoaRepository pessoaRepository = new PessoaRepository();
        // ArrayList<Pessoa> pessoas = new ArrayList<>();
        // Pessoa pessoa1 = new Pessoa("João", 25, 1, "123.456.789-00");
        // Pessoa pessoa2 = new Pessoa("Maria", 30, 2, "987.654.321-00");
        // pessoas.add(pessoa1);
        // pessoas.add(pessoa2);
        // pessoaRepository.cadastrarPessoa("Parte1/", pessoas);
        // System.out.println("Pessoas cadastradas:");
        // pessoaRepository.lerPessoas("Parte1/");

        // Exercicio 2
        // ClienteRepository clienteRepository = new ClienteRepository();
        // Cliente cliente1 = new Cliente(1,"Carlos" , "123.456.789-00",
        // "carlos@email.com", "1234567890");
        // clienteRepository.cadastrarCliente("Parte1/", cliente1);
        // Cliente cliente2 = new Cliente(2,"Ana" , "987.654.321-00", "ana@email.com",
        // "0987654321");
        // clienteRepository.cadastrarCliente("Parte1/", cliente2);
        // System.out.println("Clientes cadastrados:");
        // clienteRepository.listarClientes("Parte1/");
        // clienteRepository.exibirQuantidadeClientes("Parte1/");

        //Exercício 3
        // FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        // Funcionario funcionario = new Funcionario(1, "Gerson", "123456", "Chefe", 1500);
        // funcionarioRepository.cadastrarFuncionario("", funcionario);
        // System.out.println("");
        // funcionarioRepository.calcularSomaDosFuncionarios("");
        // System.out.println("");
        // funcionarioRepository.listarFuncionarios("");
        // System.out.println("");
        // funcionarioRepository.consultarFuncionarioPorCargo("", "Chefe");
        // System.out.println("");
        // funcionarioRepository.consultarFuncionarioPorMatricula("", 1);


        // Exercicio 4
        // ProdutoRepository produtoRepository = new ProdutoRepository();
        // Produto produto1 = new Produto(1, "Produto 1", "Descrição do Produto 1", 10.0, 5);
        // produtoRepository.cadastrarProduto("", produto1);
        // produtoRepository.listarProdutos("");
        // System.out.println("");
        // produtoRepository.pesquisarProdutoPorCodigo("", 1);
        // produtoRepository.atualizarProdutoEstoque("", 1, 100);
        // System.out.println("");
        // produtoRepository.listarProdutos("");
        // Produto produto2 = new Produto(1, "aa", "oi", 100, 100);
        // produtoRepository.atualizarProduto("", produto2);
        // System.out.println("");
        // produtoRepository.listarProdutos("");

        // Exercício 5
        System.out.println("=== Exercício 5 - Conta Bancária ===");
        File contasFile = new File("Parte1/contas.bin");
        if (contasFile.exists()) {
            contasFile.delete();
        }

        ContaBancariaRepository contaRepository = new ContaBancariaRepository();

        ContaBancaria conta1 = new ContaBancaria(1001, "001", "Ana", 500.0);
        contaRepository.cadastrarConta("", conta1);
        contaRepository.consultarContaPorNumero(1001);

        contaRepository.depositar(1001, 250.0);
        contaRepository.consultarSaldo(1001, 0);

        contaRepository.saque(1001, 100.0);
        contaRepository.consultarSaldo(1001, 0);

        contaRepository.listarContas();
    }
}
