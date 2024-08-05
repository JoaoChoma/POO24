package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        // Cria um objeto Pessoa
        Pessoa pessoa = new Pessoa("João", 25, "joao@example.com");

        // Imprime os valores da pessoa no console
        System.out.println(pessoa);

        // Alternativamente, você pode imprimir os valores individualmente
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Email: " + pessoa.email);
    }
}