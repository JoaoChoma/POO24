package org.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();


        Midia livro1 = new LivroFisico("O Senhor dos Anéis");
        Midia dvd1 = new DVD("Matrix");
        Midia ebook1 = new Ebook("Clean Code");

        biblioteca.adicionarMidia(livro1);
        biblioteca.adicionarMidia(dvd1);
        biblioteca.adicionarMidia(ebook1);


        Usuario aluno = new Aluno("João");
        Usuario professor = new Professor("Dra. Silva");

        biblioteca.registrarUsuario(aluno);
        biblioteca.registrarUsuario(professor);

        Midia midiaEmprestada = biblioteca.buscarMidia("O Senhor dos Anéis");
        if (midiaEmprestada != null) {
            aluno.emprestarMidia(midiaEmprestada);
        } else {
            System.out.println("Mídia não disponível.");
        }

        midiaEmprestada = biblioteca.buscarMidia("Clean Code");
        if (midiaEmprestada != null) {
            professor.emprestarMidia(midiaEmprestada);
        } else {
            System.out.println("Mídia não disponível.");
        }


        aluno.devolverMidia(livro1);


        midiaEmprestada = biblioteca.buscarMidia("O Senhor dos Anéis");
        if (midiaEmprestada != null) {
            professor.emprestarMidia(midiaEmprestada);  // Vai funcionar porque a mídia foi devolvida
        } else {
            System.out.println("Mídia não disponível.");
        }
    }
}