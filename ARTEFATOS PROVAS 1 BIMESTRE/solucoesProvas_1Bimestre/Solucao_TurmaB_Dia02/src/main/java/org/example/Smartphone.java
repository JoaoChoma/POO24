package org.example;

public class Smartphone extends Dispositivo {
    public Smartphone(String modelo, String problema) {
        super(modelo, problema);
    }

    @Override
    public String diagnosticar() {
        return "Diagnóstico: Problema no smartphone detectado: " + getProblema();
    }

    @Override
    public double calcularOrcamento() {
        // Simulação de um orçamento para smartphones
        return 250.0;
    }
}
