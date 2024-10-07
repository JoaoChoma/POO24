package org.example.model;

public class Tarefa {
    private int id;
    private String descricao;
    private boolean completa;

    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.completa = false;  // Tarefas começam como incompletas
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    @Override
    public String toString() {
        return (completa ? "[X]" : "[ ]") + " Tarefa #" + id + ": " + descricao;
    }
}
