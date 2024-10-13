package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PontuacaoTest {

    @Test
    public void testAdicionarPontos() {
        Pontuacao pontuacao = new Pontuacao();
        pontuacao.adicionarPontos(10);

        assertEquals(10, pontuacao.getPontuacao());
    }

    @Test
    public void testRemoverPontos() {
        Pontuacao pontuacao = new Pontuacao();
        pontuacao.adicionarPontos(10);
        pontuacao.removerPontos(5);

        assertEquals(5, pontuacao.getPontuacao());
    }

    @Test
    public void testNaoPermitirPontuacaoNegativa() {
        Pontuacao pontuacao = new Pontuacao();
        pontuacao.adicionarPontos(10);
        pontuacao.removerPontos(15); // Tentar remover mais do que o disponível

        assertEquals(10, pontuacao.getPontuacao()); // A pontuação não deve ser alterada
    }
}

