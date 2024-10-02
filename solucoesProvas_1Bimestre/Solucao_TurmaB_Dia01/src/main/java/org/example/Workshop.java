package org.example;

import java.util.List;

class Workshop extends Evento {
    private List<String> participantes;
    private final int limiteParticipantes = 30;

    public Workshop(String nome, String data, List<String> participantes) {
        super(nome, data);
        this.participantes = participantes;
    }

    public String inscreverParticipante(String participante) {
        if (participantes.size() < limiteParticipantes) {
            participantes.add(participante);
            return "Participante " + participante + " inscrito com sucesso.";
        } else {
            return "Limite de participantes atingido.";
        }
    }

    public List<String> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<String> participantes) {
        this.participantes = participantes;
    }
}
