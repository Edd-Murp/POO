import java.sql.Date;
import java.util.Scanner;

import models.*;

public static void main(String[] args) {
    
    //1
    Pessoa pessoa1 = new Pessoa("João", 20);
    Pessoa pessoa2 = new Pessoa("Maria", 17);

    //2
    Aluno aluno1 = new Aluno(pessoa1, 12345, "Engenharia");
    Aluno aluno2 = new Aluno(pessoa2, 54321, "Medicina");
    Aluno aluno3 = new Aluno(new Pessoa("Carlos", 22), 67890, "Direito");

    //3
    Livro livro1 = new Livro("Java Programming", pessoa1, 500);
    Livro livro2 = new Livro("Data Structures", pessoa2, 400);
    Livro livro3 = new Livro("Algorithms", new Pessoa("Pedro", 25), 600);   
    
    //7
    Fabricante fabricante1 = new Fabricante("Dell", "EUA");
    Fabricante fabricante2 = new Fabricante("Apple", "EUA");
    
    //4
    Produto produto1 = new Produto("Notebook", 2500.00, 10, fabricante1);
    Produto produto2 = new Produto("Smartphone", 1500.00, 5, fabricante2);

    //5
    Carro carro1 = new Carro("Civic", 2020, "Honda");
    Carro carro2 = new Carro("Corolla", 2021, "Toyota");

    //6
    Motor motor1 = new Motor(150, "Gasolina");
    Motor motor2 = new Motor(200, "Diesel");
    Motor motor3 = new Motor(180, "Flex");

    //8


    //Parte 2 - Sobrecarga
    //2
    Livro livro4 = new Livro("Clean Code");
    Livro livro5 = new Livro("Refactoring", pessoa1);
    Livro livro6 = new Livro("Design Patterns", pessoa2, 350);

    //3
    Produto produto3 = new Produto("Tablet", 800.00);

    //4
    Carro carro3 = new Carro("Mustang", "Ford");
    Carro carro4 = new Carro(motor1, "Camaro", 2022, "Chevrolet");

    //5
    Viagem viagem1 = new Viagem(new ArrayList<Destino>());

    //Parte 3 - Sobrecarga de métodos

    //1
    pessoa1.apresentar();
    pessoa2.apresentar("Bem-vinda!");

    //2
    produto1.aplicaDesconto(10);
    produto2.aplicaDesconto(15, 5);

    //3
    carro1.acelerar();
    carro2.acelerar(20);

    //4
    livro1.emprestar();
    livro2.emprestar(pessoa1);

    //5
    Funcionario funcionario1 = new Funcionario("Carlos", "Gerente", 5000.00);
    Funcionario funcionario2 = new Funcionario("Ana", "Analista", 4000.00);
    funcionario1.aumentarSalario(10);
    funcionario2.aumentarSalario(5, 200);

    //6
    viagem1.calcularCusto(5.0);
    viagem1.calcularCusto(5.0, 100.0);

    //Parte 4 - Atributos estaticos

    //1
    Pessoa pessoa3 = new Pessoa("Lucas", 30);
    Pessoa pessoa4 = new Pessoa("Fernanda", 25);
    Pessoa pessoa5 = new Pessoa("Rafael", 28);
    System.out.println("Quantidade de pessoas: " + Pessoa.getQntdPessoas());

    //2
    Produto produto4 = new Produto("Monitor", 1200.00, 8, fabricante1);
    System.out.println("Total de produtos criados: " + Produto.getTotalProdutosCriados());

    //3
    Carro carro5 = new Carro("Fiesta", 2019, "Ford");
    System.out.println("Velocidade máxima permitida: " + carro5.getVelocidadeMaximaPermitida() + " km/h");
    System.out.println("Velocidade máxima permitida (acessando diretamente): " + Carro.getVelocidadeMaximaPermitida() + " km/h");

    //4
    Funcionario funcionario3 = new Funcionario("Mariana", "Coordenadora", 6000.00);
    System.out.println("Salário do funcionário antes do reajuste: " + funcionario3.getSalario());
    Funcionario.setPercentualReajusteGeral(10);
    System.out.println("Salário do funcionário após o reajuste: " + funcionario3.getSalario());

    //5
    Date data1 = new Date(2023, 5, 15);
    Date data2 = new Date(2023, 6, 20);
    Emprestimo emprestimo1 = new Emprestimo(data1, data2);
    Biblioteca biblioteca = new Biblioteca(pessoa1, livro1, emprestimo1, 0);
    System.out.println("Total de livros emprestados: " + biblioteca.getTotalLivrosEmprestados());

    //Parte 5 - Metodos estaticos

    //1
    System.out.println("Quantidade de pessoas: " + Pessoa.getQntdPessoas());

    //2
    System.out.println("Preço com desconto: " + Produto.calcularPrecoComDesconto(500.00, 10));

    //3
    System.out.println("Carro a 310 km/h está dentro da velocidade máxima permitida: " + Carro.verificarVelocidade(310));

    //Parte 6 - Exceções

    //1
    try {
        pessoa1.setIdade(-5);
    } catch (RuntimeException e) {
        System.out.println("Erro: " + e.getMessage());
    }

    //2
    try{
        Funcionario funcionario4 = new Funcionario("Pedro", "Desenvolvedor", 3000.00);
        funcionario4.setSalario(-1000.00);
    }catch(RuntimeException e){
        System.out.println("Erro: " + e.getMessage());
    }

    //3
    try{
        Produto produto5 = new Produto("Cadeira", -200.00, 5, fabricante2);
    }catch(RuntimeException e){
        System.out.println("Erro: " + e.getMessage());
    }
}
