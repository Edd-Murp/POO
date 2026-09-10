import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Calculator;
import models.Person;

public class test {
    //Exemplos de testes unitários
       @Test 
       public void testPerson(){
           Person pessoa = new Person("João", 30);
           assertEquals("João", pessoa.getNome());
       }

       @Test(expected = IllegalArgumentException.class)
       public void testSetNome() {
           Person pessoa = new Person("Aa", 30);
           pessoa.setNome("A");
           assertEquals("A", pessoa.getNome());
       }



       //Exercícios de testes unitários - Calculator
       @Test
       public void deveSomarDoisNumeros() {
           Calculator calculadora = new Calculator(10, 5, "+");
           assertEquals(15.0, calculadora.calcular(calculadora), 0.001);
           
           calculadora.setValor1(0);
           calculadora.setValor2(10);
           assertEquals(10.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(0);
           calculadora.setValor2(0);
           assertEquals(0.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(-10);
           calculadora.setValor2(5);
           assertEquals(-5.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(-10);
           calculadora.setValor2(-5);
           assertEquals(-15.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(10.5);
           calculadora.setValor2(5.5);
           assertEquals(16.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(1000);
           calculadora.setValor2(2500);
           assertEquals(3500.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(1.25);
           calculadora.setValor2(0.75);
           assertEquals(2.0, calculadora.calcular(calculadora), 0.001);
       }

       @Test 
       public void deveSubtrairDoisNumeros() {
           Calculator calculadora = new Calculator(10, 5, "-");
           assertEquals(5.0, calculadora.calcular(calculadora), 0.001);
           
           calculadora.setValor1(5);
           calculadora.setValor2(10);
           assertEquals(-5.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(10);
           calculadora.setValor2(0);
           assertEquals(10.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(0);
           calculadora.setValor2(10);
           assertEquals(-10.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(-10);
           calculadora.setValor2(5);
           assertEquals(-15.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(-10);
           calculadora.setValor2(-5);
           assertEquals(-5.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(10.5);
           calculadora.setValor2(5.5);
           assertEquals(5.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(1000);
           calculadora.setValor2(250);
           assertEquals(750.0, calculadora.calcular(calculadora), 0.001);
       }

       @Test 
       public void deveMultiplicarDoisNumeros() {
           Calculator calculadora = new Calculator(10, 5, "*");
           assertEquals(50.0, calculadora.calcular(calculadora), 0.001);
           
           calculadora.setValor1(10);
           calculadora.setValor2(5);
           assertEquals(50.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(10);
           calculadora.setValor2(0);
           assertEquals(0.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(0);
           calculadora.setValor2(100);
           assertEquals(0.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(10.5);
           calculadora.setValor2(5.5);
           assertEquals(57.75, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(-10);
           calculadora.setValor2(5);
           assertEquals(-50.0, calculadora.calcular(calculadora), 0.001);

           calculadora.setValor1(-10);
           calculadora.setValor2(-5);
           assertEquals(50.0, calculadora.calcular(calculadora), 0.001);
       
           
           calculadora.setValor1(2.5);
           calculadora.setValor2(4);
           assertEquals(10.0, calculadora.calcular(calculadora), 0.001);

           
           calculadora.setValor1(100);
           calculadora.setValor2(100);
           assertEquals(10000.0, calculadora.calcular(calculadora), 0.001);
        }

        @Test 
        public void deveDividirDoisNumeros() {
            Calculator calculadora = new Calculator(10, 2, "/");
            assertEquals(5.0, calculadora.calcular(calculadora), 0.001);
            
            calculadora.setValor1(5);
            calculadora.setValor2(2);
            assertEquals(2.5, calculadora.calcular(calculadora), 0.001);

            calculadora.setValor1(0);
            calculadora.setValor2(10);
            try {
                calculadora.calcular(calculadora);
            } catch (IllegalArgumentException e) {
                assertEquals("Divisão por zero não é permitida.", e.getMessage());
            }

            calculadora.setValor1(-10);
            calculadora.setValor2(2);
            assertEquals(-5.0, calculadora.calcular(calculadora), 0.001);

            calculadora.setValor1(-10);
            calculadora.setValor2(-2);
            assertEquals(5.0, calculadora.calcular(calculadora), 0.001);

            calculadora.setValor1(7.5);
            calculadora.setValor2(2.5);
            assertEquals(3.0, calculadora.calcular(calculadora), 0.001);
            
        }

        @Test (expected = IllegalArgumentException.class)
        public void naoDevePermitirDivisaoPorZero() {
            Calculator calculadora = new Calculator(10, 0, "/");
            calculadora.calcular(calculadora);
        }

        @Test(expected = IllegalArgumentException.class)
        public void naoDevePermitirOperacaoInvalida() {
            Calculator calculadora = new Calculator(10, 5, "%");
            calculadora.calcular(calculadora);
        }

        
}
