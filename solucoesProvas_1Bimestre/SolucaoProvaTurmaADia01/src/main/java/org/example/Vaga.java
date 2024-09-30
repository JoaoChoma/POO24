package org.example;

public abstract class Vaga {
    private String placa;
    private double horaEntrada;
    //protected puta solucao de gpt

    public String getPlaca() {
        return placa;
    }

    public double getHoraEntrada() {
        return horaEntrada;
    }

    public Vaga(String placa, double horaEntrada) {
        this.placa = placa;
        this.horaEntrada = horaEntrada;
    }

    public abstract double calcularTarifa(double duracao);
}
