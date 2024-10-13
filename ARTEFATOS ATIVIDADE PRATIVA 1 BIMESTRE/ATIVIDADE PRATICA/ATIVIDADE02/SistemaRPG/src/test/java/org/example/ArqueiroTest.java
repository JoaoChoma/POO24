package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArqueiroTest {

    @Test
    void testAtirarFlecha() {
        Arqueiro arqueiro = new Arqueiro("Legolas", 10, 90, 18, 8, 10, 15);
        Personagem inimigo = new Guerreiro("Thorin", 10, 100, 20, 10, 5, 2);
        arqueiro.atirarFlecha(inimigo);
        assertEquals(80, inimigo.hp); // 18 + 10 (precisão) - 10 (defesa) = 18 de dano
    }
}

