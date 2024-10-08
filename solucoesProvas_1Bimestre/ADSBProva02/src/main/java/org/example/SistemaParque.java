package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaParque {
    private List<Visitante> visitantes;
    private List<Atracao> atracoes;

    public SistemaParque() {
        visitantes = new ArrayList<>();
        atracoes = new ArrayList<>();
    }

    public void registrarVisitante(Visitante visitante) {
        visitantes.add(visitante);
        System.out.println(visitante.getNome() + " foi registrado como " + visitante.getTipo() + ".");
    }

    public void adicionarAtracao(Atracao atracao) {
        atracoes.add(atracao);
        System.out.println("A atração " + atracao.getNome() + " foi adicionada ao parque.");
    }

    public void acessarAtracao(Visitante visitante, Atracao atracao) {
        if (atracao.podeAcessar(visitante)) {
            System.out.println(visitante.getNome() + " acessou a atração " + atracao.getNome() + ".");
        } else {
            System.out.println(visitante.getNome() + " não atende aos requisitos de segurança para a atração " + atracao.getNome() + ".");
        }
    }

    public void gerarRelatorioUso() {
        System.out.println("Relatório de uso do parque:");
        System.out.println("Número de visitantes registrados: " + visitantes.size());
        for (Atracao atracao : atracoes) {
            System.out.println("Atração: " + atracao.getNome() + " | Capacidade: " + atracao.getCapacidadeMaxima() + " | Duração média: " + atracao.getDuracaoMedia() + " minutos");
        }
    }
}
