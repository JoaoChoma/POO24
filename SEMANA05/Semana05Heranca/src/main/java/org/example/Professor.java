package org.example;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{

    private List<Aluno> alunos; // Associação com a classe Aluno

    public Professor(String nome, int idade) {
        super(nome, idade);
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
