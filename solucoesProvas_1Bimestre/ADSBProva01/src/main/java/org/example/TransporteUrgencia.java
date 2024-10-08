package org.example;

public class TransporteUrgencia extends Transporte {
    public TransporteUrgencia(Paciente paciente) {
        super(paciente);
    }

    @Override
    public void realizarTransporte() {
        System.out.println("Realizando transporte de urgência para " + getPaciente().getNome() + " (" + getPaciente().getTipo() + ")");
    }
}
