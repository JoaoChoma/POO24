package org.example;

public class VisitanteFamiliar extends Visitante {
    private int membrosFamilia;

    public VisitanteFamiliar(String nome, int idade, double altura, int membrosFamilia) {
        super(nome, idade, altura, "Familiar");
        this.membrosFamilia = membrosFamilia;
    }

    public int getMembrosFamilia() {
        return membrosFamilia;
    }

    @Override
    public String getTipo() {
        return "Visitante Familiar";
    }
}
