package org.example;

public class Main {
    public static void main(String[] args) {

        SistemaParque parque = new SistemaParque();

        Atracao montanhaRussa = new MontanhaRussa("Thunder Coaster", 20, 5, 12, 1.4);
        Atracao carrossel = new Carrossel("Carrossel Encantado", 30, 3);
        Atracao show = new Show("Show de Mágica", 100, 60, "15:00");

        parque.adicionarAtracao(montanhaRussa);
        parque.adicionarAtracao(carrossel);
        parque.adicionarAtracao(show);


        Visitante regular = new VisitanteRegular("João", 25, 1.75);
        Visitante vip = new VisitanteVIP("Maria", 30, 1.65);
        Visitante familiar = new VisitanteFamiliar("Pedro", 35, 1.80, 4);

        parque.registrarVisitante(regular);
        parque.registrarVisitante(vip);
        parque.registrarVisitante(familiar);


        parque.acessarAtracao(regular, montanhaRussa);
        parque.acessarAtracao(vip, carrossel);
        parque.acessarAtracao(familiar, montanhaRussa); // Familia pode acessar, desde que cumpra requisitos
        parque.acessarAtracao(familiar, show);


        parque.gerarRelatorioUso();
    }
}