package org.example;

class Guerreiro extends Personagem {
    private int forcaExtra;
    private int armadura;

    public Guerreiro(String nome, int nivel, int hp, int atk, int def, int forcaExtra, int armadura) {
        super(nome, nivel, hp, atk, def);
        this.forcaExtra = forcaExtra;
        this.armadura = armadura;
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = calcularDano(this.atk + this.forcaExtra, inimigo.def + this.armadura);
        inimigo.receberDano(dano);
        System.out.println(this.nome + " (Guerreiro) atacou " + inimigo.nome + " com força extra, causando " + dano + " de dano.");
    }
}

