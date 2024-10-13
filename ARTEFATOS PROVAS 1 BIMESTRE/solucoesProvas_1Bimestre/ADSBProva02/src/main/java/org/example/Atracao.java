package org.example;

public abstract class Atracao {
    private String nome;
    private int capacidadeMaxima;
    private int duracaoMedia; // em minutos

    public Atracao(String nome, int capacidadeMaxima, int duracaoMedia) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.duracaoMedia = duracaoMedia;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public int getDuracaoMedia() {
        return duracaoMedia;
    }

    public abstract boolean podeAcessar(Visitante visitante);
}
