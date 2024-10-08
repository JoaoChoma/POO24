package org.example;

public class PacienteInfantil extends Paciente {
    public PacienteInfantil(String nome) {
        super(nome);
    }

    @Override
    public String getTipo() {
        return "Paciente Infantil";
    }
}
