package org.example;

public class Loja {
    public static void main(String[] args) {
        CategoriaProduto categoria = CategoriaProduto.ELETRONICO;
        System.out.println("O desconto para eletronicos é: " + categoria.getDesconto() * 100 + "%");
    }
}

