package org.example;

class Workshop extends Evento {
    private int limiteParticipantes;

    public Workshop(String nome, String data) {
        super(nome, data);
        limiteParticipantes = 30;
    }

    @Override
    public String agendar() {
        return "Workshop '" + getNome() + "' agendado para " + getData();
    }

    @Override
    public void inscreverParticipante() {
        if (getParticipantes() < limiteParticipantes) {
            setParticipantes(getParticipantes() + 1);
            System.out.println("Participante inscrito no workshop. Total: " + getParticipantes());
        } else {
            System.out.println("Limite de participantes atingido para o workshop.");
        }
    }
}
