package org.example;

public class SistemaCalculo {
    public static void main(String[] args) {
        // Criando um objeto da classe Calculadora
        Calculadora calc = new Calculadora();

        // Usando o polimorfismo de sobrecarga para somar diferentes tipos de valores
        int resultado1 = calc.somar(10, 20); // Usa o método somar com dois inteiros
        System.out.println("Resultado 1: " + resultado1);

        int resultado2 = calc.somar(10, 20, 30); // Usa o método somar com três inteiros
        System.out.println("Resultado 2: " + resultado2);

        double resultado3 = calc.somar(10.5, 20.5); // Usa o método somar com dois doubles
        System.out.println("Resultado 3: " + resultado3);
    }
}
