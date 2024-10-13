package org.example;

public class VagaEletrica extends Vaga {
    //private static final double TARIFA_POR_HORA = 12.0;
    //private static final double TARIFA_CARREGADOR = 5.0;
    private double tarifa;
    private double tarifaCarregador;
    private boolean usarCarregador;

    public VagaEletrica(String placa, double horaEntrada, boolean usarCarregador) {
        super(placa, horaEntrada);
        this.usarCarregador = usarCarregador;
        this.tarifa = 12;
        this.tarifaCarregador = 5;
    }

    @Override
    public double calcularTarifa(double horasPermanencia) {
        double tarifa = horasPermanencia * this.tarifa;
        if (usarCarregador) {
            tarifa += tarifaCarregador;
        }
        return tarifa;
    }
}
