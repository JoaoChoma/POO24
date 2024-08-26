package org.example;

import org.example.Professor;
import org.example.Aluno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ProfessorTest {

    @Test
    public void testCriacaoProfessor() {
        Professor professor = new Professor("Professor Silva");
        assertEquals("Professor Silva", professor.getNome());
        assertTrue(professor.getAlunos().isEmpty());
    }

    @Test
    public void testAdicionarAluno() {
        Professor professor = new Professor("Professor Silva");
        Aluno aluno = new Aluno("João");

        professor.adicionarAluno(aluno);

        List<Aluno> alunos = professor.getAlunos();
        assertEquals(1, alunos.size());
        assertEquals("João", alunos.get(0).getNome());
    }

    @Test
    public void testAdicionarVariosAlunos() {
        Professor professor = new Professor("Professora Souza");
        Aluno aluno1 = new Aluno("Ana");
        Aluno aluno2 = new Aluno("Pedro");

        professor.adicionarAluno(aluno1);
        professor.adicionarAluno(aluno2);

        List<Aluno> alunos = professor.getAlunos();
        assertEquals(2, alunos.size());
        assertEquals("Ana", alunos.get(0).getNome());
        assertEquals("Pedro", alunos.get(1).getNome());
    }
}

