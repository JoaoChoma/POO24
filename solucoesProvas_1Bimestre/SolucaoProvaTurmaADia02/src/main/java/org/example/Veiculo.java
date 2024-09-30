package org.example;

abstract class Veiculo {
    private String id;
    private double capacidadePeso;
    private double capacidadeVolume;
    private boolean disponivel;

    public Veiculo(String id, double capacidadePeso, double capacidadeVolume) {
        this.id = id;
        this.capacidadePeso = capacidadePeso;
        this.capacidadeVolume = capacidadeVolume;
        this.disponivel = true;
    }

    public abstract boolean podeCarregar(double peso, double volume);

    public void atribuirEntrega() {
        this.disponivel = false;
    }

    public void liberarVeiculo() {
        this.disponivel = true;
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    @Override
    public String toString() {
        return "Veículo " + id + " - Capacidade Peso: " + capacidadePeso + " kg, Capacidade Volume: " + capacidadeVolume + " m³, Disponível: " + disponivel;
    }
}
