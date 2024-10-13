package org.example;

public abstract class Robo {
    private String nome;
    private String programador;
    private int pontuacao;

    public Robo(String nome, String programador) {
        this.nome = nome;
        this.programador = programador;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getProgramador() {
        return programador;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void adicionarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    public abstract void competir();

    public abstract String getTipo();
}
