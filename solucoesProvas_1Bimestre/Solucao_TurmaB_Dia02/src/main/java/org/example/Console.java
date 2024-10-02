package org.example;

public class Console extends Dispositivo {
    public Console(String modelo, String problema) {
        super(modelo, problema);
    }

    @Override
    public String diagnosticar() {
        return "Diagnóstico: Problema no console detectado: " + getProblema();
    }

    @Override
    public double calcularOrcamento() {
        // Simulação de um orçamento para consoles
        return 350.0;
    }
}
