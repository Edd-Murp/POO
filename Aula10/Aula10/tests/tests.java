
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.CalculadoraCientifica;
import models.Cliente;
import models.ClientePremium;
import models.ContaDeEnergia;
import models.ContaEnergiaComercial;
import models.EntregaExpressa;
import models.FreteExpresso;
import models.Funcionario;
import models.Gerente;
import models.IngressoVIP;
import models.Livro;
import models.ProdutoImportado;
import models.Vendedor;
import models.VeiculoLocacao;
import models.CarroLocacao;
import models.MotoLocacao;

public class tests {

    @Test
    public void calcularPrecoFinal() {
    ProdutoImportado p1 = new ProdutoImportado("Produto 1", 100.0, 20.0);
    ProdutoImportado p2 = new ProdutoImportado("Produto 2", 150.0, 25.0);
    ProdutoImportado p3 = new ProdutoImportado("Produto 3", 200.0, 30.0);
    assertEquals(120.0, p1.calcularPrecoFinal(), 0.001);
    assertEquals(175.0, p2.calcularPrecoFinal(), 0.001);
    assertEquals(230.0, p3.calcularPrecoFinal(), 0.001);    
    }   

    @Test
    public void calcularPrecoFinalGerente() {
        Gerente g1 = new Gerente("Gerente 1", 1000.0, 200.0);
        Gerente g2 = new Gerente("Gerente 2", 1500.0, 300.0);
        Gerente g3 = new Gerente("Gerente 3", 2000.0, 400.0);
        assertEquals(1200.0, g1.calcularSalarioTotal(), 0.001);
        assertEquals(1800.0, g2.calcularSalarioTotal(), 0.001);
        assertEquals(2400.0, g3.calcularSalarioTotal(), 0.001);
        
    }

    @Test 
    public void calcularPrecoComDesconto() {
        Livro l1 = new Livro("Livro 1", "Autor 1", 100.0);
        Livro l2 = new Livro("Livro 2", "Autor 2", 150.0);
        Livro l3 = new Livro("Livro 3", "Autor 3", 200.0);
        assertEquals(100.0, l1.calcularPrecoComDesconto(0), 0.001);
        assertEquals(135.0, l2.calcularPrecoComDesconto(10), 0.001);
        assertEquals(150.0, l3.calcularPrecoComDesconto(25), 0.001);
        assertEquals(100.0, l3.calcularPrecoComDesconto(50), 0.001);
        assertEquals(0.0, l3.calcularPrecoComDesconto(100), 0.001);
    }

    @Test
    public void calcularValorTotalIngressoVIP() {
        IngressoVIP ingressoVIP1 = new IngressoVIP(100.0, 50.0);
        IngressoVIP ingressoVIP2 = new IngressoVIP(150.0, 75.0);
        IngressoVIP ingressoVIP3 = new IngressoVIP(200.0, 100.0);
        IngressoVIP ingressoVIP4 = new IngressoVIP(200.0, 0);
        assertEquals(150.0, ingressoVIP1.calcularValorTotal(), 0.001);
        assertEquals(225.0, ingressoVIP2.calcularValorTotal(), 0.001);
        assertEquals(300.0, ingressoVIP3.calcularValorTotal(), 0.001);
        assertEquals(200.0, ingressoVIP4.calcularValorTotal(), 0.001);
    }

    @Test 
    public void calcularSalarioTotalVendedor() {
        Vendedor v1 = new Vendedor("Vendedor 1", 1000.0, 10.0, 100);
    Vendedor v2 = new Vendedor("Vendedor 2", 1500.0, 15.0, 150);
        Vendedor v3 = new Vendedor("Vendedor 3", 2000.0, 20.0, 200);
        assertEquals(1010.0, v1.calcularSalario(), 0.001);
        assertEquals(1522.5, v2.calcularSalario(), 0.001);
        assertEquals(2040.0, v3.calcularSalario(), 0.001);
    }

