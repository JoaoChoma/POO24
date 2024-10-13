package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstagiarioTest {

    @Test
    void testCalcularSalarioBolsaAuxilio() {
        Estagiario estagiario = new Estagiario("Pedro", "111.222.333-44", "IFPR", 1500);
        assertEquals(1500.0, estagiario.calcularSalario(), 0.001);
    }

    @Test
    void testExibirInformacoes() {
        Estagiario estagiario = new Estagiario("Pedro", "111.222.333-44", "IFPR", 1500);
        estagiario.exibirInformacoes();
        assertEquals("Pedro", estagiario.getNome());
        assertEquals("111.222.333-44", estagiario.getCpf());
        assertEquals(1500.0, estagiario.calcularSalario(), 0.001);
        assertEquals("IFPR", estagiario.getInstituicaoEnsino());
    }
}

