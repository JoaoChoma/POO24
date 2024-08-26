package org.example;

import org.example.Aluno;
import org.example.Professor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AlunoTest {

    @Test
    public void testCriacaoAluno() {
        Aluno aluno = new Aluno("João");
        assertEquals("João", aluno.getNome());
        assertTrue(aluno.getProfessores().isEmpty());
    }

    @Test
    public void testAdicionarProfessor() {
        Aluno aluno = new Aluno("João");
        Professor professor = new Professor("Professor Silva");

        aluno.adicionarProfessor(professor);

        List<Professor> professores = aluno.getProfessores();
        assertEquals(1, professores.size());
        assertEquals("Professor Silva", professores.get(0).getNome());
    }

    @Test
    public void testAdicionarVariosProfessores() {
        Aluno aluno = new Aluno("Maria");
        Professor professor1 = new Professor("Professor Lima");
        Professor professor2 = new Professor("Professora Souza");

        aluno.adicionarProfessor(professor1);
        aluno.adicionarProfessor(professor2);

        List<Professor> professores = aluno.getProfessores();
        assertEquals(2, professores.size());
        assertEquals("Professor Lima", professores.get(0).getNome());
        assertEquals("Professora Souza", professores.get(1).getNome());
    }
}

