package org.example;

public class Livro {
    // Atributos da classe Livro
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    // Construtor da classe Livro
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true; // O livro começa como disponível
    }

    // Métodos da classe Livro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + titulo + "' não está disponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("O livro '" + titulo + "' foi devolvido.");
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", disponivel=" + disponivel +
                '}';
    }
}

