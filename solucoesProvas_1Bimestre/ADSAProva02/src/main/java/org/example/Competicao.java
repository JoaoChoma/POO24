package org.example;

import java.util.ArrayList;
import java.util.List;

public class Competicao {
    private List<Robo> robos;
    private List<Robo> ranking;

    public Competicao() {
        this.robos = new ArrayList<>();
        this.ranking = new ArrayList<>();
    }

    public void registrarRobo(Robo robo) {
        robos.add(robo);
        System.out.println(robo.getNome() + " foi registrado na competição.");
    }

    public void realizarRodadas() {
        for (Robo robo : robos) {
            robo.competir();
        }
    }

    public void gerarRanking() {
        // Ordena robôs pela pontuação de forma decrescente
        robos.sort((r1, r2) -> r2.getPontuacao() - r1.getPontuacao());
        ranking = new ArrayList<>(robos);
    }

    public void exibirRankingFinal() {
        System.out.println("Ranking Final da Competição:");
        for (int i = 0; i < ranking.size(); i++) {
            Robo robo = ranking.get(i);
            System.out.println((i + 1) + "º - " + robo.getNome() + " (" + robo.getTipo() + ") - Pontuação: " + robo.getPontuacao());
        }
    }
}
