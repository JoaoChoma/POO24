package org.example;

public class Tarefa {
    private String nome;
    private String prazo;
    private boolean concluida;

    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        this.concluida = false;
    }

    public void concluirTarefa() {
        this.concluida = true;
    }

    public void alterarPrazo(String novoPrazo) {
        this.prazo = novoPrazo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }
}

