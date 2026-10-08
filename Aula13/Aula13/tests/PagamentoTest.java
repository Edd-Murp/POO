
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.*;

public class PagamentoTest {
   
    @Test
    public void deveCalcularPagamentoBoleto(){
        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto(100.0, 10.0);
        double valorFinal = pagamentoBoleto.calcularValorFinal();

        assertEquals(210.0, valorFinal, 0.001);
    }

    @Test
    public void deveCalcularPagamentoCartao(){
        PagamentoCartao pagamentoCartao = new PagamentoCartao(200.0, 5.0);
        double valorFinal = pagamentoCartao.calcularValorFinal();

        assertEquals(225.0, valorFinal, 0.001);
    }

    @Test
    public void deveCalcularPagamentoPix(){
        PagamentoPix pagamentoPix = new PagamentoPix(150.0, 2.0);
        double valorFinal = pagamentoPix.calcularValorFinal();

        assertEquals(450.0, valorFinal, 0.001);
    }

    @Test 
    public void deveCalcularPagamentosViaPagamento(){
        Pagamento[] pagamentos = {new PagamentoBoleto(100.0, 5.0), new PagamentoCartao(200.0, 5.0), new PagamentoPix(150.0, 2.0)};
        double[] valoresFinaisEsperados = {205.0, 225.0, 450.0};

        for (int i = 0; i < pagamentos.length; i++) {
            double valorFinal = pagamentos[i].calcularValorFinal();
            assertEquals(valoresFinaisEsperados[i], valorFinal, 0.001);
        }
    }

    
}
