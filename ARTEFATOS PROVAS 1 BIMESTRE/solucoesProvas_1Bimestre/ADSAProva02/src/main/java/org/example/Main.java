package org.example;

public class Main {
    public static void main(String[] args) {

        Competicao competicao = new Competicao();

        Robo robo1 = new RoboNavegacao("RoboNavigator", "Alice", 120);
        Robo robo2 = new RoboColeta("RoboCollector", "Bob", 15);
        Robo robo3 = new RoboCombate("RoboFighter", "Carlos", 10);

        competicao.registrarRobo(robo1);
        competicao.registrarRobo(robo2);
        competicao.registrarRobo(robo3);

        competicao.realizarRodadas();

        competicao.gerarRanking();
        competicao.exibirRankingFinal();
    }
}