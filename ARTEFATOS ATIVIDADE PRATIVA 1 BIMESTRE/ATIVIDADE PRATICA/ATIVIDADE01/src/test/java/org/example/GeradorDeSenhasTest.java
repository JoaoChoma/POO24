package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeradorDeSenhasTest {

    GeradorDeSenhas gerador = new GeradorDeSenhas();

    @Test
    public void testGerarSenhaComApenasLetrasMinusculas() {

        String senha = gerador.gerarSenha(10, true, false, false, false);

        assertEquals(10, senha.length());
        assertTrue(senha.matches("[a-z]+"));
    }

    @Test
    public void testGerarSenhaComLetrasMaiusculasEMinusculas() {

        String senha = gerador.gerarSenha(12, true, true, false, false);

        assertEquals(12, senha.length());
        assertTrue(senha.matches("[a-zA-Z]+"));
    }

    @Test
    public void testGerarSenhaComNumerosESimbolos() {

        String senha = gerador.gerarSenha(15, false, false, true, true);

        assertEquals(15, senha.length());
        assertTrue(senha.matches("[0-9!@#$%^&*()\\-_=+\\[\\]{}|;:',.<>?/]+"));
    }

    @Test
    public void testGerarSenhaComTodosOsCaracteres() {

        String senha = gerador.gerarSenha(20, true, true, true, true);

        assertEquals(20, senha.length());
        assertTrue(senha.matches("[a-zA-Z0-9!@#$%^&*()\\-_=+\\[\\]{}|;:',.<>?/]+"));
    }

    @Test
    public void testGerarSenhaComTamanhoZero() {

        String senha = gerador.gerarSenha(0, true, true, true, true);

        assertEquals(0, senha.length());
    }


}
