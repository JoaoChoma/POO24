package org.example;

public class Pato extends Animal implements Ar, Terra, Agua{

    public Pato(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor);
    }

    @Override
    public void nadar() {
        System.out.println("O pato nada.");
    }

    @Override
    public void voar() {

    }

    @Override
    public void andar() {

    }
}
