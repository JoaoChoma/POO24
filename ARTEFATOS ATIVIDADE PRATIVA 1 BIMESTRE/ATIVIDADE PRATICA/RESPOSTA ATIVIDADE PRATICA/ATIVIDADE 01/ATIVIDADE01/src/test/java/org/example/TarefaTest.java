package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TarefaTest {

        @Test
        public void testValoresIniciais() {
            Tarefa tarefa1 = new Tarefa("Estudar Java", "2024-09-01");

            assertEquals("Estudar Java", tarefa1.getNome());
            assertEquals("2024-09-01", tarefa1.getPrazo());
            assertFalse(tarefa1.isConcluida());
        }

        @Test
        public void testConcluirTarefa() {
            Tarefa tarefa1 = new Tarefa("Estudar Java", "2024-09-01");
            tarefa1.concluirTarefa();

            assertTrue(tarefa1.isConcluida());
        }

        @Test
        public void testAlterarPrazo() {
            Tarefa tarefa1 = new Tarefa("Estudar Java", "2024-09-01");
            tarefa1.alterarPrazo("2024-09-10");

            assertEquals("2024-09-10", tarefa1.getPrazo());
        }
    }
