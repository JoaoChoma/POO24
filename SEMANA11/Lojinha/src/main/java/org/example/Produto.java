package org.example;

class Produto {
    private String nome;
    private double preco;
    private CategoriaProduto categoria;

    public Produto(String nome, double preco, CategoriaProduto categoria) throws CategoriaInvalidaException {
        if (categoria == null) {
            throw new CategoriaInvalidaException("Categoria inválida: Não é possível criar um produto sem categoria.");
        }
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public double calcularPrecoFinal() {
        double desconto = categoria.getDesconto();
        return preco - (preco * desconto);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço original: R$" + preco + ", Preço com desconto: R$" + calcularPrecoFinal();
    }
}
