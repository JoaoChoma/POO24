package org.example;

enum CategoriaProduto {
    ELETRONICO(0.10),
    ALIMENTO(0.05),
    VESTUARIO(0.20),
    LIVRO(0.0);

    private double desconto;

    CategoriaProduto(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
}
