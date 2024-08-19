package org.example;

public class Biblioteca {
    public static void main(String[] args) {
        // Criando objetos da classe Livro
        Livro livro1 = new Livro("Java: Como Programar", "Deitel & Deitel", 2017);
        Livro livro2 = new Livro("Clean Code", "Robert C. Martin", 2008);

        // Exibindo informações dos livros
        System.out.println("Livro 1: " + livro1.getTitulo() + " por " + livro1.getAutor());
        System.out.println("Livro 2: " + livro2.getTitulo() + " por " + livro2.getAutor());

        // Emprestando o primeiro livro
        livro1.emprestar();

        // Tentando emprestar o mesmo livro novamente
        livro1.emprestar();

        // Devolvendo o livro
        livro1.devolver();

        // Tentando emprestar o livro novamente
        livro1.emprestar();
    }
}
