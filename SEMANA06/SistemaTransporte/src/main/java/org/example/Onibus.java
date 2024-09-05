package org.example;

class Onibus implements Transporte {
    private final double velocidadeMedia = 60; // Velocidade média de um ônibus (km/h)

    @Override
    public double calcularTempo(double distancia) {
        return distancia / velocidadeMedia;
    }
}

