package org.example;

public abstract class Evento {
    private String nome;
    private String data;
    private int participantes;

    public Evento(String nome, String data) {
        this.nome = nome;
        this.data = data;
        this.participantes = 0;
    }

    public abstract String agendar();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public abstract void inscreverParticipante();
}
