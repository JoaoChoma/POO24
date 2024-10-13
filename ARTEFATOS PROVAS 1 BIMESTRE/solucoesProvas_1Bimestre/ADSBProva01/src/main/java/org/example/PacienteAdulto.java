package org.example;

public class PacienteAdulto extends Paciente {
    public PacienteAdulto(String nome) {
        super(nome);
    }

    @Override
    public String getTipo() {
        return "Paciente Adulto";
    }
}
