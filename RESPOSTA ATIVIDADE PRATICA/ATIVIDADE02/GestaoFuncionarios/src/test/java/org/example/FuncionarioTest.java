package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void testCalcularSalario() {
        Funcionario funcionario = new Funcionario("Ana", "123.456.789-00", 3000);
        assertEquals(3000.0, funcionario.calcularSalario(), 0.001);
    }

    @Test
    void testGettersAndSetters() {
        Funcionario funcionario = new Funcionario("Ana", "123.456.789-00", 3000);
        funcionario.setNome("Ana Silva");
        funcionario.setCpf("111.222.333-44");
        funcionario.setSalarioBase(3200);

        assertEquals("Ana Silva", funcionario.getNome());
        assertEquals("111.222.333-44", funcionario.getCpf());
        assertEquals(3200.0, funcionario.getSalarioBase(), 0.001);
    }
}
