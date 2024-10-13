package org.example;

public class PacienteInfectado extends Paciente {
    public PacienteInfectado(String nome) {
        super(nome);
    }

    @Override
    public String getTipo() {
        return "Paciente Infectado";
    }
}