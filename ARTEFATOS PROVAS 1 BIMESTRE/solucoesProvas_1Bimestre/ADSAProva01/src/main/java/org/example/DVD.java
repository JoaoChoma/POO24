package org.example;

public class DVD extends Midia {
    public DVD(String titulo) {
        super(titulo);
    }

    @Override
    public int getPrazoEmprestimo() {
        return 7;
    }
}
