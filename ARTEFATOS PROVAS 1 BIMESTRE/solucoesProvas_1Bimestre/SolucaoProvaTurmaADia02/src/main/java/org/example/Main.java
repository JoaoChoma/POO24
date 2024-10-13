package org.example;

public class Main {
    public static void main(String[] args) {
        SistemaEntrega sistema = new SistemaEntrega();

        sistema.adicionarVeiculo(new Motocicleta("Moto-1"));
        sistema.adicionarVeiculo(new Van("Van-1"));
        sistema.adicionarVeiculo(new Caminhao("Caminhao-1"));

        Encomenda encomenda1 = new Encomenda("Pacote leve", 10.0, 0.5, true);
        Encomenda encomenda2 = new Encomenda("Pacote médio", 200.0, 3.0, false);
        Encomenda encomenda3 = new Encomenda("Pacote grande", 499.0, 25.0, false);


        sistema.atribuirEncomenda(encomenda1);
        sistema.atribuirEncomenda(encomenda2);
        sistema.atribuirEncomenda(encomenda3);

        System.out.println("Status: ");
        sistema.statusFrota();
    }
}