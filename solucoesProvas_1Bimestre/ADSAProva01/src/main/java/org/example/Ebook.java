package org.example;

public class Ebook extends Midia {
    public Ebook(String titulo) {
        super(titulo);
    }

    @Override
    public int getPrazoEmprestimo() {
        return 21;
    }
}
