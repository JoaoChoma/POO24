package org.example;

public class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String som;
    private String cor;

    public Animal(String nome, int idade, double peso, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}

