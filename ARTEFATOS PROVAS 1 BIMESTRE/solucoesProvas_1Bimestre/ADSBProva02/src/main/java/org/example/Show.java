package org.example;

public class Show extends Atracao {
    private String horarioInicio;

    public Show(String nome, int capacidadeMaxima, int duracaoMedia, String horarioInicio) {
        super(nome, capacidadeMaxima, duracaoMedia);
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    @Override
    public boolean podeAcessar(Visitante visitante) {
        return true; // Todos podem acessar, desde que haja disponibilidade de ingressos
    }
}