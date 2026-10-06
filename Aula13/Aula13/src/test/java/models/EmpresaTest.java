package models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class EmpresaTest {

    @Test
    void deveCalcularSalarioDoGerente() {
        Funcionario gerente = new Gerente("João", 5000.0, 1000.0);

        assertEquals(6000.0, gerente.calcularSalario(), 0.001);
    }

    @Test
    void deveCalcularSalarioDoVendedor() {
        Vendedor vendedor = new Vendedor("Carlos", 2000.0, 100.0);
        vendedor.registrarVenda();
        vendedor.registrarVenda();

        assertEquals(2200.0, vendedor.calcularSalario(), 0.001);
    }

    @Test
    void deveCalcularSalarioDoConsultor() {
        Funcionario consultor = new Consultor("Maria", 3000.0, 50.0);

        assertEquals(11000.0, consultor.calcularSalario(), 0.001);
    }

    @Test
    void deveCalcularCustoTotalDosSalarios() {
        Funcionario gerente = new Gerente("João", 5000.0, 1000.0);
        Vendedor vendedor = new Vendedor("Carlos", 2000.0, 100.0);
        vendedor.registrarVenda();
        vendedor.registrarVenda();
        Funcionario consultor = new Consultor("Maria", 3000.0, 50.0);

        Empresa empresa = new Empresa(new ArrayList<>(Arrays.asList(gerente, vendedor, consultor)));

        assertEquals(19200.0, empresa.calcularCustoSalarios(), 0.001);
    }
}