    @Test 
    public void calculadoraFuncioana() {
        CalculadoraCientifica c = new CalculadoraCientifica();
        assertEquals(5.0, c.somar(2.0, 3.0), 0.001);
        assertEquals(6.0, c.multiplicar(2.0, 3.0), 0.001);
        assertEquals(-1.0, c.subtrair(2.0, 3.0), 0.001);
        assertEquals(2.0, c.dividir(6.0, 3.0), 0.001);
        assertEquals(8.0, c.potencia(2.0, 3.0), 0.001);
        assertEquals(2.0, c.raizQuadrada(4.0), 0.001);
    }

    @Test 
    public void clienteCalculaDesconto() {
        Cliente cliente = new Cliente("Cliente Regular", 100.0);
        assertEquals(95.0, cliente.calcularDesconto(), 0.001);
    }

    @Test 
    public void clientePremiumCalculaDesconto() {
        ClientePremium clientePremium = new ClientePremium("Cliente Premium", 100.0);
        assertEquals(90.0, clientePremium.calcularDesconto(), 0.001);
    }

    @Test 
    public void funcionarioCalculaAumento() {
        Funcionario funcionario = new Funcionario("Funcionario", 1000.0, null, 0);
        assertEquals(1050.0, funcionario.calcularAumento(), 0.001);
    }

    @Test 
    public void gerenteCalculaAumento() {
        Gerente gerente = new Gerente("Gerente", 1000.0, 200.0);
        assertEquals(1100.0, gerente.calcularAumento(), 0.001);
    }

    @Test 
    public void entregaExpressaCalculaFrete() {
        EntregaExpressa entregaExpressa = new EntregaExpressa(10.0);
        assertEquals(40.0, entregaExpressa.calcularFrete(), 0.001);
        EntregaExpressa entregaExpressa2 = new EntregaExpressa(5.0);
        assertEquals(30.0, entregaExpressa2.calcularFrete(), 0.001);
        EntregaExpressa entregaExpressa3 = new EntregaExpressa(15.5);
        assertEquals(51.0, entregaExpressa3.calcularFrete(), 0.001);
        EntregaExpressa entregaExpressa4 = new EntregaExpressa(20.0);
        assertEquals(60.0, entregaExpressa4.calcularFrete(), 0.001);
        EntregaExpressa entregaExpressa5 = new EntregaExpressa(2.5);
        assertEquals(25.0, entregaExpressa5.calcularFrete(), 0.001);
    }

    @Test 
    public void contaDeEnergiaCalculaValor() {
        ContaDeEnergia conta1 = new ContaDeEnergia();
        conta1.titular = "João";
        conta1.consumo = 0.0;
        assertEquals(0.0, conta1.calcularValor(), 0.001);
        ContaDeEnergia conta2 = new ContaDeEnergia();
        conta2.titular = "Maria";
        conta2.consumo = 100.0;
        assertEquals(50.0, conta2.calcularValor(), 0.001);
        ContaDeEnergia conta3 = new ContaDeEnergia();
        conta3.titular = "Pedro";
        conta3.consumo = 200.0;
        assertEquals(100.0, conta3.calcularValor(), 0.001);
        ContaEnergiaComercial contaComercial1 = new ContaEnergiaComercial("Empresa A", 1000.0);
        assertEquals(750.0, contaComercial1.calcularValor(), 0.001);
    }

    @Test 
    public void calcularFreteExpresso() {
        FreteExpresso frete1 = new FreteExpresso(0.0, 100.0);
        assertEquals(25.0, frete1.calcularValor(), 0.001);
        FreteExpresso frete2 = new FreteExpresso(10.0, 0.0);
        assertEquals(20.0, frete2.calcularValor(), 0.001);
        FreteExpresso frete3 = new FreteExpresso(0.0, 0.0);
        assertEquals(15.0, frete3.calcularValor(), 0.001);
        FreteExpresso frete4 = new FreteExpresso(7.5, 100.0);
        assertEquals(28.75, frete4.calcularValor(), 0.001);
        FreteExpresso frete5 = new FreteExpresso(10.0, 75.5);
        assertEquals(27.55, frete5.calcularValor(), 0.001);
        FreteExpresso frete6 = new FreteExpresso(3.5, 45.75);
        assertEquals(21.325, frete6.calcularValor(), 0.001);
    }

