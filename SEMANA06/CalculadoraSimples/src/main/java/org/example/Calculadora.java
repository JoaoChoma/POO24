package org.example;

class Calculadora {

    // Método para somar dois números inteiros
    public int somar(int a, int b) {
        System.out.println("Somando dois números inteiros: " + a + " + " + b);
        return a + b;
    }

    // Método para somar três números inteiros
    public int somar(int a, int b, int c) {
        System.out.println("Somando três números inteiros: " + a + " + " + b + " + " + c);
        return a + b + c;
    }

    // Método para somar dois números de ponto flutuante (double)
    public double somar(double a, double b) {
        System.out.println("Somando dois números decimais: " + a + " + " + b);
        return a + b;
    }
}
