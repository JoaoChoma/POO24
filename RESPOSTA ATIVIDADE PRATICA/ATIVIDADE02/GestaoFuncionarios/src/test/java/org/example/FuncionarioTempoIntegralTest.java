package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTempoIntegralTest {

    @Test
    void testCalcularSalarioComBonus() {
        FuncionarioTempoIntegral funcionario = new FuncionarioTempoIntegral("João", "123.456.789-00", 5000, 10);
        assertEquals(5500.0, funcionario.calcularSalario(), 0.001);
    }

    @Test
    void testExibirInformacoes() {
        FuncionarioTempoIntegral funcionario = new FuncionarioTempoIntegral("João", "123.456.789-00", 5000, 10);
        funcionario.exibirInformacoes();
        assertEquals("João", funcionario.getNome());
        assertEquals("123.456.789-00", funcionario.getCpf());
        assertEquals(5500.0, funcionario.calcularSalario(), 0.001);
    }
}

