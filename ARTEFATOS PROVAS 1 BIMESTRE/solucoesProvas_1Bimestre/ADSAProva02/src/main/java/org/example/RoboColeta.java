package org.example;

class RoboColeta extends Robo {
    private int objetosColetados;

    public RoboColeta(String nome, String programador, int objetosColetados) {
        super(nome, programador);
        this.objetosColetados = objetosColetados;
    }

    @Override
    public void competir() {
        // Simulação de competição
        System.out.println(getNome() + " está competindo na Arena de Coleta.");
        int pontuacao = calcularPontuacao();
        adicionarPontuacao(pontuacao);
        System.out.println(getNome() + " coletou " + objetosColetados + " objetos, ganhando " + pontuacao + " pontos.");
    }

    public int calcularPontuacao() {
        return objetosColetados * 10;
    }

    @Override
    public String getTipo() {
        return "Coleta";
    }
}
