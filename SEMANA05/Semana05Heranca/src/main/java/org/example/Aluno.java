package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<Professor> professores;

    public Aluno(String nome, int idade) {
        super(nome, idade);
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public List<Professor> getProfessores() {
        return professores;
    }
}