    @Test
    public void testeGeralGerenteFuncionarioVendedor(){
        Funcionario f1 = new Funcionario("João", 2000.0, "123", 30);
        assertEquals("João", f1.getNome());
        assertEquals(2000.0, f1.getSalario(), 0.001);
        f1.setSalario(2500.0);
        assertEquals(2500.0, f1.getSalario(), 0.001);
        assertEquals(2625.0, f1.calcularAumento(), 0.001);
        
        Gerente g1 = new Gerente("Maria", 3000.0, 500.0);
        assertEquals("Maria", g1.getNome());
        assertEquals(3000.0, g1.getSalario(), 0.001);
        assertEquals(500.0, g1.getBonus(), 0.001);
        g1.setSalario(3500.0);
        g1.setBonus(700.0);
        assertEquals(4200.0, g1.calcularSalarioTotal(), 0.001);
        assertEquals(3850.0, g1.calcularAumento(), 0.001);
        
        Vendedor v1 = new Vendedor("Pedro", 1500.0, 5.0, 1000);
        assertEquals("Pedro", v1.getNome());
        assertEquals(1500.0, v1.getSalarioBase(), 0.001);
        assertEquals(5.0, v1.getPercentualComissao(), 0.001);
        assertEquals(1000, v1.getTotalVendas(), 0.001);
        v1.setSalarioBase(2000.0);
        v1.setPercentualComissao(10.0);
        v1.setTotalVendas(2000);
        assertEquals(2200.0, v1.calcularSalario(), 0.001);
    }

    @Test
    public void testeVeiculoLocacao() {
        VeiculoLocacao v1 = new VeiculoLocacao("ABC1234", "Honda Civic", 150.0);
        assertEquals("ABC1234", v1.getPlaca());
        assertEquals("Honda Civic", v1.getModelo());
        assertEquals(150.0, v1.getValorDiaria(), 0.001);
        v1.setPlaca("XYZ9876");
        v1.setModelo("Toyota Corolla");
        v1.setValorDiaria(180.0);
        assertEquals("XYZ9876", v1.getPlaca());
        assertEquals("Toyota Corolla", v1.getModelo());
        assertEquals(180.0, v1.getValorDiaria(), 0.001);
        assertEquals(900.0, v1.calcularValorLocacao(5), 0.001);
    }

    @Test
    public void testeCarroLocacao() {
        CarroLocacao c1 = new CarroLocacao("ABC1234", "Honda Civic", 150.0, 4);
        assertEquals("ABC1234", c1.getPlaca());
        assertEquals("Honda Civic", c1.getModelo());
        assertEquals(150.0, c1.getValorDiaria(), 0.001);
        assertEquals(4, c1.getQuantidadePortas());
        c1.setQuantidadePortas(2);
        assertEquals(2, c1.getQuantidadePortas());
        assertEquals(750.0, c1.calcularValorLocacao(5), 0.001);
        assertEquals(675.0, c1.calcularValorLocacao(6), 0.001);
        assertEquals(450.0, c1.calcularValorLocacao(3), 0.001);
    }

    @Test
    public void testeMotoLocacao() {
        MotoLocacao m1 = new MotoLocacao("DEF5678", "Honda CB 500", 80.0, 500);
        assertEquals("DEF5678", m1.getPlaca());
        assertEquals("Honda CB 500", m1.getModelo());
        assertEquals(80.0, m1.getValorDiaria(), 0.001);
        assertEquals(500, m1.getCilindradas());
        m1.setCilindradas(700);
        assertEquals(700, m1.getCilindradas());
        assertEquals(400.0, m1.calcularValorLocacao(5), 0.001);
        assertEquals(460.0, m1.calcularValorLocacao(5), 0.001);
    }
}