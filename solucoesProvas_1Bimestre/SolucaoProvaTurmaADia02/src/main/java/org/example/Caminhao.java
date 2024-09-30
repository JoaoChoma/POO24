package org.example;

class Caminhao extends Veiculo {

    public Caminhao(String id) {
        super(id, 5000.0, 30.0);
    }

    @Override
    public boolean podeCarregar(double peso, double volume) {
        return peso <= 5000.0 && volume <= 30.0;
    }
}
