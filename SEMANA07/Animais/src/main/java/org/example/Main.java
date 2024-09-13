package org.example;

public class Main {
    public static void main(String[] args) {

       Cavalo a = new Cavalo("Pé de pano", 10, 520, "Bege");
       a.andar();
       a.emitirSom();

       Pato p = new Pato("Goose", 12, 120, "branco");
       p.voar();
       p.nadar();
       p.andar();

    }
}