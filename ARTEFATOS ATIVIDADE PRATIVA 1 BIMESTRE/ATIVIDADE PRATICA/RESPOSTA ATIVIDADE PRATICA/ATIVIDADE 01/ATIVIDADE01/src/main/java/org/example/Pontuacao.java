package org.example;

public class Pontuacao {
    private int pontos;

    public Pontuacao() {
        this.pontos = 0;
    }

    public void adicionarPontos(int pontos) {
        if (pontos > 0) {
            this.pontos += pontos;
        }
    }

    public void removerPontos(int pontos) {
        if (pontos > 0 && this.pontos >= pontos) {
            this.pontos -= pontos;
        }
    }

    public int getPontuacao() {
        return pontos;
    }
}
