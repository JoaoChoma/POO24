package org.example;

public class Cavalo extends AnimalTerrestre implements Terra{


    public Cavalo(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor);
    }

    @Override
    public void andar() {
        System.out.println("Cavalo cavalga");
    }

    public void emitirSom(){
        System.out.println("Relinxar");
    }
}
