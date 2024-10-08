package org.example;

public class TransporteRotina extends Transporte {
    public TransporteRotina(Paciente paciente) {
        super(paciente);
    }

    @Override
    public void realizarTransporte() {
        System.out.println("Realizando transporte de rotina para " + getPaciente().getNome() + " (" + getPaciente().getTipo() + ")");
    }
}