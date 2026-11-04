package Parte4;

import Parte4.Utils.ArquivoRepositorio;

public class Main {
    public static void main(String[] args) {
        ArquivoRepositorio arquivoRepositorio = new ArquivoRepositorio();
        arquivoRepositorio.gravarArquivo();
        arquivoRepositorio.lerArquivo();
        arquivoRepositorio.gravarProduto(new Parte4.models.Produto[]{
            new Parte4.models.Produto(1, "Produto 1", 10.0),
            new Parte4.models.Produto(2, "Produto 2", 20.0),
            new Parte4.models.Produto(3, "Produto 3", 30.0)
        });
        arquivoRepositorio.lerProduto();
        arquivoRepositorio.gravarAluno(new Parte4.models.Aluno[]{
            new Parte4.models.Aluno(1, "Aluno 1", 20),
            new Parte4.models.Aluno(2, "Aluno 2", 21),
            new Parte4.models.Aluno(3, "Aluno 3", 22)
        });
        arquivoRepositorio.gravarAluno(new Parte4.models.Aluno[]{
            new Parte4.models.Aluno(4, "Aluno 4", 23),
            new Parte4.models.Aluno(5, "Aluno 5", 24)
        });
        arquivoRepositorio.lerAluno();
        arquivoRepositorio.gravarFuncionario(1, "Funcionario 1", 1000.0, true);
        arquivoRepositorio.lerFuncionario();
        arquivoRepositorio.gravarRelatorio("Empresa 1", 100, 1000000.0, true, 2020);
        arquivoRepositorio.lerRelatorio();
    }
}
