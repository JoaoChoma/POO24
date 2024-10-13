package org.example;

public abstract class Transporte {
    private Paciente paciente;

    public Transporte(Paciente paciente) {
        this.paciente = paciente;
    }

    public abstract void realizarTransporte();

    public Paciente getPaciente() {
        return paciente;
    }
}
