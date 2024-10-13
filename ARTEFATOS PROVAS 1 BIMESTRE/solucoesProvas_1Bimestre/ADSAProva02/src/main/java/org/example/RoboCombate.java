package org.example;

public class RoboCombate extends Robo {
    private int acertosSensiveis;

    public RoboCombate(String nome, String programador, int acertosSensiveis) {
        super(nome, programador);
        this.acertosSensiveis = acertosSensiveis;
    }

    @Override
    public void competir() {
        // Simulação de competição
        System.out.println(getNome() + " está competindo na Arena de Combate.");
        int pontuacao = calcularPontuacao();
        adicionarPontuacao(pontuacao);
        System.out.println(getNome() + " acertou " + acertosSensiveis + " vezes, ganhando " + pontuacao + " pontos.");
    }

    public int calcularPontuacao() {
        return acertosSensiveis * 50;
    }

    @Override
    public String getTipo() {
        return "Combate";
    }
}
