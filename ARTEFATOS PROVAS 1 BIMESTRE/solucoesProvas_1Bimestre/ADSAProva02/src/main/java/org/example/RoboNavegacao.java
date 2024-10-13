package org.example;

public class RoboNavegacao extends Robo {
    private int tempoParaCompletarLabirinto;

    public RoboNavegacao(String nome, String programador, int tempoParaCompletarLabirinto) {
        super(nome, programador);
        this.tempoParaCompletarLabirinto = tempoParaCompletarLabirinto;
    }

    @Override
    public void competir() {
        // Simulação de competição
        System.out.println(getNome() + " está competindo na Arena de Labirinto.");
        int pontuacao = calcularPontuacao();
        adicionarPontuacao(pontuacao);
        System.out.println(getNome() + " completou o labirinto em " + tempoParaCompletarLabirinto + " segundos, ganhando " + pontuacao + " pontos.");
    }

    public int calcularPontuacao() {
        // Quanto menor o tempo, maior a pontuação
        return 1000 / tempoParaCompletarLabirinto;
    }

    @Override
    public String getTipo() {
        return "Navegação";
    }
}

