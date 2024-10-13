package org.example;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> jogadores;
    private int pontos;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
        this.pontos = 0;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
