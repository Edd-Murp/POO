import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1
        try {
            System.out.println("digite o nome:");
            String nome = scan.nextLine();
            System.out.println("Digite a idade:");
            String idade = scan.nextLine();
            int i = Integer.parseInt(idade);
            Aluno aluno = new Aluno(i, nome);
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Digite uma idade válida inteira");
        }

        //2
        try {
            Calculadora calc = new Calculadora();
            System.out.println("Conta:");
            int conta = scan.nextInt();
            System.out.println("Digite o valor de x:");
            double x = scan.nextDouble();
            System.out.println("Digite o valor de y:");
            double y = scan.nextDouble();
            switch (conta) {
                case 1:
                    calc.somar(x,y);
                    break;
                case 2:
                    calc.subtrair(x, y);
                    break;
                case 3:
                    calc.dividir(x, y);
                    break;
                case 4:
                    calc.multiplicar(x, y);
                    break;
                default:
                    System.out.println("Digite um valor valido");
                    break;
            }
        } catch (ArithmeticException e) {
           System.out.println("Erro na operação");
        }

        //3
        try {
            System.out.println("Digite a nota 1");
            String nota1 = scan.nextLine();
            System.out.println("Digite a nota 2");
            String nota2 = scan.nextLine();
            System.out.println("Digite a nota 3");
            String nota3 = scan.nextLine();
            double n1 = Double.parseDouble(nota1);
            double n2 = Double.parseDouble(nota2);
            double n3 = Double.parseDouble(nota3);
            Turma t = new Turma();
            t.setNotasPelaPosicao( 0, n1);
            t.setNotasPelaPosicao( 1, n2);
            t.setNotasPelaPosicao( 2, n3);
        } catch (Exception e) {
            System.out.println("Não digite um valor inválido");
        }

        //4
        try {
            ContaBancaria c = new ContaBancaria(0, null, 0);
            c.consultarSaldo();
            c.depositar(1000);
            c.depositar(-1);
            c.sacar(500);
            c.sacar(1000);
            c.consultarSaldo();

        } catch (Exception e) {
            System.out.println("Houve algum erro");
        }
        
        //5
        try {
            ConversorDeNumero c = new ConversorDeNumero();
            String a = "12";
            System.out.println(c.paraDouble(a));
            String b = "12";
            System.out.println(c.paraInt(b));
        } catch (NumberFormatException e) {
            System.out.println("Houve erro na conversao");
        }

        //6
        try {
           Funcionario f = new FuncionarioPJ();
            f.setSalario(100);
            f.calcularPagamento();
        } catch (Excecao e) {
            System.out.println("Erro :" + e);
        }

        //7
        System.out.println("\n=== Questão 7 - Sistema de produtos ===");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new ProdutoFisico("Caderno", 25.0, 5));
        produtos.add(new ProdutoDigital("Curso em vídeo", 79.9, 20));

        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - preço final: R$ " + produto.calcularPrecoFinal());
        }

        try {
            ProdutoFisico produtoFisico = new ProdutoFisico("Livro físico", 40.0, 0);
            produtoFisico.vender(1);
        } catch (IllegalStateException e) {
            System.out.println("Erro no produto físico: " + e.getMessage());
        }

        try {
            Produto produtoComPrecoNegativo = new Produto("Produto inválido", -10, 2);
            System.out.println(produtoComPrecoNegativo);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de valor: " + e.getMessage());
        }

        try {
            Produto produtoComEstoqueNegativo = new Produto("Produto inválido", 10, -1);
            System.out.println(produtoComEstoqueNegativo);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de estoque: " + e.getMessage());
        }

        //8
        System.out.println("\n=== Questão 8 - Veículos ===");

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Motocicleta());
        veiculos.add(new Carro());

        double[] velocidadesSolicitadas = {25, -10, 18};

        for (int i = 0; i < veiculos.size(); i++) {
            try {
                veiculos.get(i).acelerar(velocidadesSolicitadas[i]);
                System.out.println(veiculos.get(i).getClass().getSimpleName() + " acelerou para " + veiculos.get(i).getVelocidade() + " km/h");
            } catch (IllegalArgumentException e) {
                System.out.println(veiculos.get(i).getClass().getSimpleName() + " - erro: " + e.getMessage());
            }
        }

        //9
        System.out.println("\n=== Questão 9 - Biblioteca ===");

        Biblioteca biblioteca = new Biblioteca();
        LivroFisico livroFisico = new LivroFisico("Dom Casmurro");
        LivroDigital livroDigital = new LivroDigital("Clean Code");
        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(livroDigital);

        try {
            biblioteca.emprestarLivro("Dom Casmurro");
            System.out.println("Empréstimo realizado: " + livroFisico);
            biblioteca.emprestarLivro("Dom Casmurro");
        } catch (OperacaoBibliotecaException e) {
            System.out.println("Erro na biblioteca: " + e.getMessage());
        }

        try {
            biblioteca.devolverLivro("Dom Casmurro");
            System.out.println("Devolução realizada: " + livroFisico);
            biblioteca.devolverLivro("Dom Casmurro");
        } catch (OperacaoBibliotecaException e) {
            System.out.println("Erro na devolução: " + e.getMessage());
        }

        //11
        FormaGeometrica[] formas = {new Retangulo(10), new Circulo(11)};
        for (int i = 0; i < formas.length; i++) {
            formas[i].calcularArea();
        }

        //12
        System.out.println("\n=== Questão 12 - Sistema de pagamentos ===");

        List<MetodoPagamento> metodosPagamento = new ArrayList<>();
        metodosPagamento.add(new PagamentoPix("aluno@teste.com"));
        metodosPagamento.add(new PagamentoCartao("1234567890123456", "Ana Silva"));
        metodosPagamento.add(new PagamentoBoleto("12345678901234567890"));

        double[] valores = {250.0, 2500.0, 5000.0};

        for (int i = 0; i < metodosPagamento.size(); i++) {
            try {
                metodosPagamento.get(i).pagar(valores[i]);
            } catch (IllegalArgumentException e) {
                System.out.println("Falha no pagamento: " + e.getMessage());
            }
        }

        try {
            metodosPagamento.add(new PagamentoPix(""));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar PIX inválido: " + e.getMessage());
        }

        
    }
}