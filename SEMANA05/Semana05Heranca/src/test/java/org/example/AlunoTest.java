package org.example;

import org.example.Aluno;
import org.example.Professor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AlunoTest {

    @Test
    public void testCriacaoAluno() {
        Aluno aluno = new Aluno("João", 20);
        assertEquals("João", aluno.getNome());
        assertEquals(20, aluno.getIdade());
        assertTrue(aluno.getProfessores().isEmpty());
    }

    @Test
    public void testAdicionarProfessor() {
        Aluno aluno = new Aluno("João", 20);
        Professor professor = new Professor("Professor Silva", 45);

        aluno.adicionarProfessor(professor);

        List<Professor> professores = aluno.getProfessores();
        assertEquals(1, professores.size());
        assertEquals("Professor Silva", professores.get(0).getNome());
    }

    @Test
    public void testAdicionarVariosProfessores() {
        Aluno aluno = new Aluno("Maria", 19);
        Professor professor1 = new Professor("Professor Lima", 50);
        Professor professor2 = new Professor("Professora Souza", 38);

        aluno.adicionarProfessor(professor1);
        aluno.adicionarProfessor(professor2);

        List<Professor> professores = aluno.getProfessores();
        assertEquals(2, professores.size());
        assertEquals("Professor Lima", professores.get(0).getNome());
        assertEquals("Professora Souza", professores.get(1).getNome());
    }
}

