package org.example;

public class VisitanteRegular extends Visitante {
    public VisitanteRegular(String nome, int idade, double altura) {
        super(nome, idade, altura, "Regular");
    }

    @Override
    public String getTipo() {
        return "Visitante Regular";
    }
}