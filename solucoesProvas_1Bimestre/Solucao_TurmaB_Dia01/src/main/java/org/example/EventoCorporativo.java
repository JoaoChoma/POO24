package org.example;

import java.util.List;

public class EventoCorporativo extends Evento {
    private List<String> ambientesReservados;
    private boolean disponibilidadeAmbientes;

    public EventoCorporativo(String nome, String data, List<String> ambientesReservados) {
        super(nome, data);
        this.ambientesReservados = ambientesReservados;
        this.disponibilidadeAmbientes = true; // Simulação de disponibilidade
    }

    public String verificarAmbientes() {
        if (disponibilidadeAmbientes) {
            return "Ambientes disponíveis.";
        } else {
            return "Ambientes indisponíveis.";
        }
    }

    // Getters e Setters
    public List<String> getAmbientesReservados() {
        return ambientesReservados;
    }

    public void setAmbientesReservados(List<String> ambientesReservados) {
        this.ambientesReservados = ambientesReservados;
    }

    public boolean isDisponibilidadeAmbientes() {
        return disponibilidadeAmbientes;
    }

    public void setDisponibilidadeAmbientes(boolean disponibilidadeAmbientes) {
        this.disponibilidadeAmbientes = disponibilidadeAmbientes;
    }
}
