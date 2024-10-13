package org.example;

public class TransporteIsolamento extends Transporte {
    public TransporteIsolamento(Paciente paciente) {
        super(paciente);
    }

    @Override
    public void realizarTransporte() {
        System.out.println("Realizando transporte de isolamento para " + getPaciente().getNome() + " (" + getPaciente().getTipo() + ") com protocolos de segurança ativados.");
    }
}
