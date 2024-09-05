package org.example;

class Bicicleta implements Transporte {
    private final double velocidadeMedia = 20; // Velocidade média de uma bicicleta (km/h)

    @Override
    public double calcularTempo(double distancia) {
        return distancia / velocidadeMedia;
    }
}

