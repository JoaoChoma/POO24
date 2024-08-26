package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void testCriacaoPessoa() {
        Pessoa pessoa = new Pessoa("Carlos", 30);
        assertEquals("Carlos", pessoa.getNome());
        assertEquals(30, pessoa.getIdade());
    }
}
