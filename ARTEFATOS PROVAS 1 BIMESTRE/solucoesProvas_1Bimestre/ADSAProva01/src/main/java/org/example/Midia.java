package org.example;

public abstract class Midia {
    protected String titulo;
    protected boolean emprestado;

    public Midia(String titulo) {
        this.titulo = titulo;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public abstract int getPrazoEmprestimo();
}
