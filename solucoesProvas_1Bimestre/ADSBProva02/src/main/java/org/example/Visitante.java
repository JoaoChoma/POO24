package org.example;

public abstract class Visitante {
    private String nome;
    private int idade;
    private double altura;
    private String tipoIngresso;

    public Visitante(String nome, int idade, double altura, String tipoIngresso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.tipoIngresso = tipoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public abstract String getTipo();
}
