package org.example;

public class LivroFisico extends Midia {
    public LivroFisico(String titulo) {
        super(titulo);
    }

    @Override
    public int getPrazoEmprestimo() {
        return 14;
    }
}
