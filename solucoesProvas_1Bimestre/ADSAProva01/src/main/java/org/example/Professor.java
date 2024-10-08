package org.example;

public class Professor extends Usuario {
    public Professor(String nome) {
        super(nome, 5);
    }

    @Override
    public int getLimiteRenovacoes() {
        return 3;
    }
}
