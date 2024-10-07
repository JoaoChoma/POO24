package org.example;

public enum CategoriaProduto {
    ELETRONICO(0.10),
    ALIMENTO(0.05),
    VESTUARIO(0.20),
    LIVRO(0.0);

    private double desconto;

    // Construtor do enum
    CategoriaProduto(double desconto) {
        this.desconto = desconto;
    }

    // Método para obter o desconto
    public double getDesconto() {
        return desconto;
    }
}
