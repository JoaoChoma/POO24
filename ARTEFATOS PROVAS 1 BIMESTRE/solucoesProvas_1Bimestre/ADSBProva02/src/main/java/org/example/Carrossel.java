package org.example;

public class Carrossel extends Atracao {
    public Carrossel(String nome, int capacidadeMaxima, int duracaoMedia) {
        super(nome, capacidadeMaxima, duracaoMedia);
    }

    @Override
    public boolean podeAcessar(Visitante visitante) {
        return true; // Nenhuma restrição de idade ou altura
    }
}
