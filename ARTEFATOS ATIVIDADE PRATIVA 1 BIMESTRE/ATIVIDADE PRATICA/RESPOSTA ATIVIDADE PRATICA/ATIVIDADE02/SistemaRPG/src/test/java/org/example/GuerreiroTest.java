package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuerreiroTest {

    @Test
    void testAtacarComForcaExtra() {
        Guerreiro guerreiro = new Guerreiro("Thorin", 10, 100, 20, 10, 5, 2);
        Personagem inimigo = new Mago("Gandalf", 10, 80, 15, 5, 50, 25);
        guerreiro.atacar(inimigo);
        assertEquals(63, inimigo.hp); // 20 + 5 (força extra) - 5 (defesa) = 20 de dano
    }
}

