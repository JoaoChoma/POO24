package org.example;

class Encomenda {
    private String descricao;
    private double peso;
    private double volume;
    private boolean altaPrioridade; // Alta prioridade para usar veículos mais rápidos

    public Encomenda(String descricao, double peso, double volume, boolean altaPrioridade) {
        this.descricao = descricao;
        this.peso = peso;
        this.volume = volume;
        this.altaPrioridade = altaPrioridade;
    }

    public double getPeso() {
        return peso;
    }

    public double getVolume() {
        return volume;
    }

    public boolean isAltaPrioridade() {
        return altaPrioridade;
    }

    @Override
    public String toString() {
        return "Encomenda: " + descricao + ", Peso: " + peso + " kg, Volume: " + volume + " m³, Alta Prioridade: " + altaPrioridade;
    }
}
