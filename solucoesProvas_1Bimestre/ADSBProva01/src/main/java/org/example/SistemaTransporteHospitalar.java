package org.example;

public class SistemaTransporteHospitalar {
    public void agendarTransporte(Paciente paciente, Transporte transporte) {
        if (paciente instanceof PacienteInfectado && !(transporte instanceof TransporteIsolamento)) {
            System.out.println("Erro: Paciente infectado deve ser transportado em veículo de isolamento.");
        } else if (paciente instanceof PacienteInfantil && !(transporte instanceof TransporteUrgencia)) {
            System.out.println("Erro: Paciente infantil só pode ser transportado com transporte de urgência.");
        } else {
            transporte.realizarTransporte();
        }
    }
}
