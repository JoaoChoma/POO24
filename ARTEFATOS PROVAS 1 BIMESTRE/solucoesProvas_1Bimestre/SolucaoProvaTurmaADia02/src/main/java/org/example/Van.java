package org.example;

public class Van extends Veiculo {

    public Van(String id) {
        super(id, 500.0, 5.0);
    }

    @Override
    public boolean podeCarregar(double peso, double volume) {
        return peso <= 500.0 && volume <= 5.0;
    }
}
