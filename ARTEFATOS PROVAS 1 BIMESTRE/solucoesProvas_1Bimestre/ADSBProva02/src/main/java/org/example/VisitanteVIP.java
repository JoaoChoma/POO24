package org.example;

public class VisitanteVIP extends Visitante {
    public VisitanteVIP(String nome, int idade, double altura) {
        super(nome, idade, altura, "VIP");
    }

    @Override
    public String getTipo() {
        return "Visitante VIP";
    }
}
