package org.example;

class Carro implements Transporte {
    private final double velocidadeMedia = 80; // Velocidade média de um carro (km/h)

    @Override
    public double calcularTempo(double distancia) {
        return distancia / velocidadeMedia;
    }
}

