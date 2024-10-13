package org.example;

class Motocicleta extends Veiculo {

    public Motocicleta(String id) {
        super(id, 30.0, 1.0);

    }

    @Override
    public boolean podeCarregar(double peso, double volume) {
        return peso <= 30.0 && volume <= 1.0;
    }
}
