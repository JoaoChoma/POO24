package org.example;

public class Aluno extends Usuario {
    public Aluno(String nome) {
        super(nome, 3);
    }

    @Override
    public int getLimiteRenovacoes() {
        return 1;
    }
}

