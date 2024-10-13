package org.example;

import java.util.ArrayList;
import java.util.List;

class Estacionamento {
    private List<Vaga> vagasOcupadas = new ArrayList<>();

    public void registrarEntrada(Vaga vaga) {
        vagasOcupadas.add(vaga);
    }

    public double registrarSaida(Vaga vaga, double horaSaida) {
        double horasPermanencia = horaSaida - vaga.getHoraEntrada();
        return vaga.calcularTarifa(horasPermanencia);
    }
}
