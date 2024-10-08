package org.example;

public class Main {
    public static void main(String[] args) {

        SistemaTransporteHospitalar sistema = new SistemaTransporteHospitalar();


        Paciente adulto = new PacienteAdulto("João");
        Paciente infantil = new PacienteInfantil("Maria");
        Paciente infectado = new PacienteInfectado("Carlos");


        Transporte transporteUrgencia = new TransporteUrgencia(adulto);
        Transporte transporteRotina = new TransporteRotina(infantil);
        Transporte transporteIsolamento = new TransporteIsolamento(infectado);


        sistema.agendarTransporte(adulto, transporteUrgencia); // Transporte válido
        sistema.agendarTransporte(infantil, transporteRotina);  // Transporte inválido, erro
        sistema.agendarTransporte(infectado, transporteRotina); // Transporte inválido, erro
        sistema.agendarTransporte(infectado, transporteIsolamento); // Transporte válido

    }
}