package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        FizzBuzz fizzbuzz = new FizzBuzz(n);
        fizzbuzz.executar();
    }
}