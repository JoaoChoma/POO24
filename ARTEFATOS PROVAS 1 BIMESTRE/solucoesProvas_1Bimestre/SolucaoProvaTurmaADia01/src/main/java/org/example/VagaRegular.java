package org.example;

public class VagaRegular extends Vaga {
    // private static final double TARIFA_POR_HORA = 10.0; puta solucao de gpt
    private double tarifa;

    public VagaRegular(String placa, double horaEntrada) {
        super(placa, horaEntrada);
        this.tarifa = 12;
    }

    @Override
    public double calcularTarifa(double horasPermanencia) {
        return horasPermanencia * tarifa;
    }
}
