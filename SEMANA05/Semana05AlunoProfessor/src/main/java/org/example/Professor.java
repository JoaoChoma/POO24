package org.example;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Aluno> alunos; // Associação com a classe Aluno

    public Professor(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
