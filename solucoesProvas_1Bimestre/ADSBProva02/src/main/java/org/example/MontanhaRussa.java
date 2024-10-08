package org.example;

public class MontanhaRussa extends Atracao {
    private int idadeMinima;
    private double alturaMinima;

    public MontanhaRussa(String nome, int capacidadeMaxima, int duracaoMedia, int idadeMinima, double alturaMinima) {
        super(nome, capacidadeMaxima, duracaoMedia);
        this.idadeMinima = idadeMinima;
        this.alturaMinima = alturaMinima;
    }

    @Override
    public boolean podeAcessar(Visitante visitante) {
        return visitante.getIdade() >= idadeMinima && visitante.getAltura() >= alturaMinima;
    }
}