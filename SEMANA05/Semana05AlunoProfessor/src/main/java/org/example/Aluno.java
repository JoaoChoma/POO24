package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Professor> professores; // Associação com a classe Professor

    public Aluno(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public List<Professor> getProfessores() {
        return professores;
    }
}
