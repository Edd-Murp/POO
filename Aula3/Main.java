import java.sql.Date;
import java.util.Scanner;

import models.Aluno;
import models.Biblioteca;
import models.Carro;
import models.Departamento;
import models.Emprestimo;
import models.Fabricante;
import models.Funcionario;
import models.ItemPedido;
import models.Livro;
import models.Motor;
import models.Pedido;
import models.Pessoa;
import models.Produto;

public static void main(String[] args) {
    
    Pessoa pessoa1 = new Pessoa();
    pessoa1.nome = "Ana";
    pessoa1.idade = 21;
    pessoa1.altura = 1.68;
    pessoa1.maiorDeIdade = true;

    System.out.println("\nNome: " + pessoa1.nome);
    System.out.println("Idade: " + pessoa1.idade);
    System.out.println("Altura: "+ pessoa1.altura);
    System.out.println("Maior de idade: " + pessoa1.maiorDeIdade);

    Pessoa pessoa2 = new Pessoa();
    pessoa2.nome = "Pedro";
    pessoa2.idade = 18;
    pessoa2.altura = 1.77;
    pessoa2.maiorDeIdade = true;
    
    System.out.println("\nNome: " + pessoa2.nome);
    System.out.println("Idade: " + pessoa2.idade);
    System.out.println("Altura: "+ pessoa2.altura);
    System.out.println("Maior de idade: " + pessoa2.maiorDeIdade);

    Pessoa pessoa3 = new Pessoa();
    pessoa3.nome = "César";
    pessoa3.idade = 16;
    pessoa3.altura = 1.69;
    pessoa3.maiorDeIdade = false;

    System.out.println("\nNome: " + pessoa3.nome);
    System.out.println("Idade: " + pessoa3.idade);
    System.out.println("Altura: "+ pessoa3.altura);
    System.out.println("Maior de idade: " + pessoa3.maiorDeIdade);

    //Livro
    Livro livro1 = new Livro();
    livro1.autor = pessoa1;
    livro1.titulo = "Clean Code";
    livro1.numPag = 464;
    livro1.anoPubli = 2008;

    System.out.println("\nAutor: " + livro1.autor);
    System.out.println("Título:"+ livro1.titulo);
    System.out.println("Num. de Páginas: "+ livro1.numPag);
    System.out.println("Ano de publicação: " + livro1.anoPubli);

    Scanner scan = new Scanner(System.in);

    //Fabricante
    Fabricante fabricante = new Fabricante();
    fabricante.nome = "Carlos";
    
    //Produto
    Produto p1 = new Produto();
    p1.comprador = pessoa1;
    p1.fabricante = fabricante;
    System.out.println("Nome:");
    p1.nome = scan.nextLine();
    System.out.println("Qntd: ");
    p1.qntd = scan.nextInt();
    System.out.println("Preço:");
    p1.preco = scan.nextDouble();
    p1.disponivel = true;

    System.out.println("\nComprador: " +  p1.comprador.nome);
    System.out.println("Fabricante: " + fabricante.nome);
    System.out.println("Nome: " + p1.nome);
    System.out.println("Quantidade: " + p1.qntd);
    System.out.println("Preço: "+ p1.preco);
    System.out.println("Disponível: " + p1.disponivel);

    Produto p2 = new Produto();
    p2.comprador = pessoa1;
    p2.fabricante = fabricante;
    p2.nome = "Bonk";
    p2.qntd = 9999;
    p2.preco = 399.90;
    p2.disponivel = true;

    System.out.println("\nComprador: " +  p2.comprador.nome);
    System.out.println("Fabricante: " + fabricante.nome);
    System.out.println("Nome: " + p2.nome);
    System.out.println("Quantidade: " + p2.qntd);
    System.out.println("Preço: "+ p2.preco);
    System.out.println("Disponível: " + p2.disponivel);

    //Carro
    Carro carro1 = new Carro();
    carro1.dono = pessoa2;
    System.out.println("Modelo?");
    carro1.modelo = scan.nextLine();
    System.out.println("Cor?");
    carro1.cor = scan.nextLine();
    System.out.println("Ano?");
    carro1.ano = scan.nextInt();
    System.out.println("Quilometragem?");
    carro1.quilometragem = scan.nextDouble();
    carro1.ligado = false;

    System.out.println("\nDono: " +  carro1.dono.nome);
    System.out.println("Modelo: " + carro1.modelo);
    System.out.println("Cor: " + carro1.cor);
    System.out.println("Ano: " + carro1.ano);
    System.out.println("Quilometragem: "+ carro1.quilometragem);
    System.out.println("Ligado: " + carro1.ligado);

    Carro carro2 = new Carro();
    carro2.dono = pessoa3;
    carro2.modelo = "Hilux";
    carro1.cor = "vermelha";
    carro1.ano = 2016;
    carro1.quilometragem = 0;
    carro1.ligado = false;

    System.out.println("\nDono: " +  carro2.dono.nome);
    System.out.println("Modelo: " + carro2.modelo);
    System.out.println("Cor: " + carro2.cor);
    System.out.println("Ano: " + carro2.ano);
    System.out.println("Quilometragem: "+ carro2.quilometragem);
    System.out.println("Ligado: " + carro2.ligado);

    scan.close();



    //Parte 2
    Pessoa carlos = new Pessoa();
    carlos.nome = "Carlos";
    
    //7
    Aluno carlinho = new Aluno();
    carlinho.aluno = carlos;
    carlinho.matricula = 123123;
    carlinho.nota = 7.0;
    carlinho.aprovado = true;

    //8
    Pessoa maria = new Pessoa();
    maria.nome = "Maria";

    Livro livro = new Livro();
    livro.autor = maria;
    livro.titulo = "Longas tranças de um careca";
    livro.numPag = 999;
    livro.anoPubli = 2026;

    //9
    Livro l1 = new Livro();
    l1.autor = pessoa1;
    Livro l2 = new Livro();
    l2.autor = pessoa2;

    //10
    Pessoa joao = new Pessoa();
    joao.nome = "João";
    //Produto criado anteriormente
    p1.comprador = joao;
    p1.nome = "Notebook";
    p1.preco = 4500;
    p1.qntd = 8;
    p1.disponivel = true;

    //11
    //Pessoas criadas anteriormente
    p1.comprador = pessoa1;
    p2.comprador = pessoa2;

    Produto p3 = new Produto();
    p3.comprador = pessoa1;

    //12
    pessoa1.nome = "Roberto";
    carro1.dono = carlos;
    carro1.modelo = "Toyoto Corolla";
    carro1.ano = 2022;
    carro1.quilometragem = 71000;

    //Parte 3 
    //13 
    fabricante.nome = "Dell";
    fabricante.pais = "Estados Unidos";

    p1.fabricante = fabricante;
    p1.nome = "Notebook";

    //14
    Fabricante fabricante1 = new Fabricante();
    Fabricante fabricante2 = new Fabricante();

    p1.fabricante = fabricante1;
    p2.fabricante = fabricante1;
    p3.fabricante = fabricante2;

    //15
    p1.comprador = pessoa1;
    p1.fabricante = fabricante;

    //16
    Motor motor = new Motor();
    motor.potencia = 150;
    motor.cilindrada = 1.3;
    motor.combustivel = "Gasolina";
    carro1.motor = motor;

    //17
    Motor motor2 = new Motor();
    motor2.potencia = 1000;
    motor2.cilindrada = 5.0;
    motor2.combustivel = "Kerosene";

    carro1.motor = motor;
    carro2.motor = motor2;

    //18
    carro1.dono = pessoa1;
    carro1.motor = motor;
    carro1.cor = "preto";
    carro1.ano = 2099;
    carro1.modelo = "carro";
    carro1.ligado = true;
    carro1.quilometragem = 0;

    //19
    Departamento dp = new Departamento();
    dp.nome = "Tecnologia";
    dp.sigla = "TI";

    Funcionario funcionario = new Funcionario();
    funcionario.nome = "João";
    funcionario.cargo = "Desenvolvedor";
    funcionario.departamento = dp;

    //20
    dp.nome = "Financeiro";
    dp.sigla = "F";

    funcionario.departamento = dp;
    Funcionario funcionario2 = new Funcionario();
    funcionario2.nome = "Cleber";
    funcionario2.cargo = "contador";
    funcionario2.salario = 1000;
    Funcionario funcionario3 = new Funcionario();
    funcionario3.nome = "Cleberson";
    funcionario3.cargo = "administrador";
    funcionario3.salario = 9999;

    //Parte 4
    //21
    p1.comprador = pessoa1;
    p1.fabricante = fabricante;

    //22
    Pessoa pedro = new Pessoa();
    pedro.nome = "Pedro";
    pedro.altura = 2.0;
    pedro.idade = 20;
    pedro.maiorDeIdade = true;
    Fabricante toyota = new Fabricante(); 
    toyota.nome = "Toyota";
    toyota.pais = "xique-xique";
    carro1.dono = pedro;
    carro1.motor = motor2;

    //23
    carro1.dono = pessoa1;
    carro2.dono = pessoa2;

    //24
    p1.comprador = carlos;
    p2.comprador = carlos;
    p2.fabricante = fabricante;
    p1.fabricante = fabricante1;

    //25
    ItemPedido itemPedido = new ItemPedido();
    itemPedido.produto = p1;
    itemPedido.quantidade = 3;
    Pedido pedido = new Pedido();
    pedido.itemPedido = itemPedido;

    //26
    pessoa1.nome = "Marcos";
    fabricante.nome = "Logitech";
    p1.nome = "Mouse";
    itemPedido.produto = p1;
    pedido.cliente = pessoa1;
       
    //27
    livro.autor = pessoa1;
    Emprestimo emprestimo = new Emprestimo();
    emprestimo.dataDevolucao = new Date(1);
    emprestimo.dataEmprestimo = new Date(0);
    Biblioteca biblioteca = new Biblioteca();
    biblioteca.emprestimo = emprestimo;
    biblioteca.livro = livro;
    biblioteca.autor = livro.autor;

    //28
    livro1.autor = carlos;

    //Parte 7 
    //29
    carro1.dono = pessoa1;
    pessoa1.nome = "Lucas";
    carro1.modelo = "Honda Civic";
    carro1.ano = 2023;
    carro1.motor.cilindrada = 2.0;
    p1.comprador = pessoa1;

    //30
    
}
