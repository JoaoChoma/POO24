package org.example;

public class SistemaCampeonato {
    public static void main(String[] args) {
        // Criando Esportes
        Esporte futebol = new Futebol();
        Esporte basquete = new Basquete();
        Esporte tenis = new Tenis();

        // Criando Jogadores
        Jogador jogador1 = new Jogador("Alice");
        Jogador jogador2 = new Jogador("Bob");
        Jogador jogador3 = new Jogador("Carlos");
        Jogador jogador4 = new Jogador("David");
        Jogador jogador5 = new Jogador("Eva");
        Jogador jogador6 = new Jogador("Frank");

        // Criando Times de Futebol
        Time timeFutebol1 = new Time("Time A");
        Time timeFutebol2 = new Time("Time B");

        // Adicionando jogadores aos times de futebol
        for (int i = 0; i < 12; i++) {
            timeFutebol1.adicionarJogador(new Jogador("JogadorA" + (i+1)));
            timeFutebol2.adicionarJogador(new Jogador("JogadorB" + (i+1)));
        }

        // Criando Times de Basquete
        Time timeBasquete1 = new Time("Basquete A");
        Time timeBasquete2 = new Time("Basquete B");

        // Adicionando jogadores aos times de basquete
        for (int i = 0; i < 6; i++) {
            timeBasquete1.adicionarJogador(new Jogador("BasqueteJogadorA" + (i+1)));
            timeBasquete2.adicionarJogador(new Jogador("BasqueteJogadorB" + (i+1)));
        }

        // Registrando Partidas de Futebol
        Partida partidaFutebol = new Partida(timeFutebol1, timeFutebol2, futebol);
        futebol.registrarPartida(partidaFutebol);

        // Definir resultado da partida de futebol
        partidaFutebol.registrarResultado(timeFutebol1, timeFutebol2);
        System.out.println("Pontuação Time A: " + timeFutebol1.getPontos());
        System.out.println("Pontuação Time B: " + timeFutebol2.getPontos());

        // Registrando Partidas de Basquete
        Partida partidaBasquete = new Partida(timeBasquete1, timeBasquete2, basquete);
        basquete.registrarPartida(partidaBasquete);

        // Definir resultado da partida de basquete
        partidaBasquete.registrarResultado(timeBasquete1, timeBasquete2);
        System.out.println("Pontuação Basquete A: " + timeBasquete1.getPontos());
        System.out.println("Pontuação Basquete B: " + timeBasquete2.getPontos());

        // Registrando Partida de Tênis (individual)
        Partida partidaTenis = new Partida(jogador1, jogador2, tenis);
        tenis.registrarPartida(partidaTenis);

        // Definir resultado da partida de tênis
        partidaTenis.registrarResultado(jogador1, jogador2);
    }
}

