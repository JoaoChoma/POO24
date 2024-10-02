package org.example;

public abstract class Dispositivo {
    private String modelo;
    private String problema;
    private String status;
    private String tecnicoResponsavel;

    public Dispositivo(String modelo, String problema) {
        this.modelo = modelo;
        this.problema = problema;
        this.status = "Aguardando diagnóstico";
    }

    public abstract String diagnosticar();

    public abstract double calcularOrcamento();

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTecnicoResponsavel() {
        return tecnicoResponsavel;
    }

    public void setTecnicoResponsavel(String tecnicoResponsavel) {
        this.tecnicoResponsavel = tecnicoResponsavel;
    }
}

