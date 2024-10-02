package org.example;

public class SistemaAgendamentoEventos {
    public static void main(String[] args) {

        Workshop workshop = new Workshop("Workshop de Java", "2024-10-10");
        System.out.println(workshop.agendar());
        workshop.inscreverParticipante();
        workshop.inscreverParticipante();


        Reuniao reuniaoPublica = new Reuniao("Reunião de Projeto", "2024-10-12", false);
        System.out.println(reuniaoPublica.agendar());
        reuniaoPublica.inscreverParticipante();


        Reuniao reuniaoPrivada = new Reuniao("Reunião de Estratégia", "2024-10-15", true);
        System.out.println(reuniaoPrivada.agendar());
        reuniaoPrivada.acessarReuniao("12345");  // Acesso com senha correta

    }
}
