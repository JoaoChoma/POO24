package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioMeioPeriodoTest {

    @Test
    void testCalcularSalarioPorHora() {
        FuncionarioMeioPeriodo funcionario = new FuncionarioMeioPeriodo("Maria", "987.654.321-00", 20, 50);
        assertEquals(1000.0, funcionario.calcularSalario(), 0.001);
    }

    @Test
    void testExibirInformacoes() {
        FuncionarioMeioPeriodo funcionario = new FuncionarioMeioPeriodo("Maria", "987.654.321-00", 20, 50);
        funcionario.exibirInformacoes();
        assertEquals("Maria", funcionario.getNome());
        assertEquals("987.654.321-00", funcionario.getCpf());
        assertEquals(1000.0, funcionario.calcularSalario(), 0.001);
    }
}

