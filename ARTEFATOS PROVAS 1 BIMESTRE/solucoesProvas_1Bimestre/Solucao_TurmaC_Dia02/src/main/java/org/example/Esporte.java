package org.example;

abstract class Esporte {
    protected String nome;

    public Esporte(String nome) {
        this.nome = nome;
    }

    public abstract void registrarPartida(Partida partida);

    public abstract void calcularPontuacao(Time timeVencedor, Time timePerdedor, boolean empate);

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

// Classe Futebol
class Futebol extends Esporte {
    private final int maxSubstituicoes = 3;

    public Futebol() {
        super("Futebol");
    }

    @Override
    public void registrarPartida(Partida partida) {
        if (partida.getTime1().getJogadores().size() != 11 || partida.getTime2().getJogadores().size() != 11) {
            System.out.println("Uma partida de futebol deve ter 11 jogadores por time.");
        } else {
            System.out.println("Partida de Futebol registrada entre " + partida.getTime1().getNome() + " e " + partida.getTime2().getNome());
        }
    }

    @Override
    public void calcularPontuacao(Time timeVencedor, Time timePerdedor, boolean empate) {
        if (empate) {
            timeVencedor.adicionarPontos(1);
            timePerdedor.adicionarPontos(1);
        } else {
            timeVencedor.adicionarPontos(3);
        }
    }

    public int getMaxSubstituicoes() {
        return maxSubstituicoes;
    }
}
