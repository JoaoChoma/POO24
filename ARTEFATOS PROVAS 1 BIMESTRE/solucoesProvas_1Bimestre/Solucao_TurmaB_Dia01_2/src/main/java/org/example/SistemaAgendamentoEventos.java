package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaAgendamentoEventos {
    public static void main(String[] args) {

        List<String> participantesWorkshop = new ArrayList<>();
        participantesWorkshop.add("Alice");
        participantesWorkshop.add("Bob");
        Workshop workshop = new Workshop("Workshop de Java", "2024-10-15", participantesWorkshop);
        System.out.println(workshop.agendar());
        System.out.println(workshop.inscreverParticipante("Carlos"));

        System.out.println(workshop.agendar());
        for (int i = 0; i < 32; i++) {
            workshop.inscreverParticipante(" Participante " + i );
        }
        for (String participante : workshop.getParticipantes()) {
            System.out.println(participante);
        }


        List<String> ambientes = new ArrayList<>();
        ambientes.add("Sala de Conferência");
        ambientes.add("Área de Refeições");
        EventoCorporativo eventoCorporativo = new EventoCorporativo("Evento Corporativo Anual", "2024-11-10", ambientes);
        System.out.println(eventoCorporativo.agendar());
        System.out.println(eventoCorporativo.verificarAmbientes());
    }
}
