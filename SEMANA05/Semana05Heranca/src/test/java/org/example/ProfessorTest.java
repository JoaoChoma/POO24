package org.example;

import org.example.Professor;
import org.example.Aluno;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ProfessorTest {

    @Test
    public void testCriacaoProfessor() {
        Professor professor = new Professor("Professor Silva", 45);
        assertEquals("Professor Silva", professor.getNome());
        assertEquals(45, professor.getIdade());
        assertTrue(professor.getAlunos().isEmpty());
    }

    @Test
    public void testAdicionarAluno() {
        Professor professor = new Professor("Professor Silva", 45);
        Aluno aluno = new Aluno("João", 20);

        professor.adicionarAluno(aluno);

        List<Aluno> alunos = professor.getAlunos();
        assertEquals(1, alunos.size());
        assertEquals("João", alunos.get(0).getNome());
    }

    @Test
    public void testAdicionarVariosAlunos() {
        Professor professor = new Professor("Professora Souza", 38);
        Aluno aluno1 = new Aluno("Ana", 19);
        Aluno aluno2 = new Aluno("Pedro", 21);

        professor.adicionarAluno(aluno1);
        professor.adicionarAluno(aluno2);

        List<Aluno> alunos = professor.getAlunos();
        assertEquals(2, alunos.size());
        assertEquals("Ana", alunos.get(0).getNome());
        assertEquals("Pedro", alunos.get(1).getNome());
    }
}
