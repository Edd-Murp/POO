import models.*;

public class App {
    public static void main(String[] args) throws Exception {
       //1 
       Quadrado quadrado = new Quadrado(5);
       System.out.println("Área do quadrado: " + quadrado.calcular());

       //2
       System.out.println("");
        ContaLuz contaLuz = new ContaLuz(100, 0.5);
        System.out.println("Valor da conta de luz: " + contaLuz.calcularValorPagar());
        ContaAgua contaAgua = new ContaAgua(50, 0.3);
        System.out.println("Valor da conta de água: " + contaAgua.calcularValorPagar());

        //3
        System.out.println("");
        Contrato contrato = new Contrato("12345");
        contrato.imprimir();
        Relatorio relatorio = new Relatorio("Relatório de vendas");
        relatorio.imprimir();

        //4 e 7
        System.out.println("");
        Produto produto = new Produto("Produto 1", 5000, 10, 15);
        System.out.println("Desconto do produto: " + produto.calcularDesconto());
        System.out.println("Preço final do produto: " + produto.calcularPrecoFinal());
        Servico servico = new Servico(100, 5, 20);
        System.out.println("Desconto do serviço: " + servico.calcularDesconto());

        //5
        System.out.println("");
        Aluno aluno = new Aluno("João", "123456");
        System.out.println("Identificação do aluno: " + aluno.obterIdentificacao());
        Funcionario funcionario = new Funcionario("Maria", "987654", 1000);
        System.out.println("Identificação do funcionário: " + funcionario.obterIdentificacao());

        //6
        System.out.println("");
        Usuario usuario = new Usuario("admin", "1234");
        System.out.println("Autenticação do usuário: " + usuario.autenticar("1234"));
        System.out.println("Autenticação do usuário: " + usuario.autenticar("4321"));
        Administrador administrador = new Administrador("admin", "1234");
        System.out.println("Autenticação do administrador: " + administrador.autenticar("1234"));
        System.out.println("Autenticação do administrador: " + administrador.autenticar("4321"));

        //8
        System.out.println("");
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        livro.emprestar();
        livro.emprestar();
        livro.devolver();
        Notebook notebook = new Notebook("Dell XPS 13");
        notebook.emprestar();
        notebook.emprestar();
        notebook.devolver();

        //9
        System.out.println("");
        Carro carro = new Carro(50);
        carro.abastecer(30);
        carro.abastecer(30);
        System.out.println("Nível de combustível do carro: " + carro.getNivelCombustivel());

        //10
        System.out.println("");
        System.out.println("Valor bonus do gerente: " + new Gerente("Carlos", 5000, 10).calcularBonus());
        System.out.println("Bônus funcionário: " + funcionario.calcularBonus());
    
        //11
    }
}
