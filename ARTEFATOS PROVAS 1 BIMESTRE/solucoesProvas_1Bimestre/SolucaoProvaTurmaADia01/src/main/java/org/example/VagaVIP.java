package org.example;

public class VagaVIP extends Vaga {
    // private static final double TARIFA_POR_HORA = 5.0; puta solucao de gpt
    private double tarifa;

    public VagaVIP(String placa, double horaEntrada) {
        super(placa, horaEntrada);
        this.tarifa = 5;
    }

    @Override
    public double calcularTarifa(double horasPermanencia) {
        return horasPermanencia * tarifa;
    }
}
