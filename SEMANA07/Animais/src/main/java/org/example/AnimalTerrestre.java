package org.example;

public class AnimalTerrestre extends Animal implements Terra{


    public AnimalTerrestre(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor);
    }

    @Override
    public void andar() {
        System.out.println("Caminhar");
    }
}
