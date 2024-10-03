package org.example;

public class Main {
    public static void main(String[] args) {
        try {

            Produto p1 = new Produto("Smartphone", 1500.00, CategoriaProduto.ELETRONICO);
            System.out.println(p1);


            Produto p2 = new Produto("Pizza", 50.00, CategoriaProduto.ALIMENTO);
            System.out.println(p2);


            Produto p3 = new Produto("Camiseta", 100.00, CategoriaProduto.VESTUARIO);
            System.out.println(p3);


            Produto p4 = new Produto("Livro de Java", 80.00, CategoriaProduto.LIVRO);
            System.out.println(p4);


            Produto p5 = new Produto("Bicicleta", 1200.00, null); // Deve lançar exceção

        } catch (CategoriaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}