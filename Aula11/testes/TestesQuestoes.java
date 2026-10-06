package testes;

import models.ContaCorrente;
import models.ContaPoupanca;
import models.questao24.Circulo;
import models.questao24.Quadrado;
import models.questao26.Gerente;
import models.questao26.Vendedor;
import models.questao27.Caminhao;
import models.questao28.ViagemAviao;
import models.questao28.ViagemCarro;
import models.questao28.ViagemOnibus;
import models.questao29.Analista;
import models.questao29.Coordenador;
import models.questao29.Diretor;
import models.questao30.Bicicleta;
import models.questao30.Carro;
import models.questao30.Moto;

public class TestesQuestoes {
    public static void main(String[] args) {
        testarFormas();
        testarContas();
        testarFuncionarios();
        testarEstacionamento();
        testarViagens();
        testarColaboradores();
        testarLocacao();
        System.out.println("Todos os testes passaram.");
    }

    private static void testarFormas() {
        verificarProximo(new Quadrado(5).calcularArea(), 25.0);
        verificarProximo(new Quadrado(10).calcularArea(), 100.0);
        verificarProximo(new Circulo(2).calcularArea(), Math.PI * 4);
        verificarProximo(new Circulo(10).calcularArea(), Math.PI * 100);
    }

    private static void testarContas() {
        ContaCorrente corrente = new ContaCorrente(1, "Ana", 100.0);
        corrente.depositar(50.0);
        verificarProximo(corrente.getSaldo(), 150.0);
        corrente.sacar(20.0);
        verificarProximo(corrente.getSaldo(), 128.0);

        ContaPoupanca poupanca = new ContaPoupanca(2, "Bia", 100.0);
        poupanca.depositar(50.0);
        verificarProximo(poupanca.getSaldo(), 150.0);
        poupanca.sacar(20.0);
        verificarProximo(poupanca.getSaldo(), 130.0);
    }

    private static void testarFuncionarios() {
        verificarProximo(new Gerente("Caio", 10000.0).calcularSalario(), 12000.0);
        verificarProximo(new Vendedor("Dani", 2000.0, 10000.0, 5.0).calcularSalario(), 2500.0);
        verificarProximo(new Vendedor("Eva", 3000.0, 20000.0, 10.0).calcularSalario(), 5000.0);
        verificarProximo(new Vendedor("Fe", 1500.0, 5000.0, 4.0).calcularSalario(), 1700.0);
        verificarProximo(new Gerente("Gui", 5000.0).calcularSalario(), 6000.0);
    }

    private static void testarEstacionamento() {
        verificarProximo(new models.questao27.Carro("ABC1234", 2).calcularValor(), 10.0);
        verificarProximo(new models.questao27.Moto("ABC1234", 2).calcularValor(), 6.0);
        verificarProximo(new Caminhao("ABC1234", 2).calcularValor(), 20.0);
    }

    private static void testarViagens() {
        verificarProximo(new ViagemCarro(100, 4).calcularCusto(), 80.0);
        verificarProximo(new ViagemOnibus(100, 4).calcularCusto(), 120.0);
        verificarProximo(new ViagemAviao(100, 4).calcularCusto(), 280.0);
    }

    private static void testarColaboradores() {
        verificarProximo(new Analista("Ivo", 10000).calcularSalarioFinal(), 11000.0);
        verificarProximo(new Coordenador("Ju", 10000).calcularSalarioFinal(), 12000.0);
        verificarProximo(new Diretor("Kau", 10000).calcularSalarioFinal(), 13000.0);
    }

    private static void testarLocacao() {
        Carro carro = new Carro(1, "Sedan", 100.0);
        verificarProximo(carro.calcularLocacao(3), 350.0);
        verificarProximo(carro.calcularLocacao(3, 10.0), 315.0);
        verificarProximo(new Moto(2, "Moto", 50.0).calcularLocacao(3), 170.0);
        verificarProximo(new Bicicleta(3, "Bicicleta", 20.0).calcularLocacao(3), 60.0);
    }

    private static void verificarProximo(double atual, double esperado) {
        if (Math.abs(atual - esperado) > 0.000001) {
            throw new AssertionError("Esperado " + esperado + ", recebido " + atual);
        }
    }
}

