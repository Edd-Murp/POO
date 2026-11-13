package Parte2;

import java.util.ArrayList;

import Parte2.models.Produto;
import Parte2.models.Aluno;
import Parte2.models.Funcionario;
import Parte2.repositories.AlunoRepository;
import Parte2.repositories.FuncionarioRepository;
import Parte2.repositories.ProdutoRepository;

public class Main {
    public static void main(String[] args) {
        AlunoRepository a = new AlunoRepository();
        ArrayList<Aluno> alunos = a.getAlunos();
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    
        ProdutoRepository produtoRepository = new ProdutoRepository();
        ArrayList<Produto> b = produtoRepository.getProdutos();
        for (Produto produto : b) {
            System.out.println("\nCódigo: "+ produto.getCodigo());
            System.out.println("Preço: "+ produto.getPreco());
            System.out.println("Descrição: "+ produto.getDescricao());
        }

        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        ArrayList<Funcionario> f = funcionarioRepository.getFuncionarios();
        for (Funcionario funcionario : f) {
            if (funcionario.getDepartamento().equals("TI")) {
                System.out.println("");
                System.out.println(funcionario);
            }
        }

        
    }
}
