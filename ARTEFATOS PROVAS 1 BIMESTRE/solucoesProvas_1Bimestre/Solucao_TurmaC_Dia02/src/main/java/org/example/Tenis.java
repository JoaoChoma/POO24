package org.example;

public class Tenis extends Esporte {

    public Tenis() {
        super("Tênis");
    }

    @Override
    public void registrarPartida(Partida partida) {
        System.out.println("Partida de Tênis registrada entre " + partida.getJogador1().getNome() + " e " + partida.getJogador2().getNome());
    }

    @Override
    public void calcularPontuacao(Time timeVencedor, Time timePerdedor, boolean empate) {
        // No tênis, o jogador individual acumula pontos
        timeVencedor.adicionarPontos(1);
    }
}
