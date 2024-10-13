package org.example;

class Notebook extends Dispositivo {
    public Notebook(String modelo, String problema) {
        super(modelo, problema);
    }

    @Override
    public String diagnosticar() {
        return "Diagnóstico: Problema no notebook detectado: " + getProblema();
    }

    @Override
    public double calcularOrcamento() {
        // Simulação de um orçamento para notebooks
        return 500.0;
    }
}
