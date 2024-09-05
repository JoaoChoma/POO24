package org.example;

public class SistemaTransporte {
    public static void main(String[] args) {
        // Criando diferentes tipos de transporte
        Transporte carro = new Carro();
        Transporte bicicleta = new Bicicleta();
        Transporte onibus = new Onibus();

        // Definindo a distância da viagem
        double distancia = 100; // em quilômetros

        // Aplicando o polimorfismo para calcular o tempo de viagem para cada transporte
        calcularTempoViagem(carro, distancia);
        calcularTempoViagem(bicicleta, distancia);
        calcularTempoViagem(onibus, distancia);
    }

    // Método genérico que calcula o tempo de viagem
    public static void calcularTempoViagem(Transporte transporte, double distancia) {
        double tempo = transporte.calcularTempo(distancia);
        System.out.println("Tempo de viagem: " + tempo + " horas");
    }
}

