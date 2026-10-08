
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import models.*;

public class EmpresaTest {

    @Test 
    public void deveCalcularSalarioDoFuncionario() {
        Funcionario funcionario = new FuncionarioComum("João", 3000.0);

        assertEquals(3000.0, funcionario.calcularSalario(), 0.001);
    }

    @Test 
    public void deveCalcularSalarioDoProgramador() {
        Funcionario programador = new Programador("Ana", 4000.0, "Java");

        assertEquals(4100.0, programador.calcularSalario(), 0.001);
    }

    @Test
    public void deveCalcularSalarioDoGerente() {
        Funcionario gerente = new Gerente("João", 5000.0, 1000.0);

        assertEquals(5000.0, gerente.calcularSalario(), 0.001);
    }

    @Test
    public void deveCalcularSalarioDoVendedor() {
        Vendedor vendedor = new Vendedor("Carlos", 2000.0, 100.0);
        vendedor.registrarVenda();
        vendedor.registrarVenda();

        assertEquals(2200.0, vendedor.calcularSalario(), 0.001);
    }

    @Test
    public void deveCalcularSalarioDoConsultor() {
        Funcionario consultor = new Consultor("Maria", 3000.0, 50.0);

        assertEquals(11000.0, consultor.calcularSalario(), 0.001);
    }

    @Test
    public void deveCalcularCustoTotalDosSalarios() {
        Funcionario gerente = new Gerente("João", 5000.0, 1000.0);
        Vendedor vendedor = new Vendedor("Carlos", 2000.0, 100.0);
        vendedor.registrarVenda();
        vendedor.registrarVenda();
        Funcionario consultor = new Consultor("Maria", 3000.0, 50.0);

        Empresa empresa = new Empresa(new ArrayList<>(Arrays.asList(gerente, vendedor, consultor)));

        assertEquals(18200.0, empresa.calcularCustoSalarios(), 0.001);
    }

    
}
