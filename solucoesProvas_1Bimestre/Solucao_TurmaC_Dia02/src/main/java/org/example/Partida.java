package org.example;

class Partida {
    private Time time1;
    private Time time2;
    private Jogador jogador1;
    private Jogador jogador2;
    private Esporte esporte;
    private boolean empate;

    // Construtor para partidas com times (futebol, basquete)
    public Partida(Time time1, Time time2, Esporte esporte) {
        this.time1 = time1;
        this.time2 = time2;
        this.esporte = esporte;
        this.empate = false;
    }

    // Construtor para partidas de tênis (individual)
    public Partida(Jogador jogador1, Jogador jogador2, Esporte esporte) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.esporte = esporte;
        this.empate = false;
    }

    public void setEmpate(boolean empate) {
        this.empate = empate;
    }

    public Esporte getEsporte() {
        return esporte;
    }

    public Time getTime1() {
        return time1;
    }

    public Time getTime2() {
        return time2;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public boolean isEmpate() {
        return empate;
    }

    // Método para registrar o resultado da partida
    public void registrarResultado(Time vencedor, Time perdedor) {
        esporte.calcularPontuacao(vencedor, perdedor, empate);
    }

    // Método para registrar resultado em partidas individuais (tênis)
    public void registrarResultado(Jogador vencedor, Jogador perdedor) {
        Time timeVencedor = new Time(vencedor.getNome());
        Time timePerdedor = new Time(perdedor.getNome());
        esporte.calcularPontuacao(timeVencedor, timePerdedor, false);
        System.out.println("Resultado registrado: Vencedor - " + vencedor.getNome() + ", Perdedor - " + perdedor.getNome());
    }
}

