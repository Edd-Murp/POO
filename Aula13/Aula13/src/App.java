import java.util.ArrayList;

import models.*;

public class App extends Print{
    public static void main(String[] args) throws Exception{
        

        //1
        Funcionario g1 = new Gerente("João", 5000.0, 1000.0);
        Funcionario c1 = new Consultor("Maria", 3000.0, 50.0);
        Funcionario v1 = new Vendedor("Carlos", 2000.0, 100.0);
        print(g1.calcularSalario());
        print(c1.calcularSalario());
        print(v1.calcularSalario());
        print("");
        
        //2
        Animal[] animais = new Animal[3];
        animais[0] = new Vaca();
        animais[1] = new Gato();
        animais[2] = new Cachorro();
        for (int i = 0; i < animais.length; i++) {
            animais[i].emitirSom();
        }

        //3
        print("");
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Moto("Honda", 1000.0);
        veiculos[1] = new Carro("Toyota", 2000.0);
        veiculos[2] = new Caminhao("Volvo", 3000.0);
        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i].acelerar();
        }

        //4
        print("");
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Retangulo(4.0, 6.0);
        figuras[2] = new Triangulo(8.0, 10.0);
        for (int i = 0; i < figuras.length; i++) {
            print(figuras[i].calcularArea());
        }

        //5
        /* 
        print("");
        ContaBancaria conta1 = new ContaCorrente(1000.0);
        ContaBancaria conta2 = new ContaPoupanca(500.0);
        ContaBancaria[] contas = {conta1, conta2};
        for (int i = 0; i < contas.length; i++) {
            contas[i].sacar(i);
        }
        */

        //6
        print("");
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(g1);
        funcionarios.add(c1);
        funcionarios.add(v1);
        Empresa empresa = new Empresa(funcionarios);
        empresa.calcularCustoSalarios();

        //7
        print("");
        Pagamento[] pagamentos = {new PagamentoBoleto(100.0, 5.0), new PagamentoCartao(200.0, 10.0), new PagamentoPix(300.0, 15.0)};
        for (int i = 0; i < pagamentos.length; i++) {
            print(pagamentos[i].calcularValorFinal());
        }

        //8
        print("");
        Produto[] produtos = {
            new ProdutoNacional("Arroz", 20.0),
            new ProdutoImportado("Camisa", 150.0),
            new ProdutoPromocional("Notebook", 2500.0, 10.0)
        };
        for (int i = 0; i < produtos.length; i++) {
            print(produtos[i].getNome() + ": R$ " + produtos[i].calcularPrecoFinal());
        }

        //9
        Instrumento[] instrumentos = {new Violao(), new Piano(), new Bateria()};
        for (int i = 0; i < instrumentos.length; i++) {
            instrumentos[i].tocar();
        }    
        
        //11
        print("");
        Transporte[] transportes = {new Uber(1000.0, 2.0), new Taxi(2000.0, 15.0, 2.0), new Onibus(500.0)};
        for (int i = 0; i < transportes.length; i++) {
            print("Custo do transporte: R$ " + transportes[i].calcularCusto());
        }

        //12
        print("");
        Entrega[] entregas = {new EntregaNormal(), new EntregaExpressa(), new EntregaAgendada()};
        for (int i = 0; i < entregas.length; i++) {
            print("Custo do frete: R$ " + entregas[i].calcularFrete());
        }

        //14
        print("");
        Funcionario[] funcionarios2 = {new Gerente("João", 5000.0, 1000.0), new Consultor("Maria", 3000.0, 50.0), new Vendedor("Carlos", 2000.0, 100.0)};
        for (int i = 0; i < funcionarios2.length; i++) {
            print(funcionarios2[i].getNome() + ": R$ " + funcionarios2[i].calcularBonus());
        }

        //15
        print("");
        Veiculo[] veiculos2 = {new Moto("Honda", 1000.0), new Carro("Toyota", 2000.0), new Caminhao("Volvo", 3000.0)};
        for (int i = 0; i < veiculos2.length; i++) {
            print("Imposto do veículo: R$ " + veiculos2[i].calcularImposto());
        }

        //16   
        print("");
        ItemBiblioteca[] itens = {new Livro("O Senhor dos Anéis", 1954), new Revista("National Geographic", 2021), new DVD("Matrix", 1999)};
        for (int i = 0; i < itens.length; i++) {
            print("Prazo de empréstimo para " + itens[i].getTitulo() + ": " + itens[i].calcularPrazoEmprestimo() + " dias");
        }

        //17
        print("");
        Funcionario f1 = new Vendedor(null, 100, 0);
        ((Vendedor) f1).registrarVenda();
        print("Vendas do vendedor: " + ((Vendedor) f1).getVendas());

        //18
        print("");
        for (int i = 0; i < funcionarios2.length; i++) {
            if(funcionarios2[i] instanceof Vendedor) {
                ((Vendedor) funcionarios2[i]).registrarVenda();
                print("Vendas do vendedor " + ((Vendedor) funcionarios2[i]).getNome() + ": " + ((Vendedor) funcionarios2[i]).getVendas());
            }if(funcionarios2[i] instanceof Gerente) {
                ((Gerente) funcionarios2[i]).definirMeta(1000.0);
                print("Meta do gerente " + ((Gerente) funcionarios2[i]).getNome() + ": R$ " + ((Gerente) funcionarios2[i]).getMeta());
            }
        }

        //19
        print("");
        for (int i = 0; i < veiculos2.length; i++) {
            if(veiculos2[i] instanceof Moto){
                System.out.println("Esse veículo tem 2 rodas.");
            }if(veiculos2[i] instanceof Carro){
                System.out.println("Esse veículo tem 4 rodas.");
            }
        }

        //20
        print("");
        ContaBancaria[] contas = {
            new ContaCorrente(123, 1000.0, 500.0),
            new ContaPoupanca(456, 2000.0, 0.05),
            new ContaCorrenteEspecial(789, 3000.0, 1000.0)
        };
        for (int i = 0; i < contas.length; i++) {
            contas[i].sacar(1500.0);
            System.out.println("Saldo da conta " + contas[i].getNumero() + ": R$ " + contas[i].getSaldo());
        }

        //21
        print("");
        ContaBancaria contaOrigem = new ContaCorrente(10, 1500.0, 500.0);
        ContaBancaria contaDestino = new ContaPoupanca(20, 500.0, 0.03);
        ContaBancaria contaEspecial = new ContaCorrenteEspecial(30, 2000.0, 1000.0);

        contaOrigem.transferir(contaDestino, 300.0);
        print("Saldo conta origem: R$ " + contaOrigem.getSaldo());
        print("Saldo conta destino: R$ " + contaDestino.getSaldo());

        contaEspecial.transferir(contaOrigem, 500.0);
        print("Saldo conta especial: R$ " + contaEspecial.getSaldo());
        print("Saldo conta origem após segunda transferência: R$ " + contaOrigem.getSaldo());
    
    
        //22
        print("");
        ArrayList<Figura> figurasLista = new ArrayList<>();
        figurasLista.add(new Quadrado(4.0));
        figurasLista.add(new Retangulo(3.0, 5.0));
        figurasLista.add(new Circulo(2.5));

        for (int i = 0; i < figurasLista.size(); i++) {
            Figura figura = figurasLista.get(i);
            print("Área: " + figura.calcularArea() + " | Perímetro: " + figura.calcularPerimetro());
        }
    }

}
