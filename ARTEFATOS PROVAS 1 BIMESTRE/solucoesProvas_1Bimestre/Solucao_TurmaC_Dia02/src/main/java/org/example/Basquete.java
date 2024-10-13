package org.example;

public class Basquete extends Esporte {

    public Basquete() {
        super("Basquete");
    }

    @Override
    public void registrarPartida(Partida partida) {
        if (partida.getTime1().getJogadores().size() != 5 || partida.getTime2().getJogadores().size() != 5) {
            System.out.println("Uma partida de basquete deve ter 5 jogadores por time.");
        } else {
            System.out.println("Partida de Basquete registrada entre " + partida.getTime1().getNome() + " e " + partida.getTime2().getNome());
        }
    }

    @Override
    public void calcularPontuacao(Time timeVencedor, Time timePerdedor, boolean empate) {
        timeVencedor.adicionarPontos(2);
    }
}
