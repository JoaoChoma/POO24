package org.example;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        Vaga vagaVIP = new VagaVIP("ABC1234", 10.0);
        estacionamento.registrarEntrada(vagaVIP);

        double valorCobradoVIP = estacionamento.registrarSaida(vagaVIP, 13.0);
        System.out.println("Valor cobrado para cliente VIP: R$ " + valorCobradoVIP);

        Vaga vagaEletrica = new VagaEletrica("XYZ5678", 9.0, true);
        estacionamento.registrarEntrada(vagaEletrica);

        double valorCobradoEletrico = estacionamento.registrarSaida(vagaEletrica, 11.0);
        System.out.println("Valor cobrado para veículo elétrico: R$ " + valorCobradoEletrico);

        Vaga vagaRegular = new VagaRegular("ABC1234", 10.0);
        estacionamento.registrarEntrada(vagaRegular);

        double valorCobradoRegular = estacionamento.registrarSaida(vagaRegular, 14.0);
        System.out.println("Valor cobrado para vaga regular: R$ " + valorCobradoRegular);

    }
}