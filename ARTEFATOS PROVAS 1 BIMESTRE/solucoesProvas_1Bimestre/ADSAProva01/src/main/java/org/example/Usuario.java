package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String nome;
    private int limiteEmprestimos;
    private List<Midia> emprestimos;

    public Usuario(String nome, int limiteEmprestimos) {
        this.nome = nome;
        this.limiteEmprestimos = limiteEmprestimos;
        this.emprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public boolean podeEmprestar() {
        return emprestimos.size() < limiteEmprestimos;
    }

    public void emprestarMidia(Midia midia) {
        if (podeEmprestar()) {
            emprestimos.add(midia);
            midia.setEmprestado(true);
            System.out.println(nome + " emprestou " + midia.getTitulo() + " por " + midia.getPrazoEmprestimo() + " dias.");
        } else {
            System.out.println(nome + " atingiu o limite de empréstimos.");
        }
    }

    public void devolverMidia(Midia midia) {
        if (emprestimos.remove(midia)) {
            midia.setEmprestado(false);
            System.out.println(nome + " devolveu " + midia.getTitulo() + ".");
        } else {
            System.out.println(nome + " não possui essa mídia emprestada.");
        }
    }

    public abstract int getLimiteRenovacoes();
}
